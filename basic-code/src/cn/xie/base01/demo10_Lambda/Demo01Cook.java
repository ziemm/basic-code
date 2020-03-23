package cn.xie.base01.demo10_Lambda;

/**
 * @author: xie
 * @create: 2019-10-03 22:41
 **/
public class Demo01Cook {
    public static void main(String[] args) {
        //使用invokeCook方法，参数是Cook接口，传递该接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了！");
            }
        });

        //使用Lambda
        invokeCook(()->{System.out.println("吃饭了！！");});
    }

    public static void invokeCook(Cook cook){
        cook.makeFood();
    }
}
