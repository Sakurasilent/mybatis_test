package com.fl.test;

import com.fl.entity.Clazz;
import com.fl.entity.Student;
import com.fl.map.ClazzMapper;
import com.fl.map.StudentMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.time.temporal.ValueRange;
import java.util.List;

public class TestA {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("myBatis4.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession(true);
        //mapper代理
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        ClazzMapper clazzMapper = sqlSession.getMapper(ClazzMapper.class);
//        List<Student> students = studentMapper.selectAll();
//        for (Student stu:students){
//            int clazzno = stu.getClazzno();
//            Clazz clazz = clazzMapper.selectOne(clazzno);
//            stu.setClazz(clazz);
//            System.out.println(stu.toString());
//        }

        List<Clazz> clazzes = clazzMapper.selectAll();
        for (Clazz clazz:clazzes){
            int clazzno = clazz.getClazzno();
            List<Student> students = studentMapper.selectMore(clazzno);
            clazz.setStudents(students);
            System.out.println(clazz.toString());
        }


        sqlSession.close();


    }
}
