package com.endava.ticketmanagement.service;

import com.endava.ticketmanagement.model.Account;
import com.endava.ticketmanagement.repository.AccountRepository;

import java.util.List;

public class AccountService {
    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        System.out.println(accountRepository);
        System.out.println("Creating Account Service");
    }

    public String getAccount(String accountId){
        if(accountId.equals("0")){
            return "No information for this account";
        }
        Account account  = accountRepository.getAccount(accountId);
        if(account!= null){
            return account.toString();
        } else{
            return  "Account does not exist";
        }

    }

    public List<Account> getAccounts(){
        return accountRepository.getAccounts();
    }
}
