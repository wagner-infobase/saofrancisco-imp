package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.RectificationBenefEnd;

@RestResource(path="rectificationBenefEndRepository",rel="rectificationBenefEndRepository")
public interface RectificationBenefEndRepository extends PagingAndSortingRepository<RectificationBenefEnd, Long> {

}
