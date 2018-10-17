package com.abdelaziz.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.abdelaziz.model.Client;
@Repository
public interface ClientDAO extends PagingAndSortingRepository<Client, Long> {

}
