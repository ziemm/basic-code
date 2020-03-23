package cn.xie.base01.demo10_Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: xie
 * @create: 2019-10-03 22:51
 **/
public class Demo01SortPerson {
    public static void main(String[] args) {
        Person[] arr = {new Person("liuyan",38),
                        new Person("kkks",18),
                        new Person("SSSK",16)
        };

        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return  o1.age-o2.age;
            }
        });

        //遍历数组，并输出
        for (Person person : arr) {
            System.out.println(person);
        }



        /* Lambda*/
        Arrays.sort(arr,(Person p1,Person p2)->{return p1.getAge()-p2.getAge();});
        //遍历数组，并输出
        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
