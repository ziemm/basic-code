package cn.xie.base01.demo02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @author: xie
 * @create: 2020-05-31 15:03
 **/
public class EnsureCapacityTest {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<Object>();
        final int N = 10000000;
        long startTime = System.currentTimeMillis();
        //list.ensureCapacity(N);
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("使用ensureCapacity方法前："+(endTime - startTime));


    }
}
