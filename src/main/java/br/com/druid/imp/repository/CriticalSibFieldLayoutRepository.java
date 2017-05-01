package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.CriticalSibFieldLayout;


@RestResource(path="criticalSibFieldLayoutRepository", rel="criticalSibFieldLayoutRepository")
public interface CriticalSibFieldLayoutRepository extends PagingAndSortingRepository<CriticalSibFieldLayout, Long>{
	
}
