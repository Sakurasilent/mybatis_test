package com.fl.test;

import com.fl.entity.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestA {
    public static void main(String[] args) throws IOException {
        //解析Mybatis.xml
        InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = factory.openSession();
        List<Flower> list = sqlSession.selectList("com.fl.mapper.FlowerMapper.selectAll");
        System.out.println(list);
        //关闭资源
        sqlSession.close();

    }
}
