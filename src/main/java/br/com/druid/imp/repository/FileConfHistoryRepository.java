package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.FileConfHistory;

@RestResource(path="fileConfHistoryRepository",rel="fileConfHistoryRepository")
public interface FileConfHistoryRepository extends PagingAndSortingRepository<FileConfHistory, Long> {

}
