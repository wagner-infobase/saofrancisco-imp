package br.com.druid.imp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Movement;

@RestResource(path="movementRepository",rel="movementRepository")
public interface MovementRepository extends PagingAndSortingRepository<Movement, Long> {
	
	@Query("SELECT m "
		  + "FROM Movement m left join m.batchMovement bm "
		 + "WHERE m.typeMovement.id=:typeMovementId "
		   + "and bm.batch.id=:batchId")
	List<Movement>findByTypeMovementAndBatchMovementByBatch(@Param("typeMovementId")Long typeMovementId, @Param("batchId") Long batchId);
	
	@Query(nativeQuery=true, 
		value="SELECT  b.DT_NASCIMENTO as dataNascimento, "
					+ "b.PIS_PASEP as pisPasep, "
					+ "b.SEXO as sexo, "
					+ "b.DT_INCLUSAO as dtInclusao,"
					+ "ea.DT_INCLUSAO as dtInclusaoErro, "
					+ "ea.COD_ERRO as codErro, "
					+ "ea.MSG_ERRO as erro, "
					+ "ea.MSG_ERRO_DETALHE as detalheErro, "
					+ "ea.ACAO_CORRECAO as acaoCorrecao, "
					+ "ca.ID_CAMPO as idCampo, "
					+ "ca.NM_CAMPO as nomeCampo "
			+ "FROM movimentacao m "
				 + "LEFT JOIN beneficiario b "
				 	  + "ON m.cod_movimentacao=b.cod_movimentacao "
				 + "LEFT JOIN criticas_movimentacao cm "
				 	  + "ON m.cod_movimentacao=cm.cod_movimentacao "
				 + "LEFT JOIN erro_ans ea "
				 	  + "ON cm.cod_erro_ans=ea.cod_erro_ans "
				 + "LEFT JOIN critica_ans ca "
				 	  + "ON ea.COD_CRITICA_ANS = ca.COD_CRITICA_ANS "
		  + "WHERE m.cod_movimentacao=:movementId")
	List<Object[]> findDetailByMovementId(@Param("movementId")Long movementId);

}
