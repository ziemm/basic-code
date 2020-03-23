package cn.xie.base02.demoStream;

import java.util.stream.Stream;

/**
 * @author: xie
 * @create: 2019-10-12 20:07
 **/
public class Demo08StreamMap {
    public static void main(String[] args) {
        String[] arr = {"11","22","33","44"};
        Stream<String> original = Stream.of(arr);
        Stream<Integer> result = original.map(str->Integer.parseInt(str));
        result.forEach(num->System.out.println(num));
    }
}
