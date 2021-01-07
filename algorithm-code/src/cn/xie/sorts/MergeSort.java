package cn.xie.sorts;

/**
 * @author: xie
 * @create: 2020-09-22 14:22
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        mergeSort(a, 0, a.length-1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e+" ");
        int[] c = new int[9];
    }
    public static void merge(int[] a, int left, int mid, int right) {
        int[] temp = new int[a.length]; //辅助数组
        int p1 = left, p2 = mid + 1;  //检测指针
        int k = left; //存放指针

        while (p1<=mid && p2 <=right){
            if(a[p1]<=a[p2])
                temp[k++] = a[p1++];
            else
                temp[k++] = a[p2++];
        }

        while (p1<=mid) temp[k++] = a[p1++];
        while (p2<=right) temp[k++] =a[p2++];

        for (int i = left; i <= right ; i++) {
            a[i] =  temp[i];
        }
    }

    public static void mergeSort(int[] a,int start,int end){
        if(start<end){//当子序列中只有一个元素时结束递归
            int mid = (start+end)/2;//划分子序列
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);

            merge(a,start,mid,end);//合并
        }
    }
}
