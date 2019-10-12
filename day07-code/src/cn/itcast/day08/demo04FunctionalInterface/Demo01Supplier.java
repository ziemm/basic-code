package cn.itcast.day08.demo04FunctionalInterface;

import java.util.function.Supplier;

/**
 * @author: xie
 * @create: 2019-10-12 10:39
 **/
public class Demo01Supplier {

    public static void main(String[] args) {
        String s = getString(()-> "胡歌");
        System.out.println("s");
    }

    /**
    * @Description: 函数式接口作为参数
    * @Param: [sup]
    * @return: java.lang.String
    */
    public static String getString(Supplier<String> sup){
        return sup.get();
    }
}
