package cn.xie.leetcode;


/**
 * @author: xie
 * @create: 2020-09-10 17:29
 **/
public class FindKth {
    public static void main(String[] args) {
        FindKth obj = new FindKth();
        int[] a = new int[]{1,3,2,6,5,8};
        int kth = obj.findKth(a, 6, 6);
        System.out.println(kth);
    }
    public int findKth(int[] a, int n, int K) {
       return quickSort(a,0,n-1,K);
    }
    public int quickSort(int[] num,int low,int high,int K){
        if(low <= high){
            int pivot = partition(num,low,high);
            if(pivot == K-1)
               return num[pivot];
            else if(pivot<K-1)
                return quickSort(num,pivot+1,high,K);
            else
                return quickSort(num,low,pivot-1,K);
        }
        return -1;
    }

    /*记住以数组为参数输入的快排写法*/
    private int partition(int[] num,int low,int high){
        int pivot= num[low];
        while (low<high){
            while (low<high&&num[high]<=pivot)high--;
            num[low]=num[high];
            while (low<high&&num[low]>=pivot)low++; //
            num[high]=num[low];
        }
        //low与high相遇时
        num[low]=pivot;
        return low;
    }
}
