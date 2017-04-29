package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.OperatorOrigin;

@RestResource(path="operatorOriginRepository",rel="operatorOriginRepository")
public interface OperatorOriginRepository extends PagingAndSortingRepository<OperatorOrigin, Long> {

}
