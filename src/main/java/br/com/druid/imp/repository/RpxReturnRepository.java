package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.RPXReturn;

@RestResource(path="rpxReturnRepository",rel="rpxReturnRepository")
public interface RpxReturnRepository extends PagingAndSortingRepository<RPXReturn, Long> {

}
