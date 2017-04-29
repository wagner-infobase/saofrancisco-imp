package br.com.druid.imp.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.VwFileConfHistoryAgreg;


@RestResource(path="vwArqConfHistoricoAgregRepository", rel="vwArqConfHistoricoAgregRepository")
public interface VwArqConfHistoricoAgregRepository extends PagingAndSortingRepository<VwFileConfHistoryAgreg, Long>{

	@Query("select cr from VwFileConfHistoryAgreg cr "
			+ " where ( ?1 is null or cr.dtProcessamentoFiltro = ?1 ) and "
			+ " ( ?2 is null or cr.status =?2 ) ")	
	Page<VwFileConfHistoryAgreg> findByFilters(@Param("dtProcessamento") String  dtProcessamento,
			@Param("status") String status,
			Pageable pageable
			);
}
