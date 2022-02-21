package com.fl.test;

import com.fl.entity.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

public class TestA {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis2.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        List<Flower> list = 
                sqlSession.selectList("com.fl.mapper.FlowerMapper.selectAll");
        Flower fl = sqlSession.selectOne("com.fl.mapper.FlowerMapper.selectOne");
        Map<Object, Object> map = sqlSession.selectMap("com.fl.mapper.FlowerMapper.selectMore", "ID");
        System.out.println(map);
        Object fl2 =map.get(2);
//        System.out.println(list);
//        System.out.println(fl);
        System.out.println(fl2);
        sqlSession.close();

    }
}
