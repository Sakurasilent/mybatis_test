package com.fl.test;

import com.fl.entity.Flower;
import com.fl.mapper.FlowerMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestA {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis3.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);
        //mapper代理
        FlowerMapper mapper = sqlSession.getMapper(FlowerMapper.class);
        Flower flower = new Flower();
        flower.setName("火树银花");
        flower.setProduction("China");
        flower.setId(11);
        int update = mapper.update(flower);
        System.out.println(update);
//        List<Flower> list = mapper.selectMore2("", "");
//        List<Flower> list = mapper.selectMore("", "");
//        System.out.println(list);
        sqlSession.close();
    }
}
