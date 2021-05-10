package cn.hfp.myblog.mapper;

import cn.hfp.myblog.pojo.Account;

import java.util.List;

/**
 * 用户登录界面接口
 */
public interface LoginMapper {

    /**
     * 查询所有账户操作
     * @return
     */
    public List<Account> findAll();
}
