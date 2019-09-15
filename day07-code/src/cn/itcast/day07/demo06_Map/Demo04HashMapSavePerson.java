package cn.itcast.day07.demo06_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: xie
 * @create: 2019-09-15 10:25
 **/
public class Demo04HashMapSavePerson {
    public static void main(String[] args) {
        show02();
    }

    private static void show02() {
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("张三",17),"北京");
        map.put(new Person("李四",20),"上海");
        map.put(new Person("张五",21),"广州");
        map.put(new Person("张三",17),"北京");
        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> entry : set) {
            Person key =entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"-->"+value);

        }
    }

    private static void show01() {
        HashMap<String,Person> map = new HashMap<>();
        map.put("北京",new Person("张三",17));
        map.put("上海",new Person("李四",20));
        map.put("广州",new Person("张五",21));
        map.put("北京",new Person("李六",17));
        //遍历
        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key+"-->"+value);
        }

    }
}
