package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.TypeBatch;

@RestResource(path="typeBatchRepository",rel="typeBatchRepository")
public interface TypeBatchRepository extends PagingAndSortingRepository<TypeBatch, Long> {

}
