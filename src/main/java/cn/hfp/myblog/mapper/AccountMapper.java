package cn.hfp.myblog.mapper;

import cn.hfp.myblog.pojo.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户mapper接口
 */
@Repository
public interface AccountMapper {

    /**
     * 查询所有账户信息
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     * @param account
     */
    @Insert("insert into account(name,money) values (#{name},#{money})")
    public void saveAccount(Account account);


}
