package cn.xie.base01.demo10_Lambda;

/**
 * @author: xie
 * @create: 2019-10-03 22:24
 **/
public class Demo01Runable {
    public static void main(String[] args) {
        new Thread(new RunnableImpl()).start();
    }
}
