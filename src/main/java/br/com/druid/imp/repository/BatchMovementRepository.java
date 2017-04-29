package br.com.druid.imp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.BatchMovement;

@RestResource(path="batchMovementRepository", rel="batchMovementRepository")
public interface BatchMovementRepository extends PagingAndSortingRepository<BatchMovement,Long>{
	
	
	@Query(name="BatchMovement.getReportBatchMovementStatistic", 
			value="SELECT TP_MOV.DSC_MOVIMENTACAO, "
						+ "NVL(PENDENTE_ENVIO,0) AS PENDENTE_ENVIO,"
						+ "NVL(PRE_VALIDADA_OK,0) AS PRE_VALIDADA_OK, "
						+ "NVL(PRE_VALIDADA_ERRO,0) AS PRE_VALIDADA_ERRO, "
						+ "NVL(ROUND(SUM((PRE_VALIDADA_OK/PENDENTE_ENVIO)*100)),0) AS OK "
			    + "FROM ("
			    		+ "SELECT TMOV.DSC_MOVIMENTACAO, "
			    				+ "COUNT(STS.DSC_STATUS) AS PENDENTE_ENVIO,"
			    				+ "NVL(SUM(CASE CRITICA_BASICA_APROVADA WHEN 'S' THEN 1 END),0) AS PRE_VALIDADA_OK,"
			    				+ "NVL(SUM(CASE CRITICA_BASICA_APROVADA WHEN 'N' THEN 1 END),0) AS PRE_VALIDADA_ERRO "
			    		   + "FROM TP_MOVIMENTACAO TMOV "
			    	  + "LEFT JOIN MOVIMENTACAO MOV ON MOV.COD_TP_MOVIMENTACAO = TMOV.COD_TP_MOVIMENTACAO "
			    	  + "LEFT JOIN LOTE_MOVIMENTACAO LM ON LM.COD_MOVIMENTACAO = MOV.COD_MOVIMENTACAO, "
			    		   		+ "STATUS_ANS STS "
			    		  + "WHERE MOV.COD_STATUS_ANS  = STS.COD_STATUS_ANS "
			    		  		+ "AND STS.COD_STATUS_ANS = 1 "
			    		  		+ "AND LM.COD_LOTE =:batchId "
			    	  + "GROUP BY TMOV.DSC_MOVIMENTACAO"
			    	  + ") TOT_MOV_PENDENTE_ENVIO RIGHT JOIN TP_MOVIMENTACAO TP_MOV "
	      		  + "ON TP_MOV.DSC_MOVIMENTACAO = TOT_MOV_PENDENTE_ENVIO.DSC_MOVIMENTACAO "
			+ "GROUP BY TP_MOV.DSC_MOVIMENTACAO, PENDENTE_ENVIO, PRE_VALIDADA_OK, PRE_VALIDADA_ERRO", nativeQuery = true)
	List<Object[]> getReportBatchMovementStatistic(@Param("batchId")Long batchId);
	
}
