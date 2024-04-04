package com.abhay.bankapplication.service;

import com.abhay.bankapplication.dto.AccountDto;
import com.abhay.bankapplication.entity.Account;

import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);

    AccountDto getAccountById(Long id);
    AccountDto deposit(Long id, Double amount);
    AccountDto withdraw(Long id, Double amount);
    List<AccountDto> getAllAccounts();
}
