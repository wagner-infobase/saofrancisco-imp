package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.RejectedRecord;

@RestResource(path="rejectedRecordRepository",rel="rejectedRecordRepository")
public interface RejectedRecordRepository extends PagingAndSortingRepository<RejectedRecord, Long> {

}
