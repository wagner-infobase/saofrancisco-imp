package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.ConsolidatedErrorProcessing;

@RestResource(path="consolidatedErrorProcessingRepository", rel="consolidatedErrorProcessingRepository")
public interface ConsolidatedErrorProcessingRepository
		extends PagingAndSortingRepository<ConsolidatedErrorProcessing, Long> {

}
