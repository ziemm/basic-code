package cn.xie.base01.demo03_equals_hashCode;

/**
 * 1. 第一种 不会创建“类对应的散列表”
 * <p>
 * 这里所说的“不会创建类对应的散列表”是说：
 * 我们不会在HashSet, Hashtable, HashMap等等这些本质是散列表的数据结构中，用到该类。
 * 例如，不会创建该类的HashSet集合。
 *
 * @author: xie
 * @create: 2020-05-28 11:05
 **/
public class NormalHashCodeTest {

    public static void main(String[] args) {
        Person p1 = new Person("eee", 100);
        Person p2 = new Person("eee", 100);
        Person p3 = new Person("eee", 200);

        System.out.printf("p1.equals(p2): %s; p1(%d) p2(%d)\n", p1.equals(p2), p1.hashCode(), p2.hashCode());
        System.out.printf("p1.equals(p3): %s; p1(%d) p3(%d)\n", p1.equals(p3), p1.hashCode(), p3.hashCode());
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
