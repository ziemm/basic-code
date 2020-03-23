package cn.xie.base03.demo01Junit.test;

import cn.xie.base03.demo01Junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author: xie
 * @create: 2019-10-14 17:37
 **/
public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("测试方法前，执行该方法..");
    }

    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        int result = cal.add(10,29);
        Assert.assertEquals(39,result);
        System.out.println("测试方法执行完毕");
    }

    @After
    public void Done(){
        System.out.println("测试方法后，执行该方法..");
    }
}
