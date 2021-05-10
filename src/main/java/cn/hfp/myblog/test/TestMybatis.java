package cn.hfp.myblog.test;

import cn.hfp.myblog.mapper.AccountMapper;
import cn.hfp.myblog.pojo.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {
    /*测试查询*/
    @Test
    public void run1() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        AccountMapper mapper = session.getMapper(AccountMapper.class);
        List<Account> all = mapper.findAll();
        System.out.println(all);

        session.close();
        is.close();
    }

    /*测试保存*/
    @Test
    public void run2() throws IOException {
        Account account = new Account();
        account.setName("lisi");
        account.setMoney(400.0);
        account.setId(10);

        InputStream is = Resources.getResourceAsStream("mybatis/mybatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession(true);
        AccountMapper mapper = session.getMapper(AccountMapper.class);

        mapper.saveAccount(account);
        session.commit();

        session.close();
        is.close();
    }
}
