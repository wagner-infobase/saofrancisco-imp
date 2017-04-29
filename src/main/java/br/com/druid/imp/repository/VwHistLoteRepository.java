package br.com.druid.imp.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.druid.imp.domain.VwHistLote;

@RestResource(path="vwHistLoteRepository", rel="vwHistLoteRepository")
public interface VwHistLoteRepository extends PagingAndSortingRepository<VwHistLote, Long> {
	
	
	@Query("select cr from VwHistLote cr "
			+ " where "
			+ " ( ?1 is null or cr.nroLote = ?1 ) and "
			+ " ( ?2 is null or cr.movimentacoes = ?2) and "
			+ " ( ?3 is null or cr.de >= ?3) and "
			+ " ( ?4 is null or cr.ate <= ?4) and "
			+ " ( ?5 is null or cr.statusRetornoAns =?5) ")	
	Page<VwHistLote> findByFilters(
			@Param("nroLote") Long nroLote,
			@Param("movimentacoes") String movimentacoes,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("de") Date de,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("ate") Date ate,
			@Param("statusRetornoAns") String statusRetornoAns,
			Pageable pageable
			);

}
