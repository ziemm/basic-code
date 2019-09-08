package cn.itcast.day07.demo02;

import java.util.ArrayList;

/**
 *
 *
 * @author: xie
 * @create: 2019-09-05 21:15
 **/
public class DemoArrayListMethod {

    public static void main(String[] args) {
        //集合遍历
        ArrayList<String> list = new ArrayList<>();
        list.add("111");
        list.add("222");
        list.add("333");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
