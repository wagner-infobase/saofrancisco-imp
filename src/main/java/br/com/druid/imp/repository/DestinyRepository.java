package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Destiny;

@RestResource(path="destiny",rel="destiny")
public interface DestinyRepository extends PagingAndSortingRepository<Destiny, Long> {

}
