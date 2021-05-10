package cn.hfp.myblog.service.impl;

import cn.hfp.myblog.mapper.AccountMapper;
import cn.hfp.myblog.pojo.Account;
import cn.hfp.myblog.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 账户登录业务层实现类
 */
@Service("LoginService")
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public void findAll() {
        List<Account> all = accountMapper.findAll();
        System.out.println(all);
    }
}
