package cn.hfp.myblog.test;

import cn.hfp.myblog.mapper.LoginMapper;
import cn.hfp.myblog.pojo.Account;
import cn.hfp.myblog.service.AccountService;
import cn.hfp.myblog.service.impl.LoginServiceImpl;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TestLogin {

    @Autowired
    private AccountService accountService;

    @Test
    public void baocun(){
        List<Account> all = accountService.findAll();
        System.out.println(all);
    }



}
