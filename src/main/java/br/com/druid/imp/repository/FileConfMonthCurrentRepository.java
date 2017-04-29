package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.FileConfMonthCurrent;

@RestResource(path="fileConfMonthCurrentRepository",rel="fileConfMonthCurrentRepository")
public interface FileConfMonthCurrentRepository extends PagingAndSortingRepository<FileConfMonthCurrent, Long> {

}
