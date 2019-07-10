package com.qf.springBoot.controller;

import com.qf.springBoot.pojo.Account;
import com.qf.springBoot.service.AccountService;
import com.sun.org.apache.regexp.internal.RE;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

/**
 * Created by ZhangDian on 2019/7/10.
 */
@Controller
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/tranAccount",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "用户转账")
    public String tranAccount(@RequestParam Integer tid, @RequestParam Integer id, @RequestParam BigDecimal balance){
        boolean accounts = accountService.accounts(tid, id, balance);

        return accounts?"转账成功":"转账失败";
    }

    @RequestMapping(value = "/findOne1",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "根据id来查询账户信息",notes = "仅有1和2有正确返回")
    public Account finOne(@RequestParam Integer id){
        Account one = accountService.findOne(id);
        System.out.println(one);
        return one;
    }

    @RequestMapping(value = "/addOne1",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加一个账户")
    public String addOne1(@RequestBody @ApiParam Account account){
        int i = accountService.addOne(account);
        return "添加成功";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
    @ResponseBody
    @ApiOperation(value = "根据id来删除一个用户",notes = "仅有1和2有正确返回")
    public String deleteOne(@RequestParam Integer id){
        int i = accountService.deleteOne(id);
        return "删除成功";
    }
}
