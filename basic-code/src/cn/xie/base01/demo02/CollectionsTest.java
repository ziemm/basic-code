package cn.xie.base01.demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author: xie
 * @create: 2020-05-30 09:34
 **/
public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        arrayList2.add(3);
        arrayList2.add(-5);
        arrayList2.add(7);
        System.out.println("原始数组:");
        System.out.println(arrayList);
//
//        Collections.reverse(arrayList);
//        System.out.println(arrayList);
//
//        Collections.rotate(arrayList,4);
//        System.out.println(arrayList);
//
//        // 定制排序的用法
//        Collections.sort(arrayList, new Comparator<Integer>() {
//
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2.compareTo(o1);
//            }
//        });
//        System.out.println("定制排序后：");
//        System.out.println(arrayList);


        System.out.println(Collections.indexOfSubList(arrayList, arrayList2));
    }

}
