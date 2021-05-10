package cn.hfp.myblog.test;

import cn.hfp.myblog.pojo.Account;
import cn.hfp.myblog.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestSpring {
    @Test
    public void run1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
        AccountService as = (AccountService) ac.getBean("accountService");
        List<Account> all = as.findAll();
        System.out.println(all);

    }
}
