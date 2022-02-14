package dao.impl;


import dao.FlowerDao;
import entity.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {
    @Override
    public List<Flower> selectAll() {
        //使用jdbc连接数据库
        List<Flower> list= new ArrayList<Flower>();
        Connection conn = null;
        PreparedStatement pstmt= null;
        ResultSet resultSet = null;
        try {
            //1 加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //2会的数据库的连接
            conn= DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mybatis" +
                            "?characterEncoding=UTF-8&serverTimezone=UTC"

                    ,"root","root");
            //3创建命令发送器
            pstmt = conn.prepareStatement("select * from flower");

            //4执行sql语句
            resultSet = pstmt.executeQuery();
            //5返回结果

            while (resultSet.next()){
                int id= resultSet.getInt("id");
                String name = resultSet.getString("name");
                int price = resultSet.getInt("price");
                String production = resultSet.getString(
                        "production");
                Flower flower = new Flower(id,name,price,production);
                list.add(flower);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            //6关闭资源
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                pstmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    @Override
    public int insert(Flower flower) {
        return 0;
    }
}
