package com.abdelaziz.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.abdelaziz.model.Location;
@Repository
public interface LocationDAO extends PagingAndSortingRepository<Location, Long> {

}
