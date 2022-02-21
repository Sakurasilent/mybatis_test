package com.fl.test;

import com.fl.entity.Flower;
import com.fl.mapper.FlowerMapper4;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestD {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis2.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);
        //mapper代理

        FlowerMapper4 mapper = sqlSession.getMapper(FlowerMapper4.class);
//        List<Flower> list = mapper.selectAll();
//        System.out.println(list);
        Flower fl = new Flower();
        fl.setName("test");
        fl.setPrice(123);
        fl.setProduction("test");
        int insert = mapper.insert(fl);
        System.out.println(insert);
        sqlSession.close();

    }
}
