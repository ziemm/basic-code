package cn.xie.base01.demo13_interfaceStatic;

/**
 * @author: xie
 * @create: 2020-05-28 08:16
 **/
public class MyClass implements MyInterfaceStatic {
    public static void main(String[] args) {

        MyInterfaceStatic.methodStatic();
    }

    public void test(){
        int a;
        //System.out.println(a);//此处会编译错误，说明局部变量需要赋初值
    }
}
