package com.abdelaziz.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.abdelaziz.model.Client;

public interface ClientDAO extends PagingAndSortingRepository<Client, Long> {

}
