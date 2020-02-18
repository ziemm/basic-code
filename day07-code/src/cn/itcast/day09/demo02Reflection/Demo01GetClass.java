package cn.itcast.day09.demo02Reflection;

/**
 * @author: xie
 * @create: 2019-10-14 20:36
 **/
public class Demo01GetClass {
    public static void main(String[] args) throws Exception {
        //有字节码文件后
        Class cls1 = Class.forName("cn.itcast.day09.demo02Reflection.Person");
        //类名.class
        Class cls2 = Person.class;
        //Object.GetClass
        Person p= new Person();
        Class cls3 = p.getClass();

        System.out.println(cls1);
        System.out.println(cls2);
        System.out.println(cls3);

        System.out.println(cls1==cls2);
        System.out.println(cls1==cls3);

    }
}
