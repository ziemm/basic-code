package cn.xie.nowcoder;

import java.util.Arrays;

/**
 * @author: xie
 * @create: 2020-12-01 10:09
 **/
public class PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        String[] resArr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            resArr[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(resArr, (v1, v2) -> (v1 + v2).compareTo(v2 + v1));
        StringBuilder sb = new StringBuilder();
        for (String num : resArr) {
            sb.append(num);
        }

        return sb.toString();
    }
}
