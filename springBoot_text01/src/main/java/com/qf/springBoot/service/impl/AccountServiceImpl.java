package com.qf.springBoot.service.impl;

import com.qf.springBoot.dao.ds1.AccountMapper;
import com.qf.springBoot.pojo.Account;
import com.qf.springBoot.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * Created by ZhangDian on 2019/7/10.
 */
@Service
@Transactional(value = "ds1transactionManager",rollbackFor = {Exception.class})
public class AccountServiceImpl implements AccountService{

    @Resource
    private AccountMapper accountMapper;

    @Override
    public boolean accounts(int tid, int id, BigDecimal balance) {
        int i = accountMapper.toTranAccount(tid, balance);
        //int a=1/0;
        int i1 = accountMapper.tranAccount(id, balance);
        return i>0 && i1>0?true:false;
    }

    @Override
    public Account findOne(int id) {
        Account one = accountMapper.findOne(id);
        return one;
    }

    @Override
    public int addOne(Account account) {
        int i = accountMapper.addOne(account);
        return i;
    }

    @Override
    public int deleteOne(int id) {
        int i = accountMapper.deleteOne(id);
        return i;
    }
}
