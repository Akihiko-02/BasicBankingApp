package com.banking.basic_banking.service.impl;

import com.banking.basic_banking.dto.AccountDto;
import com.banking.basic_banking.entity.Account;
import com.banking.basic_banking.mapper.AccountMapper;
import com.banking.basic_banking.repository.AccountRepository;
import com.banking.basic_banking.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository  accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
       Account account = AccountMapper.maptoAccount(accountDto);
       Account savedAccount = accountRepository.save(account);
       return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountByID(Long id) {
        Account account =accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account doesn't exist"));
        return AccountMapper.maptoAccountDto(account);
    }

    @Override
    public AccountDto deposit(Long id, Double amount) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account doesn't exist"));
        Double total = account.getBalance() + amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(Long id, Double amount) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account doesn't exist"));
        if(account.getBalance() < amount){
            throw new RuntimeException("Insufficient funds");
        }
        Double total = account.getBalance() - amount;
        account.setBalance(total);
        Account savedAccount = accountRepository.save(account);

        return AccountMapper.maptoAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
       List<Account> accounts = accountRepository.findAll();
       return accounts.stream().map((account)->AccountMapper.maptoAccountDto(account))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteAccount(Long id) {
        Account account = accountRepository.findById(id).orElseThrow(()-> new RuntimeException("Account doesn't exist"));
        accountRepository.delete(account);
    }

}
