package com.xie.allocation;

/**
 * 1.对象优先分配在Eden区
 * 测试对象分配:此处运行结果不一样是因为jdk版本用的是64位的，使JVM默认为Server模式，而64的JDK版本没有Client模式。
 * 1.Server模式默认的gc是 Parallel Scavenge + Serial Old(PS MarkSweep)
 * 2.Client模式默认的gc是 Serial + Serial Old
 *
 * @author: xie
 * @create: 2020-03-02 19:54
 **/
public class Client {
    private static final int _1MB =1024*1024;

    public static void main(String[] args) {
        testAllocation();
    }
    /**
     * VM参数：-verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation(){
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];//由于新生代的堆内存是9MB 会出现一次Minor GC;
    }
}
