package cn.xie.base01.demo14_referenceCopy;

/**
 * @author: xie
 * @create: 2020-05-29 14:30
 **/
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("小李");
        Student s2 = new Student("小张");
        System.out.println("s1:"+s1.name);
        System.out.println("s2:"+s2.name);

        swap(s1,s2);

        System.out.println("s1:"+s1.name);//此处的值就会改变
        System.out.println("s2:"+s2.name);


    }

    public static void swap(Student x,Student y){//参数传递的是实参的引用的拷贝，也就是传的是实参的地址，而不是实参地址所指向的对象，
                                                 //所以要是利用拷贝的地址对指向的对象进行操作，也会改变原来对象的值
//        Student tmp = x;
//        x=y;
//        y=x;

        x.name="xiaosuo";
    }
}
