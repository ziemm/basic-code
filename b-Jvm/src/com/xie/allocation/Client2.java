package com.xie.allocation;

/**
 * 3.长期存活的对象将进入老年代
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:MaxTenuringThreshold=1
 * -XX:+PrintTenuringDistribution
 *
 * @author: xie
 * @create: 2020-03-02 21:36
 **/
public class Client2 {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        testMaxTenuringThreshold();
    }

    public static void testMaxTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        //什么时候进入老年代取决于-XX:MaxTenuringThreshold=1 默认是15
        allocation2 = new byte[4*_1MB];
        allocation3 = new byte[4*_1MB];
        allocation3 = null;
        allocation3 = new byte[4*_1MB];
    }
}
