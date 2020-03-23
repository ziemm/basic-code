package cn.xie.base02.demoStream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author: xie
 * @create: 2019-10-12 20:37
 **/
public class DemoStreamList {
    public static void main(String[] args) {
        //第一支队伍
        ArrayList<String> one = new ArrayList<>();
        one.add("迪丽热巴");
        one.add("宋远桥");
        one.add("苏星河");
        one.add("石破天");
        one.add("石中玉");
        one.add("老子");
        one.add("庄子");
        one.add("洪七公");

        //第二支队伍
        ArrayList<String> two = new ArrayList<>();
        two.add("古力娜扎");
        two.add("张无忌");
        two.add("赵丽颖");
        two.add("张三丰");
        two.add("尼古拉斯赵四");
        two.add("张天爱");
        two.add("张二狗");

        //狠！！
        Stream<String>  streamOne = one.stream().filter(name->name.length()==3).limit(3);
        Stream<String> streamTwo = two.stream().filter(name->name.startsWith("张")).skip(2);
        Stream.concat(streamOne,streamTwo).map(name->new Person(name)).forEach(name->System.out.println(name));

    }
}
