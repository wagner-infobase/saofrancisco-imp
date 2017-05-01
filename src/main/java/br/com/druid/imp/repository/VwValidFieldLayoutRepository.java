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
	
/*	@Query("select vc from VwValidFieldLayout vc "
			+ " where ( ?1 is null or vc.layout_id = ?1 ) and "
			+ " ( ?2 is null or vc.campo_layout_id = ?2 ) and "
			+ " ( ?3 is null or vc.validacao_campo_id = ?3 ) and "
			+ " ( ?4 is null or vc.nome_layout  like CONCAT('%',?4,'%') ) and"
			+ " ( ?5 is null or vc.descricao_campo  like CONCAT('%',?5,'%') ) and"
			+ " ( ?6 is null or vc.numero_campo  like CONCAT('%',?6,'%') )")	
	Page<VwValidFieldLayout> findByFilters(@Param("layout_id") Long layout_id,
			@Param("campo_layout_id") Long campo_layout_id,
			@Param("validacao_campo_id") Long validacao_campo_id,
			@Param("nome_layout") String nome_layout,
			@Param("descricao_campo") String descricao_campo,
			@Param("numero_campo") Integer numero_campo,
			Pageable pageable
			);*/
}

