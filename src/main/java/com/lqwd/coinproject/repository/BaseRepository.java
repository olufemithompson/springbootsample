package com.lqwd.coinproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T, Long> extends CrudRepository<T, Long> {

	@Override
	List<T> findAll();

}