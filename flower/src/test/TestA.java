package test;

import dao.FlowerDao;
import dao.impl.FlowerDaoImpl;
import entity.Flower;

import java.util.List;


public class TestA {
    public static void main(String[] args) {
        FlowerDao flowerDao = new FlowerDaoImpl();
        List<Flower> list = flowerDao.selectAll();
        for (Flower flower:list){
            System.out.println(flower);
        }
    }
}
