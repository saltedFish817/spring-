package com.qf.springBoot.dao.ds2;

import com.qf.springBoot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by ZhangDian on 2019/7/8.
 */
@Mapper
public interface UserMapper {

    public List<User> findAll();

    public User findOne(int uid);

    public int addOne(User user);

    public int delByUid(int uid);

    public int updateOne(User user);

    public List<User> adoutFind(@Param("tiaoJian") String tioaJian);
}
