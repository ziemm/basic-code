package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-10-29 09:38
 **/
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array==null || array.length==0)
            return 0;
        int low = 0;
        int high= array.length-1;
        while (low<high){
            //数组本身递增，直接返回数字的左边
            if(array[low]<array[high]) return array[low];
            int mid = (low+high)/2;
            if(array[low]<array[mid])//数组左半部分有序，则目标在数组右边
                low=mid+1;
            else if(array[mid]<array[high])//数组右半部分有序，目标在数组左边
                high=mid;
            else//array[low]>=array[mid]>=array[high] 例子：[1,0,1,1,1]
                low++;
        }
        return array[low];
    }
}
