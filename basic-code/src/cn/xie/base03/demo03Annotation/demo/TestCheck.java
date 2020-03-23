package cn.xie.base03.demo03Annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author: xie
 * @create: 2019-10-15 12:17
 **/
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //创建计算器对象
        Calculator c = new Calculator();
        //获取字节码文件
        Class cls = c.getClass();
        //得到字节码文件后获取所有的方法
        Method[] methods = cls.getMethods();
        int number=0;//异常出现次数
        BufferedWriter bw =new BufferedWriter(new FileWriter("bug.txt")); //创建流将异常信息文件输出

        //判断方法们上面是否有注解
        for (Method method : methods) {
            //有，就执行，并进行捕获异常操作
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //记录异常信息
                    number++;
                    bw.write(method.getName()+"方法出异常了！");
                    bw.newLine();
                    bw.write("异常名称:"+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因:"+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------------------------");
                    bw.newLine();
                }
            }
        }

        System.out.println("共计出现"+number+"此异常");

        //将缓冲流中的信息输出
        bw.flush();
        //关闭资源
        bw.close();

    }
}
