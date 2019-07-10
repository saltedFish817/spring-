package com.qf.springBoot.service;

import com.qf.springBoot.pojo.Account;

import java.math.BigDecimal;

/**
 * Created by ZhangDian on 2019/7/10.
 */
public interface AccountService {

    public boolean accounts(int tid,int id,BigDecimal balance);

    public Account findOne(int id);

    public int addOne(Account account);

    public int deleteOne(int id);

}
