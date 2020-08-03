package cn.xie.sword;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: xie
 * @create: 2020-07-07 15:20
 **/
public class MinNumber {

    public String minNumber(int[] nums) {
        List<String> strNums = new ArrayList<>();

        for (int num : nums) {
            strNums.add(String.valueOf(num));
        }

        strNums.sort((s1,s2)->(s1+s2).compareTo(s2+s1));

        StringBuilder sb = new StringBuilder();
        for (String strNum : strNums) {
            sb.append(strNum);
        }
        return sb.toString();
    }
}
