package cn.xie.sword;

/**
 * 面试题11.旋转数组的最小数字
 * 总结经验：for循环中有return语句也可以跳出for循环，并且不走for循环下面的语句
 * @author: xie
 * @create: 2020-03-08 22:41
 **/
public class MinArray {
    public static void main(String[] args) {
        int[] a= {2,2,2,0,1};

        MinArray o = new MinArray();
        int i = o.minArray(a);
        System.out.println(i);
    }




    /**
     * 原始方法
     * @param numbers
     * @return
     */
    public int minArray1(int[] numbers) {
        if(numbers.length==1){
            return numbers[0];
        }

        for (int i = 0; i < numbers.length-1; i++) {
            if(numbers[i+1]<numbers[i])
                return numbers[i+1];
        }
        return numbers[0];
    }

    /**
     * 采用分治方法 使时间复杂度将为log(n)级别，
     * 经验：当数组有序时，就要想到题目是否涉及到分治策略（即有没有用到数组已经排好序的条件）
     * @param numbers
     * @return
     */
    public int minArray(int[] numbers) {
        int index1 =0;
        int index2 = numbers.length-1;
        int indexMid = index1; //初始化

        while (numbers[index1]>=numbers[index2]){
            if(index2-index1==1){//两个子数组索引都到达各自边界
                indexMid=index2;
                break;
            }

            indexMid=(index1+index2)/2;
            //特例情况：index1/index2/indexMid三数相等，只能顺序查找
            if(numbers[index1]==numbers[index2]&&numbers[index1]==numbers[indexMid]){
                return minInOrder(numbers,index1,index2);
            }

            if(numbers[indexMid]>=numbers[index1]){
                //说明旋转数组最小数在右边
                index1=indexMid;
            }else if (numbers[indexMid]<=numbers[index2]){
                //最小数在左边
                index2=indexMid;
            }

        }
        return numbers[indexMid];
    }

    public int minInOrder(int[] numbers, int index1, int index2) {
        int result = numbers[index1];
        for (int i = index1+1; i <=index2 ; i++) {
            if(result>numbers[i]){
                result =numbers[i];
            }

        }
        return result;
    }
}
