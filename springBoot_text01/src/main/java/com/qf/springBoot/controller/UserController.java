package com.qf.springBoot.controller;

import com.qf.springBoot.pojo.User;
import com.qf.springBoot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ZhangDian on 2019/7/8.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "查询所有用户信息",notes = "仅有1和2有正确返回")
    public String findAll(){
        List<User> all = userService.findAll();
        if (all!=null){
            System.out.println(all);
            return "查询成功";
        }
        return "查询失败";
    }
    @RequestMapping(value = "/findOne",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据id来查询该用户信息",notes = "仅有1和2有正确返回")
    @ApiImplicitParam(paramType = "query",name = "uid",value = "用户id",required = true,dataType = "Int")
    public String findOne(@RequestParam Integer uid){
        User one = userService.findOne(uid);
        if (one!=null){
            System.out.println(one);
            return "查询成功";
        }
        return "查询失败";
    }

    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(httpMethod = "POST",value = "新增用户接口",notes = "新增用户")
    public String addOne(@RequestBody @ApiParam User user){
        int i = userService.addOne(user);
        if (i==1){
            return "添加成功";
        }
        return "添加失败";
    }
    @ResponseBody
    @RequestMapping(value = "/deleteOne",method = RequestMethod.DELETE)
    @ApiOperation(value = "根据id来删除该用户信息",notes = "仅有1和2有正确返回")
    @ApiImplicitParam(paramType = "query",name = "uid",value = "用户id",required = true,dataType = "Int")
    public String deleteOne(@RequestParam Integer uid){
        int i = userService.delByUid(uid);
        if (i==1){
            return "删除成功";
        }
        return "删除失败";
    }
    @RequestMapping(value = "/ipdateOne",method = RequestMethod.PUT)
    @ResponseBody
    @ApiOperation(httpMethod = "PUT",value = "根据id来修改该用户信息",notes = "仅有1和2有正确返回")
    public String updateOne(@RequestBody @ApiParam User user){
        int i = userService.updateOne(user);
        if (i==1){
            return "修改成功";
        }
        return "修改失败";
    }

    @RequestMapping(value = "/aboutFind",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据id来查询该用户信息",notes = "仅有1和2有正确返回")
    @ApiImplicitParam(paramType = "query",name = "tiaoJian",value = "查询条件",required = true,dataType = "String")
    public String aboutFind(@RequestParam String tiaoJian){
        List<User> users = userService.adoutFind(tiaoJian);
        if (users!=null){
            System.out.println(users);
            return "查询成功";
        }
        return "查询失败";
    }
    /*@ResponseBody
    @RequestMapping(value = "/index")
    public String helloSpringBoot(){
        return "hello Spring-Boot";
    }*/

}
