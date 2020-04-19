package cn.xie.demo09_facade;

/**
 * @author: xie
 * @create: 2020-04-19 22:55
 **/
public class Facade {
   SubSystemOne one;
   SubSystemTwo two;
   SubSystemThree three;
   SubSystemFour four;
   public Facade(){
       one = new SubSystemOne();
       two = new SubSystemTwo();
       three= new SubSystemThree();
       four = new SubSystemFour();
   }

   public void methodA(){
       System.out.println("方法组A:");
       one.MethodOne();
       two.methodTwo();
       three.methodThree();
   }

   public void methodB(){
       System.out.println("方法组B：");
       three.methodThree();
       four.methodFour();
   }
}
