package cn.xie.base01.demo03_equals_hashCode;

import java.util.HashSet;

/**
 * @author: xie
 * @create: 2020-05-28 11:16
 **/
public class ConflictHashCodeTest1 {
    public static void main(String[] args) {
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("eee", 200);

        //新建HashSet对象 会装入Person对象
        HashSet set =new HashSet();

        set.add(p1);
        set.add(p2);
        set.add(p3);

        // 比较p1 和 p2， 并打印它们的hashCode()
        System.out.printf("p1.equals(p2): %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());

        //打印set
        System.out.printf("set:%s\n",set);  //打印结果在下一行，由于没有重写hashCode，出现了重复元素p1/p2 但是它们的值是相等的
       // set:[Person{name='eee', age=100}, Person{name='eee', age=200}, Person{name='eee', age=100}]
    }


    private static class Person {
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
