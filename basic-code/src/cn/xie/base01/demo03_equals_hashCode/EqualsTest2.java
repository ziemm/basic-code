package cn.xie.base01.demo03_equals_hashCode;

import java.util.Objects;

/**
 * 根据源码：equals具有以下特性
 * 1. 对称性：如果x.equals(y)返回是"true"，那么y.equals(x)也应该返回是"true"。
 * 2. 反射性：x.equals(x)必须返回是"true"。
 * 3. 类推性：如果x.equals(y)返回是"true"，而且y.equals(z)返回是"true"，那么z.equals(x)也应该返回是"true"。
 * 4. 一致性：如果x.equals(y)返回是"true"，只要x和y内容一直不变，不管你重复x.equals(y)多少次，返回都是"true"。
 * 5. 非空性，x.equals(null)，永远返回是"false"；x.equals(和x不同类型的对象)永远返回是"false"。
 *
 * @author: xie
 * @create: 2020-05-28 10:54
 **/
public class EqualsTest2 {
    public static void main(String[] args) {
        // 新建2个相同内容的Person对象，
        // 再用equals比较它们是否相等
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        System.out.printf("%s\n", p1.equals(p2));  //根据重写的方法，返回true

        System.out.println(p1==p2);//比较的是地址则不同
    }

    private static class Person{
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            //如果是同一个对象，返回true
            if (this == o)
                return true;

            //判断类型是否相同
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;

            //判断对象值是否相同
            return age == person.age &&
                    name.equals(person.name);
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
