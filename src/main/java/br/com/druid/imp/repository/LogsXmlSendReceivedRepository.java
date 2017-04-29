package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.LogsXmlSendReceived;

@RestResource(path="logsXmlSendReceivedRepository",rel="logsXmlSendReceivedRepository")
public interface LogsXmlSendReceivedRepository extends PagingAndSortingRepository<LogsXmlSendReceived, Long> {

}
