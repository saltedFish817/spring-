package com.qf.springBoot.dao.ds1;

import com.qf.springBoot.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * Created by ZhangDian on 2019/7/10.
 */
@Mapper
public interface AccountMapper {

    public int toTranAccount(@Param("tid") int tid,@Param("balance") BigDecimal balance);
    public int tranAccount(@Param("id") int id,@Param("balance") BigDecimal balance);

    public Account findOne(int id);

    public int addOne(Account account);

    public int deleteOne(int id);
}
