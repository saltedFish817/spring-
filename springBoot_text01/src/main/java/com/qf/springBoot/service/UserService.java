package com.qf.springBoot.service;

import com.qf.springBoot.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangDian on 2019/7/8.
 */
public interface UserService {

    public List<User> findAll();

    public User findOne(int uid);

    public int addOne(User user);

    public int delByUid(int uid);

    public int updateOne(User user);

    public List<User> adoutFind(@Param("tiaoJian") String tioaJian);

}
