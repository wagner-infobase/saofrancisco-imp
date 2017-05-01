package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.RequiredFieldLayout;

@RestResource(path="requiredFieldLayoutRepository",rel="requiredFieldLayoutRepository")
public interface RequiredFieldLayoutRepository extends PagingAndSortingRepository<RequiredFieldLayout, Long>  {
	

}
