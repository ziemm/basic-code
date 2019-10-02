package cn.itcast.day07.demo07_Exception;

/**
 *Throw的使用
 * @author: xie
 * @create: 2019-10-02 11:15
 **/
public class Demo03Throw {
    public static void main(String[] args) {
      //创造一个数组越界异常进行练手
      int[] arr = {22,33,44};
      int index = 4;

      int element = getElement(arr,index);

      System.out.println(element);
      System.out.println("over");
    }

    public static int getElement(int[] arr,int index){

        if( index < 0|| index >arr.length-1){
            throw new ArrayIndexOutOfBoundsException("角标越界了！");
        }
        int element = arr[index];
       return element;
    }
}
