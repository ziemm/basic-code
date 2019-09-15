package cn.itcast.day07.demo06_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * map遍历的第二种方式：使用entrySet();
 * @author: xie
 * @create: 2019-09-15 10:12
 **/
public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "龙小云");
        map.put("李晨", "范冰冰2");

        //获取键值对对象的set集合
        Set<Map.Entry<String,String>> set = map.entrySet();
        //迭代器或增强for遍历输出
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            String value = entry.getValue();
            System.out.println(value);
        }
        System.out.println("-----------第二种输出方式：增强for");
        for (Map.Entry<String,String> entry:set) {
            String value = entry.getValue();
            System.out.println(value);
        }
        System.out.println("-----------第二种输出方式：增强for(简化版)");
        for (Map.Entry<String,String> entry:map.entrySet()) { //直接用keySet方法取出增强for需要的set集合
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+","+value);
        }
    }
}
