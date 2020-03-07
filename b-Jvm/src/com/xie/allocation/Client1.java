package com.xie.allocation;

/**
 * 2.大对象直接进入老年代
 *   此处结果不一样是因为 参数只在Serial和ParNew 收集器中有效，在Parallel Scavenge中该参数无效
 * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * -XX:PretenureSizeThreshold=3145728
 * @author: xie
 * @create: 2020-03-02 20:59
 **/
public class Client1 {
    private static final int _1MB =1024*1024;

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }

    public static void testPretenureSizeThreshold(){
        byte[] allocation;
        allocation =new byte[4*_1MB];
    }
}
