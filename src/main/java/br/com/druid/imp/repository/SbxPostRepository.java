package br.com.druid.imp.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.SBXPost;

@RestResource(path="sbxPostRepository",rel="sbxPostRepository")
public interface SbxPostRepository extends PagingAndSortingRepository<SBXPost, Long> {

}
