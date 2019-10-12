package cn.itcast.day08.demo04FunctionalInterface;

import java.util.function.Consumer;

/**
 * 用于消费数据
 * @author: xie
 * @create: 2019-10-12 10:53
 **/
public class DemoConsumer {

    public static void main(String[] args) {
        comsumerSomething("赵丽颖",(name)->{
            System.out.println("name");
            //反转输出
            String reName = new StringBuffer(name).reverse().toString();
            System.out.println(reName);
        });
    }

    /**
    * @Description: 定义一个方法将Consumer接口作为参数，这样这个方法在使用时的Consume参数可以直接使用Lambda表达式
    * @Param: []
    * @return: void
    */
    public static void comsumerSomething(String name, Consumer<String> cons){
        cons.accept(name);
    }
}
