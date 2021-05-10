package cn.hfp.myblog.service;

import cn.hfp.myblog.pojo.Account;

import java.util.List;

/**
 * 业务层接口
 */
public interface AccountService {
    /**
     * 查询所有账户信息
     * @return
     */
     List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
     void saveAccount(Account account);

}
