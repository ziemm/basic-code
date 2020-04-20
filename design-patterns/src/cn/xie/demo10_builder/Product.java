package cn.xie.demo10_builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类，由多个部件组成
 * @author: xie
 * @create: 2020-04-20 08:46
 **/
public class Product {
    List<String> parts= new ArrayList<>();

    //添加产品组件
    public void add(String part){
        parts.add(part);
    }

    //列出所有产品组件
    public void show(){
        System.out.println("产品创建---");

        for (String part : parts) {
            System.out.println(part);
        }
    }

}
