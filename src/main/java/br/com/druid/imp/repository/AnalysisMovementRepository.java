package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.AnalysisMovement;

@RestResource(path="analysisMovementRepository", rel="analysisMovementRepository")
public interface AnalysisMovementRepository extends PagingAndSortingRepository<AnalysisMovement,Long> {

}
