package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.VwValidFieldLayout;

@RestResource(path="vwValidFieldLayoutRepository", rel="vwValidFieldLayoutRepository")
public interface VwValidFieldLayoutRepository extends PagingAndSortingRepository<VwValidFieldLayout, Long> {
	
	@Query("select vc from VwValidFieldLayout vc "
			+ " where ( ?1 is null or vc.layoutId = ?1 ) and "
			+ " ( ?2 is null or vc.campoLayoutId = ?2 ) and "
			+ " ( ?3 is null or vc.validacaoCampoId = ?3 ) and "
			+ " ( ?4 is null or vc.nomeLayout  like CONCAT('%',?4,'%') ) and"
			+ " ( ?5 is null or vc.descricaoCampo  like CONCAT('%',?5,'%') ) and"
			+ " ( ?6 is null or vc.numeroCampo  like CONCAT('%',?6,'%') )")	
	Page<VwValidFieldLayout> findByFilters(@Param("layoutId") Long layoutId,
			@Param("campoLayoutId") Long campoLayoutId,
			@Param("validacaoCampoId") Long validacaoCampoId,
			@Param("nomeLayout") String nomeLayout,
			@Param("descricaoCampo") String descricaoCampo,
			@Param("numeroCampo") Integer numeroCampo,
			Pageable pageable
			);
}

