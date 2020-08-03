package cn.xie.base01.demo03_equals_hashCode;

/**
 * @author: xie
 * @create: 2020-05-28 10:47
 **/
public class EqualsTest1 {
    public static void main(String[] args) {
       Person p1 = new Person("eee",100);
       Person p2 = new Person("eee",100);
       System.out.println(p1.equals(p2));  //此时未重写equals，比较的是地址
    }

    private static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
