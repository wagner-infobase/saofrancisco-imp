package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.CriticalAns;

@RestResource(path="criticalAnsRepository", rel="criticalAnsRepository")
public interface CriticalAnsRepository extends PagingAndSortingRepository<CriticalAns,Long> {

}
