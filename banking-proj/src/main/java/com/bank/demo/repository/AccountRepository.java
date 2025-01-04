package com.bank.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.demo.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
