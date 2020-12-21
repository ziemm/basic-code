package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-18 10:20
 **/
public class Add {
    public int Add(int num1,int num2) {
        while (num2!=0){//循环的结束条件是num2=0，不再有进位
            int temp = num1^num2; //各位相加得到不进位的值，用到异或运算
            num2 = (num1&num2)<<1; //计算进位，用到&运算且向左移一位
            num1 = temp; //临时值赋给num1
        }
        return num1;
    }
}
