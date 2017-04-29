package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.TypeMovement;

@RestResource(path="typeMovementRepository",rel="typeMovementRepository")
public interface TypeMovementRepository extends PagingAndSortingRepository<TypeMovement, Long> {

}
