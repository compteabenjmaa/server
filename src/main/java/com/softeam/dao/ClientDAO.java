package com.softeam.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softeam.model.ClientEntity;
@Repository
public interface ClientDAO extends JpaRepository<ClientEntity, Long> {

	Optional<ClientEntity> findById(String id);
}
