package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.LayoutDefault;

@RestResource(path="layoutDefaultRepository", rel="layoutDefaultRepository")
public interface LayoutDefaultRepository extends PagingAndSortingRepository<LayoutDefault, Long> {
	
	@Query("select ld from LayoutDefault ld "
			+ " where ( ?1 is null or ld.id = ?1 ) and "
			+ " ( ?2 is null or ld.name like CONCAT('%',?2,'%') ) ")	
	Page<LayoutDefault> findByFilters(@Param("id") Long id,
			@Param("name") String name,
			Pageable pageable
			);

}
