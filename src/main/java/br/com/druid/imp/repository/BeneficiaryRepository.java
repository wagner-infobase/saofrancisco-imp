package br.com.druid.imp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Beneficiary;

@RestResource(path="beneficiaryRepository", rel="beneficiaryRepository")
public interface BeneficiaryRepository extends PagingAndSortingRepository<Beneficiary, Long> {

	@Query("SELECT b "
			+ "FROM Beneficiary b, BatchMovement bm "
		   + "WHERE b.movement.id = bm.movement.id "
		   	 	 + "AND b.movement.typeMovement.id =1 "
		   	 	 + "AND bm.batch.id =:codBatch")
	List<Beneficiary> findByCodBatchAndTypeMovement(@Param("codBatch")Long codBatch);
}
