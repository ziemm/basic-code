package cn.itcast.day07.demo06_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map遍历的第一种方法：键找值的方法。
 *
 * @author: xie
 * @create: 2019-09-15 09:50
 **/
public class Demo02KeySet {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "龙小云");
        map.put("李晨", "范冰冰2");
        //获取键的set集合
        Set<String> set = map.keySet();
        //迭代器或增强for遍历输出
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(value);
        }
        System.out.println("-----------第二种输出方式：增强for");
        for (String key : set) {
            String value = map.get(key);
            System.out.println(value);
        }
        System.out.println("-----------第二种输出方式：增强for(简化版)");
        for (String key : map.keySet()) { //直接用keySet方法取出增强for需要的set集合
            String value = map.get(key);
            System.out.println(value);
        }

    }
}
