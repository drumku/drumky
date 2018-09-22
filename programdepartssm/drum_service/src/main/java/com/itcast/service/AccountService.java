package com.itcast.service;

import com.itcast.dao.AccountMapper;
import com.itcast.domain.Account;



import java.util.List;

public interface AccountService {
    /**
     * 查询所有
     * @return
     */
    List<AccountMapper> findAll();

    /**
     * 通过id查询一个
     * @param id
     * @return
     */
    Account findOne(int id);

    /**
     * 删除方法
     * @param id
     * @return
     */
    int delAccount(int id);

    /**
     * 更新
     * @param account
     * @return
     */
    int updateAccount(Account account);

    /**
     * 添加
     * @param account
     * @return
     */
    int addAccount(Account account);
}
