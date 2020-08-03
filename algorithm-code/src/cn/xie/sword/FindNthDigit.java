package cn.xie.sword;

import javax.lang.model.element.VariableElement;

/**
 * @author: xie
 * @create: 2020-06-29 23:11
 **/
public class FindNthDigit {
    public static void main(String[] args) {
        System.out.println(Math.pow(10, 9 - 1)*9*9);
        int count = (int) (Math.pow(10, 9 - 1)*9*9);
        System.out.println(count);
    }

    public int findNthDigit(int n) {
        if (n < 0)
            return -1;

        int digits = 1;
        while (true) {
            //从个位开始计算
            int numbers = countOfIntegers(digits);
            if (n < numbers ) {
                //说明在该位数的数字里面
                //找到该位的初始数字
                int bNumber = beginNum(digits);
                int thisNumber = bNumber + n / digits; //找到该数
                int indexFromRight = digits - n % digits;
                for (int i = 1; i < indexFromRight; ++i) {
                    thisNumber/=10;
                }
                return thisNumber%10;
            }
            //如果不小于
            n -= numbers;
            //位数增加一位
            digits++;
        }

    }

    public int beginNum(int digits) {
        if (digits == 1)
            return 0; //位数1，从0开始，位数2从10开始，位数3从100开始
        return (int) Math.pow(10, digits - 1);
    }


    public int countOfIntegers(int digits) {
        if (digits == 1)
            return 10;
        int count = (int) (Math.pow(10, digits - 1)*9*digits);
        return count;
    }
}
