package cn.itcast.day07.demo07_Exception;

import java.util.Scanner;

/**
 * @author: xie
 * @create: 2019-10-03 13:37
 **/
public class Demo01RegisterException {
    static String[] usernames = {"张三","李四","王五"};
    public static void main(String[] args)/* throws RegisterException*/ {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username =sc.next();
        checkUsername(username);
    }

    public static void checkUsername(String username) /*throws RegisterException*/ {
        for (String name : usernames) {
            if(name.equals(username)){
                try {
                    throw new RegisterException("该用户已经被注册！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//结束方法
                }
            }
        }

        //若循环结束，用户名可以使用
        System.out.println("恭喜你，注册成功！");
    }
}
