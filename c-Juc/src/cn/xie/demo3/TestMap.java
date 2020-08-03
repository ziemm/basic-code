package cn.xie.demo3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: xie
 * @create: 2020-05-25 11:24
 **/
public class TestMap {
    static ConcurrentHashMap<String,List<String>> map= new ConcurrentHashMap<String, List<String>>();

    public static void main(String[] args) {
        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> list1 = new ArrayList<>();
                list1.add("device1");
                list1.add("device2");

                //map.put("topic1",list1);

                List<String> oldList = map.putIfAbsent("topic1", list1);
                if(null!=oldList){
                    oldList.addAll(list1);
                }

                for (String key : map.keySet()) {
                    System.out.println("key="+key+"value="+map.get(key));
                }
            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> list1 = new ArrayList<>();
                list1.add("device11");
                list1.add("device22");

//                map.put("topic1",list1);
                List<String> oldList = map.putIfAbsent("topic1", list1);
                if(null!=oldList){
                    oldList.addAll(list1);
                }
                for (String key : map.keySet()) {
                    System.out.println("key="+key+"value="+map.get(key));
                }
            }
        });

        Thread threadThree = new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> list1 = new ArrayList<>();
                list1.add("device111");
                list1.add("device222");

                //map.put("topic2",list1);

                List<String> oldList = map.putIfAbsent("topic2", list1);
                if(null!=oldList){
                    oldList.addAll(list1);
                }

                for (String key : map.keySet()) {
                    System.out.println("key="+key+"value="+map.get(key));
                }
            }
        });

        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
