package cn.xie.base01.demo15_clone;

import java.util.ArrayList;

/**
 * @author: xie
 * @create: 2020-05-30 12:02
 **/
public class ShallowCopy {
    public static void main(String[] args) {
        Subject subject = new Subject("yuwen");
        Student studentA = new Student();
        studentA.setSubject(subject);
        studentA.setName("lynn");
        studentA.setAge(20);


       Student studentB = (Student) studentA.clone();

        //Student studentB = studentA;
        studentB.setName("lily");
        studentB.setAge(18);
        Subject subjectB = studentB.getSubject();
        subjectB.setName("lishi");

        System.out.println("studentA:" + studentA.toString());
        System.out.println("studentB:" + studentB.toString());//输出结果，引用类型会对之前的值进行修改。subject值都是lishi



    }
}
