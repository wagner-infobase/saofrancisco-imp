package br.com.druid.imp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Batch;

@RestResource(path="batchRepository", rel="batchRepository")
public interface BatchRepository extends PagingAndSortingRepository<Batch,Long>{
	
	@Query(name="BatchRepository.getSequenceNroLote", value="SELECT SQ_NRO_LOTE.nextval FROM dual", nativeQuery=true)
	Long getSequenceNroLote();
}
