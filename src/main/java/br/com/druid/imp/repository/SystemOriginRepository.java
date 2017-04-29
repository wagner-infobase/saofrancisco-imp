package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.SystemOrigin;

@RestResource(path="systemOriginRepository",rel="systemOriginRepository")
public interface SystemOriginRepository extends PagingAndSortingRepository<SystemOrigin, Long> {

}
