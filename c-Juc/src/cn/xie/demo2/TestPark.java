package cn.xie.demo2;

import java.util.concurrent.locks.LockSupport;

/**
 * @author: xie
 * @create: 2020-05-17 15:34
 **/
public class TestPark {
    public void testPark(){
        LockSupport.park();
    }

    public static void main(String[] args) {
        final TestPark testPark = new TestPark();
        testPark.testPark();
    }
}
