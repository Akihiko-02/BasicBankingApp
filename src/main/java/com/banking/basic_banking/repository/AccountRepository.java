package com.banking.basic_banking.repository;

import com.banking.basic_banking.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {



}
