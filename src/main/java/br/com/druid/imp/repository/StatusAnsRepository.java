package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.StatusANS;

@RestResource(path="statusAnsRepository",rel="statusAnsRepository")
public interface StatusAnsRepository extends PagingAndSortingRepository<StatusANS, Long> {

}
