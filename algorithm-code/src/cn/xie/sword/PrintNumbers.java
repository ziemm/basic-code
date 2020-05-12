package cn.xie.sword;

/**
 * @author: xie
 * @create: 2020-05-12 19:15
 **/
public class PrintNumbers {

    public static void main(String[] args) {
         PrintNumbers o = new PrintNumbers();

        int[] ints = o.printNumbers(3);

        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    public int[] printNumbers(int n) {
        int length = (int) Math.pow(10,n);

        int[] arr = new int[length-1];

        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }

        return arr;
    }
}
