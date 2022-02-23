package com.fl.test;


import com.fl.entity.Flower;
import com.fl.mapper.FlowerMapper;
import com.fl.mapper.FlowerMapper2;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class TestB {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis3.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);
        //mapper代理
        FlowerMapper2 mapper = sqlSession.getMapper(FlowerMapper2.class);
//        List<Flower> list = mapper.selectMore2("玫瑰花", "");
//        System.out.println(list);

//        List<Integer>list = new ArrayList<Integer>();
//        list.add(1);
//        list.add(2);
//        List<Flower> list1 = mapper.selectMore(list);
//        System.out.println(list1);
        sqlSession.close();

    }
}
