package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.VwAnalisysAns;

@RestResource(path="vwCriticalAnsRepository", rel="vwCriticalAnsRepository")
public interface VwCriticalAnsRepository extends PagingAndSortingRepository<VwAnalisysAns, Long> {

	
	@Query("select cr from VwAnalisysAns cr "
			+ " where ( ?1 is null or cr.fieldId = ?1 ) and "
			+ " ( ?2 is null or cr.fieldName like CONCAT('%',?2,'%') ) and "
			+ " ( ?3 is null or cr.detailMessage like CONCAT('%',?3,'%') ) and "
			+ " ( ?4 is null or cr.errorMessage  like CONCAT('%',?4,'%') ) and"
			+ " ( ?5 is null or cr.errorCode = ?5 ) and "
			+ " ( ?6 is null or cr.actionCorrection like CONCAT('%',?6,'%') )")	
	Page<VwAnalisysAns> findByFilters(@Param("fieldId") String fieldId,
			@Param("fieldName") String fieldName,
			@Param("detailMessage") String detailMessage,
			@Param("errorMessage") String errorMessage,
			@Param("errorCode") Integer errorCode,
			@Param("actionCorrection") String actionCorrection,
			Pageable pageable
			);
	
}
