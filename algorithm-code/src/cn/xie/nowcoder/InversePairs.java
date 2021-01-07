package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-12-03 22:46
 **/
public class InversePairs {

    public int InversePairs(int [] array) {
        return merge(array,0,array.length-1);
    }

    public int merge(int[] array,int start,int end){
       if(start==end)
           return 0;
       int mid = start+(end-start)/2;
       int count = merge(array,start,mid)+merge(array,mid+1,end);

       int[] temp = new int[end-start+1];
       int i = start,j=mid+1,k=0;
        while(i<=mid && j<= end){
//如果前面的元素小于后面的不能构成逆序对
            if(array[i] <= array[j])
                temp[k++] = array[i++];
            else{
//如果前面的元素大于后面的，那么在前面元素之后的元素都能和后面的元素构成逆序对
                temp[k++] = array[j++];
                count = (count + (mid-i+1))%1000000007;
            }
        }
       while (i<=mid){
           temp[k++]=array[i++];
       }
       while (j<=end){
           temp[k++] = array[j++];
       }
       System.arraycopy(temp,0,array,start,end-start+1);
       return count;
    }
}
