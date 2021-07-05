package cn.xie.nowcoder;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: xie
 * @create: 2021-07-05 10:40
 **/
public class Duplicate1 {
    public int duplicate(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for (int number : numbers) {
            if (set.contains(number))
                return number;
            else
                set.add(number);
        }
        return -1;
    }

    /**
     * 使用归位的思想，如数字不在其本来的位置（0~n-1）且本来位置与该数不同,则归到其本来位置
     *
     * @param numbers
     * @return
     */
    public int duplicate1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) return numbers[i];
                int temp = numbers[numbers[i]];
                numbers[numbers[i]] = numbers[i];
                numbers[i] = temp;
                i--;
            }
        }
        return -1;
    }
}
