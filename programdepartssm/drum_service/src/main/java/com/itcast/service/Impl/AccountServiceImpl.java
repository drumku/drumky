package com.itcast.service.Impl;

import com.itcast.dao.AccountMapper;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountMapper accountMapper;
    public List<AccountMapper> findAll() {
        return accountMapper.findAll();
    }

    public Account findOne(int id) {
        return accountMapper.findOne(id);
    }

    public int delAccount(int id) {
        return accountMapper.delAccount(id);
    }

    public int updateAccount(Account account) {
        return accountMapper.updateAccount(account);
    }

    public int addAccount(Account account) {
        return 0;
    }
}
