package com.qf.springBoot.service.impl;

import com.qf.springBoot.dao.ds2.UserMapper;
import com.qf.springBoot.pojo.User;
import com.qf.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by ZhangDian on 2019/7/8.
 */
@Service
@Transactional(value = "ds2transactionManager",rollbackFor = {Exception.class})
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        List<User> all = userMapper.findAll();
        return all;
    }

    @Override
    public User findOne(int uid) {
        User one = userMapper.findOne(uid);
        return one;
    }

    @Override
    public int addOne(User user) {
        int i = userMapper.addOne(user);
        return i;
    }

    @Override
    public int delByUid(int uid) {
        int i = userMapper.delByUid(uid);
        return i;
    }

    @Override
    public int updateOne(User user) {
        int i = userMapper.updateOne(user);
        return i;
    }

    @Override
    public List<User> adoutFind(String tioaJian) {
        List<User> users = userMapper.adoutFind(tioaJian);
        return users;
    }
}
