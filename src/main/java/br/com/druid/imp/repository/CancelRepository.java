package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Cancel;

@RestResource(path="cancelRepository", rel="cancelRepository")
public interface CancelRepository extends PagingAndSortingRepository<Cancel, Long> {

}
