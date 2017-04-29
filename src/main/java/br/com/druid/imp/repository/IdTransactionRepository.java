package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.IdTransaction;

@RestResource(path="idTransactionRepository", rel="idTransactionRepository")
public interface IdTransactionRepository extends PagingAndSortingRepository<IdTransaction, Long> {

}
