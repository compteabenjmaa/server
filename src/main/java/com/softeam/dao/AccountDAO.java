package com.softeam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softeam.model.AccountEntity;
@Repository
public interface AccountDAO extends JpaRepository<AccountEntity, Long> {

}
