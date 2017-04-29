package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.ErrorAns;

@RestResource(path="errorAnsRepository", rel="errorAnsRepository")
public interface ErrorAnsRepository extends PagingAndSortingRepository<ErrorAns, Long> {

}
