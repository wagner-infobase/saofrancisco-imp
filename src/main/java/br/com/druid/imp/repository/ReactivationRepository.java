package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.Reactivation;

@RestResource(path="reactivationRepository",rel="reactivationRepository")
public interface ReactivationRepository extends PagingAndSortingRepository<Reactivation, Long> {

}
