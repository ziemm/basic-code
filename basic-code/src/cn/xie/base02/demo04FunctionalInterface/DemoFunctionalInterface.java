package cn.xie.base02.demo04FunctionalInterface;

/**
 * @author: xie
 * @create: 2019-10-11 10:37
 **/
public class DemoFunctionalInterface {
    public static void main(String[] args) {
        doSomthing(()->System.out.println("Lambda执行啦！"));
    }


    /**
    * @Description: 函数式接口作为方法的参数
    * @Param: [inter]
    * @return: void
    */
    private static void doSomthing(MyFunctionalInterface inter){
        inter.myMethod();
    }
}
