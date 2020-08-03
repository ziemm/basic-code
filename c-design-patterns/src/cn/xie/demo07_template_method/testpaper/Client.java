package cn.xie.demo07_template_method.testpaper;

/**
 * @author: xie
 * @create: 2020-04-19 10:19
 **/
public class Client {
    public static void main(String[] args) {

        System.out.println("学生A:");
        TestPaper studentA = new TestPaperA();
        studentA.question1();
        System.out.println(studentA.Answer1());
        studentA.question2();
        System.out.println(studentA.Answer2());
        studentA.question3();
        System.out.println(studentA.Answer3());

        TestPaper studentB = new TestPaperB();
        studentB.Answer1();
        studentB.Answer2();
        studentB.Answer3();
    }
}
