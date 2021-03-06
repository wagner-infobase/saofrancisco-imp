package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.VwRequiredFieldLayout;

@RestResource(path="VwRequiredFieldLayoutRepository", rel="VwRequiredFieldLayoutRepository")
public interface VwRequiredFieldLayoutRepository extends PagingAndSortingRepository<VwRequiredFieldLayout, Long> {
	
	@Query("select vc from VwRequiredFieldLayout vc "
			+ " where ( ?1 is null or vc.layoutId = ?1 ) and "
			+ " ( ?2 is null or vc.fieldLayoutId = ?2 ) and "
			+ " ( ?3 is null or vc.requiredFieldId = ?3 ) and "
			+ " ( ?4 is null or vc.nameLayout  like CONCAT('%',?4,'%') ) and"
			+ " ( ?5 is null or vc.descriptionField  like CONCAT('%',?5,'%') ) and"
			+ " ( ?6 is null or vc.numberField  like CONCAT('%',?6,'%') )")	
	Page<VwRequiredFieldLayout> findByFilters(@Param("layoutId") Long layoutId,
			@Param("fieldLayoutId") Long fieldLayoutId,
			@Param("requiredFieldId") Long requiredFieldId,
			@Param("nameLayout") String nameLayout,
			@Param("descriptionField") String descriptionField,
			@Param("numberField") Integer numberField,
			Pageable pageable
			);
}

