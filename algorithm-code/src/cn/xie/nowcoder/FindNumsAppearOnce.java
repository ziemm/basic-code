package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-09 09:52
 **/
public class FindNumsAppearOnce {
    public static void main(String[] args) {

    }
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null || array.length<=1)
            return;
        int sample =0;
        for (int i = 0; i < array.length; i++) {
            sample ^= array[i];
        }
        //找到最低位为1的位置，按照这个位置生成掩码
        int count = 0;
        while (sample%2==0){
            sample = sample>>1;
            count++;
        }
        int mask = 1<<count;
        for (int num : array) {
            if((num&mask)==0){
                num1[0]^=num;
            }else {
                num2[0]^=num;
            }
        }
    }
}
