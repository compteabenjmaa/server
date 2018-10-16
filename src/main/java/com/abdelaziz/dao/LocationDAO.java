package com.abdelaziz.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.abdelaziz.model.Location;

public interface LocationDAO extends PagingAndSortingRepository<Location, Long> {

}
