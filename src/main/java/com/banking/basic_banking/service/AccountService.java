package com.banking.basic_banking.service;

import com.banking.basic_banking.dto.AccountDto;
import com.banking.basic_banking.entity.Account;

import java.util.List;

public interface AccountService {
    AccountDto createAccount(AccountDto account);
    AccountDto getAccountByID(Long id);
    AccountDto deposit(Long id, Double amount);
    AccountDto withdraw(Long id, Double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
