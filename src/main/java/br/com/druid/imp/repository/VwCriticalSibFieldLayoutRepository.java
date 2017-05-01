package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.VwCriticalSibFieldLayout;

@RestResource(path="vwCriticalSibFieldLayoutRepository", rel="vwCriticalSibFieldLayoutRepository")
public interface VwCriticalSibFieldLayoutRepository extends PagingAndSortingRepository<VwCriticalSibFieldLayout, Long> {

	@Query("select cs from VwCriticalSibFieldLayout cs "
			+ " where ( ?1 is null or cs.layoutId = ?1 ) and "
			+ " ( ?2 is null or cs.fieldLayoutId = ?2 ) and "
			+ " ( ?3 is null or cs.criticalSibFieldId = ?3 ) and "
			+ " ( ?4 is null or cs.nameLayout  like CONCAT('%',?4,'%') ) and"
			+ " ( ?5 is null or cs.descriptionField  like CONCAT('%',?5,'%') ) and"
			+ " ( ?6 is null or cs.numberField  like CONCAT('%',?6,'%') )")	
	Page<VwCriticalSibFieldLayout> findByFilters(@Param("layoutId") Long layoutId,
			@Param("fieldLayoutId") Long fieldLayoutId,
			@Param("criticalSibFieldId") Long criticalSibFieldId,
			@Param("nameLayout") String nameLayout,
			@Param("descriptionField") String descriptionField,
			@Param("numberField") Integer numberField,
			Pageable pageable
			);

}
