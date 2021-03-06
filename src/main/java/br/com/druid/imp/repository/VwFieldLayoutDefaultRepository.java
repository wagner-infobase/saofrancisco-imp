package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.FieldLayoutDefault;
import br.com.druid.imp.domain.VwFieldLayoutDefault;

@RestResource(path="VwFieldLayoutDefaultRepository", rel="VwFieldLayoutDefaultRepository")
public interface VwFieldLayoutDefaultRepository extends PagingAndSortingRepository<VwFieldLayoutDefault, Long> {

	@Query("select fld from VwFieldLayoutDefault fld "
			+ " where ( ?1 is null or fld.id = ?1 ) and "
			+ " ( ?2 is null or fld.nameLayout = ?2 ) and "
			+ " ( ?3 is null or fld.numberField = ?3 ) and "
			+ " ( ?4 is null or fld.descriptionField like CONCAT('%',?4,'%') ) and "
			+ " ( ?5 is null or fld.typeField like CONCAT('%',?5,'%') ) and"
			+ " ( ?6 is null or fld.lengthField = ?6 ) and "
			+ " ( ?7 is null or fld.typeInformation like CONCAT('%',?7,'%') ) and "
			+ " ( ?8 is null or fld.enable like CONCAT('%',?8,'%') ) and "
			+ " ( ?9 is null or fld.validSib like CONCAT('%',?9,'%') ) and "
			+ " ( ?10 is null or fld.validDomain like CONCAT('%',?10,'%') )")	
	Page<FieldLayoutDefault> findByFilters(@Param("id") String id,
			@Param("nameLayout") Long nameLayout,
			@Param("numberField") Long numberField,
			@Param("descriptionField") String descriptionField,
			@Param("typeField") String typeField,
			@Param("lengthField") Long lengthField,
			@Param("typeInformation") String typeInformation,
			@Param("enable") String enable,
			@Param("validSib") String validSib,
			@Param("validDomain") String validDomain,
			Pageable pageable
			);	
}
