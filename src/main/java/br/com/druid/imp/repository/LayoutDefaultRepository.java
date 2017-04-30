package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.LayoutDefault;

@RestResource(path="layoutDefaultRepository", rel="layoutDefaultRepository")
public interface LayoutDefaultRepository extends PagingAndSortingRepository<LayoutDefault, Long> {

}
