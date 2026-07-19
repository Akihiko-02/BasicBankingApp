package com.banking.basic_banking.mapper;

import com.banking.basic_banking.dto.AccountDto;
import com.banking.basic_banking.entity.Account;

public class AccountMapper {
    public static Account maptoAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return account;
    }
    public static AccountDto maptoAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccoundHolderName(),
        account.getBalance()
        );
    return  accountDto;
    }
}
