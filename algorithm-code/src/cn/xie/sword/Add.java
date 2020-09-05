package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-08-09 14:35
 **/
public class Add {
    public static void main(String[] args) {
        Add obj = new Add();
        int add = obj.add(100, 231);
        System.out.println(add);
    }
    public int add(int a, int b) {
        int sum1,sum2;
        do{
            sum1 = a ^ b;
            sum2 = (a & b)<<1;
            a = sum1;
            b = sum2;
        }while (b!=0);
        return a;
    }
}
