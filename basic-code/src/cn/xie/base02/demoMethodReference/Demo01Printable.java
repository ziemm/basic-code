package cn.xie.base02.demoMethodReference;

/**
 * @author: xie
 * @create: 2019-10-13 13:38
 **/
public class Demo01Printable {
    public static void printString(Printable p){
        p.print("helloworld");
    }

    public static void main(String[] args) {
        printString((s -> {System.out.println(s);}));
        printString(System.out::println);

        //通过对象名引用成员方法
        MethoodReObjiect obj = new MethoodReObjiect();
        printString(obj::printUpperCase);
    }


}
