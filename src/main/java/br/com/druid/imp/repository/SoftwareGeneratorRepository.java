package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.SoftwareGenerator;

@RestResource(path="softwareGeneratorRepository",rel="softwareGeneratorRepository")
public interface SoftwareGeneratorRepository extends PagingAndSortingRepository<SoftwareGenerator, Long> {

}
