package cn.xie.demo10_builder;

import cn.xie.demo03_decorate.Decorator;

/**
 * 指挥者类：用来指挥创建过程
 * @author: xie
 * @create: 2020-04-20 09:03
 **/
public class Director {

   public void construct (Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }
}
