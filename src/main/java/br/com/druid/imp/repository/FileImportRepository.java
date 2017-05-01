package br.com.druid.imp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import br.com.druid.imp.domain.FileImport;

@RestResource(path="fileImportRepository", rel="fileImportRepository")
public interface FileImportRepository extends PagingAndSortingRepository<FileImport, Long> {

	@Query("select fi from FileImport fi "
			+ " where ( ?1 is null or fi.id = ?1 ) and "
			+ " ( ?2 is null or fi.name like CONCAT('%',?2,'%') ) and "
			+ " ( ?3 is null or fi.link like CONCAT('%',?3,'%') ) ")	
	Page<FileImport> findByFilters(@Param("id") Long id,
			@Param("name") String name,
			@Param("link") String link,
			Pageable pageable
			);

	
}
