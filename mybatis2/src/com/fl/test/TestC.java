package com.fl.test;

import com.fl.entity.Flower;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.xml.transform.Source;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class TestC {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis2.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);
//        Flower fl = new Flower();
//        fl.setName("test2");
//        fl.setPrice(10);
//        fl.setProduction("China");
//        int insert=sqlSession.insert("com.fl.mapper.FlowerMapper3.insert",fl);
//        System.out.println(insert);
//        Map<String,Object> map = new HashMap<String, Object>();
//
//        map.put("name","test");
//        map.put("price",999);
//        map.put("production","test1");
//        map.put("id",8);
//        int update =sqlSession.update("com.fl.mapper.FlowerMapper3.update",map);
//        System.out.println(update);
        int delete=sqlSession.delete("com.fl.mapper.FlowerMapper3.delete",8);
        System.out.println(delete);


        sqlSession.close();

    }
}
