package cn.xie.base02.demoStream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2019-10-12 19:46
 **/
public class Demo02Stream {
    public static void main(String[] args) {

        //创建一个List集合,存储姓名
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list集合中的元素进行过滤,只要以张开头的元素,存储到一个新的集合中
        //对listA集合进行过滤,只要姓名长度为3的人,存储到一个新集合中
        //遍历listB集合
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name->System.out.println(name));

    }

}
