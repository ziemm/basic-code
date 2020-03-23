package cn.xie.base01.demo06_Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: xie
 * @create: 2019-09-15 09:15
 **/
public class Demo01Map {
    public static void main(String[] args) {
        show01();
    }

    /**
     * @Description:
     * @Param: []
     * @return: void
     */
    private static void show01() {
        //创建Map集合对象，多态
        Map<String, String> map = new HashMap<>();

        String v1 = map.put("李晨", "范冰冰1");
        System.out.println("v1:" + v1);  //输出解析：map中之前没有key：李晨，没有这个键对应的值，故返回Null
        String v2 = map.put("李晨", "范冰冰2");
        System.out.println("V2:" + v2);  //返回掉被替换的值
        System.out.println(map);
        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("尹志平", "龙小云");
        System.out.println(map);
    }
}
