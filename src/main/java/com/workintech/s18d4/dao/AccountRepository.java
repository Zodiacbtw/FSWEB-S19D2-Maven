package com.workintech.s18d4.dao;

import com.workintech.s18d4.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Integer> {
}