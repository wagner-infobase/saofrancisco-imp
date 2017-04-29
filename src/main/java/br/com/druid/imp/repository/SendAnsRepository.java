package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.SendAns;

@RestResource(path="sendAnsRepository",rel="sendAnsRepository")
public interface SendAnsRepository extends PagingAndSortingRepository<SendAns, Long> {

}
