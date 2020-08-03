package cn.xie.base01.demo03_equals_hashCode;

import java.util.HashSet;
import java.util.Objects;

/**
 * 第二种 会创建“类对应的散列表”
 * <p>
 * 这里所说的“会创建类对应的散列表”是说：我们会在HashSet, Hashtable, HashMap等等这些本质是散列表的数据结构中，用到该类。例如，会创建该类的HashSet集合。
 * <p>
 * 在这种情况下，该类的“hashCode() 和 equals() ”是有关系的：
 * 1)、如果两个对象相等，那么它们的hashCode()值一定相同。
 * 这里的相等是指，通过equals()比较两个对象时返回true。
 * 2)、如果两个对象hashCode()相等，它们并不一定相等。
 * 因为在散列表中，hashCode()相等，即两个键值对的哈希值相等。然而哈希值相等，并不一定能得出键值对相等。补充说一句：“两个不同的键值对，哈希值相等”，这就是哈希冲突。
 *
 * @author: xie
 * @create: 2020-05-28 11:26
 **/
public class ConflictHashCodeTest2 {

    public static void main(String[] args) {
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("eee", 200);
        Person p4 = new Person("EEE", 100);

        //新建HashSet对象 会装入Person对象
        HashSet set = new HashSet();

        set.add(p1);
        set.add(p2);
        set.add(p3);

        // 比较p1 和 p2， 并打印它们的hashCode()
        System.out.printf("p1.equals(p2) : %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        // 比较p1 和 p4， 并打印它们的hashCode()
        System.out.printf("p1.equals(p4) : %s; p1(%d) p4(%d)\n", p1.equals(p4), p1.hashCode(), p4.hashCode());
        // 打印set
        System.out.printf("set:%s\n", set);
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
        public int hashCode() {
            int nameHash = name.toUpperCase().hashCode();
            return nameHash ^ age;
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
