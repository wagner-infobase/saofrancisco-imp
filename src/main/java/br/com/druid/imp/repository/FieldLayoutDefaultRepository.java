package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.FieldLayoutDefault;

@RestResource(path="fieldLayoutDefaultRepository", rel="fieldLayoutDefaultRepository")
public interface FieldLayoutDefaultRepository extends PagingAndSortingRepository<FieldLayoutDefault, Long> {

}
