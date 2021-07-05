package cn.xie.nowcoder;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * @author: xie
 * @create: 2021-05-14 16:45
 **/
public class ReOrderArray {
    public int[] reOrderArray (int[] array) {
        int[] resultArr = new int[array.length]; //  辅助数组
        int index = 0; //辅助指针

        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1){
                resultArr[index++]=array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0){
                resultArr[index++]=array[i];
            }
        }

        return resultArr;
    }
}
