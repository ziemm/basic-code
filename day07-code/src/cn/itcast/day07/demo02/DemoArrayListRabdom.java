package cn.itcast.day07.demo02;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: xie
 * @create: 2019-09-05 21:29
 **/
public class DemoArrayListRabdom {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        Random rd = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(rd.nextInt(33)+1);
            System.out.println(list.get(i));
        }
       System.out.println(list);
    }
}
