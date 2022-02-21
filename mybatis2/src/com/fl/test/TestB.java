package com.fl.test;

import com.fl.entity.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestB {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis2.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        Flower fl = sqlSession.selectOne("com.fl.mapper.FlowerMapper2.selectOne2",1);
        Flower fl2 = new Flower();
        fl2.setId(1);
        fl2.setName("玫瑰花");
        Flower fl3 = sqlSession.selectOne("com.fl.mapper.FlowerMapper2.selectOne3",fl2);
        Map<String,Object>map = new HashMap<String, Object>();
        map.put("a",1);
        map.put("b","玫瑰花");
        Flower fl4 = sqlSession.selectOne("com.fl.mapper.FlowerMapper2.selectOne4",map);
        System.out.println(fl);
        System.out.println(fl3);
        System.out.println(fl4);
        sqlSession.close();

    }
}
