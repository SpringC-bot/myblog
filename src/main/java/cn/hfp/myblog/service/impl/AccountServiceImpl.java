package cn.hfp.myblog.service.impl;

import cn.hfp.myblog.mapper.AccountMapper;
import cn.hfp.myblog.pojo.Account;
import cn.hfp.myblog.service.AccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;


    @Test
    @Override
    public List<Account> findAll() {
        System.out.println("业务层，查询所有的账户信息");
        return accountMapper.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层，保存账户");
        accountMapper.saveAccount(account);
    }
}
