package br.com.druid.imp.repository;

import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.format.annotation.DateTimeFormat;

import br.com.druid.imp.domain.VwMovement;



@RestResource(path="vwMovimentacaoRepository", rel="vwMovimentacaoRepository")
public interface VwMovimentacaoRepository extends PagingAndSortingRepository<VwMovement, Long>{

	@Query("select cr from VwMovement cr "
			+ " where ( ?1 is null or cr.id = ?1 ) and "
			+ " ( ?2 is null or cr.movimentacao like CONCAT('%',?2,'%') ) and "
			+ " ( ?3 is null or cr.cpf = ?3) and "
			+ " ( ?4 is null or cr.codIdentBenefcOper = ?4) and "
			+ " ( ?5 is null or cr.nmBeneficiario like CONCAT('%',?5,'%') ) and "
			+ " ( ?6 is null or cr.cco = ?6) and "
			+ " ( ?7 is null or cr.nroCns = ?7) and "
			+ " ( ?8 is null or cr.cod = ?8) and "
			+ " ( ?9 is null or cr.dsc = ?9) and "
			+ " ( ?10 is null or cr.preValidacao = ?10) and "
			+ " ( ?11 is null or cr.preValidacaoStatus = ?11) and "
			+ " ( ?12 is null or cr.dtParaFiltroIniFim = ?12) and "
			+ " ( ?13 is null or cr.mesRefFormatNumber = ?13) and "
			+ " ( ?14 is null or cr.mesRefFormatName = ?14) and "
			+ " ( ?15 is null or cr.diasAns = ?15) and "
			+ " ( ?16 is null or cr.errosAns =?16) and "
			+ " ( ?17 is null or cr.dtParaFiltroIniFim >= ?17) and "
			+ " ( ?18 is null or cr.dtParaFiltroIniFim <= ?18) ")
	Page<VwMovement> findByFilters(@Param("id") Long  id,
			@Param("movimentacao") String movimentacao,
			@Param("cpf") String cpf,
			@Param("codIdentBenefcOper") String codIdentBenefcOper,
			@Param("nmBeneficiario") String nmBeneficiario,
			@Param("cco") String cco,
			@Param("nroCns") String nroCns,
			@Param("cod") String cod,
			@Param("dsc") String dsc,
			@Param("preValidacao") String preValidacao,
			@Param("preValidacaoStatus") String preValidacaoStatus,
			@DateTimeFormat(pattern = "dd/MM/yyyy") @Param("dtParaFiltroIniFim") Date dtParaFiltroIniFim,			
			@Param("mesRefFormatNumber") String mesRefFormatNumber,
			@Param("mesRefFormatName") String mesRefFormatName,
			@Param("diasAns") String diasAns,
			@Param("errosAns") String errosAns,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("dtInicio") Date dtInicio,
			@DateTimeFormat(pattern = "yyyy-MM-dd") @Param("dtFim") Date dtFim,
			Pageable pageable
			);
}
