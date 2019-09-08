package cn.itcast.day07.demo02;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author: xie
 * @create: 2019-09-05 21:45
 **/
public class DemoArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList= new ArrayList<>();
        Random r= new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100);
            bigList.add(num);
        }
        System.out.println(getSmallList(bigList));
    }

    public static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        ArrayList<Integer>smallList= new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if(num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
