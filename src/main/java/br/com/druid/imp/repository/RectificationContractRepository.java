package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.RectificationContract;

@RestResource(path="rectificationContractRepository",rel="rectificationContractRepository")
public interface RectificationContractRepository extends PagingAndSortingRepository<RectificationContract, Long> {

}
