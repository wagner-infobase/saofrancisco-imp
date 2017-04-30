package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.FieldLayoutDefault;

@RestResource(path="fieldLayoutDefaultRepository", rel="fieldLayoutDefaultRepository")
public interface FieldLayoutDefaultRepository extends PagingAndSortingRepository<FieldLayoutDefault, Long> {

	@Query("select fld from FieldLayoutDefault fld "
			+ " where ( ?1 is null or fld.id = ?1 ) and "
			+ " ( ?2 is null or fld.numberField = ?2 ) and "
			+ " ( ?3 is null or fld.descriptionField like CONCAT('%',?3,'%') ) and "
			+ " ( ?4 is null or fld.typeField like CONCAT('%',?4,'%') ) and"
			+ " ( ?5 is null or fld.lengthField = ?5 ) and "
			+ " ( ?6 is null or fld.typeInformation like CONCAT('%',?6,'%') ) and "
			+ " ( ?7 is null or fld.enable like CONCAT('%',?7,'%') )")	
	Page<FieldLayoutDefault> findByFilters(@Param("id") String id,
			@Param("numberField") Long numberField,
			@Param("descriptionField") String descriptionField,
			@Param("typeField") String typeField,
			@Param("lengthField") Long lengthField,
			@Param("typeInformation") String typeInformation,
			@Param("enable") String enable,
			Pageable pageable
			);
	
}
