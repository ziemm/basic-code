package cn.xie.base02.demo04FunctionalInterface;

import java.util.function.Consumer;

/**
 * @author: xie
 * @create: 2019-10-12 11:16
 **/
public class Demo02AndThen {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴,女","古力娜扎,女","马尔扎哈,男"};
        doPrint(arr,(s)->{System.out.println(s.split(",")[0]);},(s)->{System.out.println(s.split(",")[1]);});
    }

    public static void doPrint(String[] strArr,Consumer<String> one , Consumer<String> two){

        for (String s : strArr) {
            one.andThen(two).accept(s);
        }

    }
}
