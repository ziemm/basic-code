package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-07 22:09
 **/
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        if(array==null||array.length==0)
            return 0;
        int left=0,right=array.length-1;
        while (left <right){
            int mid = left+(right-left)/2;
            if(array[mid]>=k)
                right = mid;
            if(array[mid]<k)
                left = mid+1;
        }

        while (left<array.length&&array[left++]==k)
            count++;

        return count;
    }
}
