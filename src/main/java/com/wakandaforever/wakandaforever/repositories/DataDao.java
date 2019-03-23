package com.wakandaforever.wakandaforever.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wakandaforever.wakandaforever.models.Data;

@Repository
public interface DataDao extends CrudRepository<Data, Long> {
	
	@Query(
			value = "SELECT * FROM data ORDER BY created_at DESC", nativeQuery = true
		)
	List<Data> findAllSortedByDate(Pageable page);
}
