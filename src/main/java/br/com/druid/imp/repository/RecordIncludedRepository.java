package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.RecordIncluded;

@RestResource(path="recordIncludedRepository",rel="recordIncludedRepository")
public interface RecordIncludedRepository extends PagingAndSortingRepository<RecordIncluded, Long> {

}
