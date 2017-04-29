package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.ConsolidatedProcessing;

@RestResource(path="consolidatedProcessingRepository", rel="consolidatedProcessingRepository")
public interface ConsolidatedProcessingRepository extends PagingAndSortingRepository<ConsolidatedProcessing, Long> {

}
