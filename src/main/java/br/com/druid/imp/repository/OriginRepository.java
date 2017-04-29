package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Origin;

@RestResource(path="originRepository",rel="originRepository")
public interface OriginRepository extends PagingAndSortingRepository<Origin, Long> {

}
