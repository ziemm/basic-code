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

        int i = start,j=mid+1,k=0;
        int[] temp = new int[end-start+1];
        while (i<=mid && j<=end){
            count+= array[i]<=array[j]?0:mid+1-i;
            temp[k++]=array[start]<=array[end]?array[i++]:array[j++];
        }

        while (i<=mid)
            temp[k++]=array[i++];
        while (j<=end)
            temp[k++]=array[j++];
        System.arraycopy(temp,0,array,start,end-start+1);
        return count;
    }
}
