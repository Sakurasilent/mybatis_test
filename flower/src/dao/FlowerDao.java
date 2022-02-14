package dao;

import entity.Flower;

import java.util.List;

public interface FlowerDao {
    //查询操作一般不是对象就是集合
    //查询所有的花卉信息
    public List<Flower>selectAll();
    //插入花卉信息
    int insert (Flower flower);

}
