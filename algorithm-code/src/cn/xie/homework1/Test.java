package cn.xie.homework1;

/**
 * @author: xie
 * @create: 2020-09-13 17:30
 **/
public class Test {
    static class  Father{
        static {
            System.out.println("Static Father");
        }
        {
            System.out.println("Non-static Father");
        }
        public Father(){
            System.out.println("Contrutor Father");
        }
    }
    static class  Son extends Father{
        static {
            System.out.println("Static son");
        }
        {
            System.out.println("Non-static son");
        }
        public Son(){
            System.out.println("Constructor Son");
        }
    }

    public static void main(String[] args) {
        new Son();
    }
}
