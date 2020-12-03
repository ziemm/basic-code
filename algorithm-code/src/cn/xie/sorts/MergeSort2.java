package cn.xie.sorts;

/**
 * @author: xie
 * @create: 2020-12-03 22:08
 **/
public class MergeSort2 {
    public static void main(String[] args) {
        int[] a = { 49, 38, 65, 97, 76, 13, 27, 50 };
        mergeSort(a, 0, a.length-1);
        System.out.println("排好序的数组：");
        for (int e : a)
            System.out.print(e+" ");
    }
    public static void mergeSort(int[] arr,int start,int end){
        if(start==end)
            return;
        int mid = start+(end-start)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);

        int[] temp = new int[end-start+1];
        int i =start,j=mid+1,k=0;
        while (i<=mid && j<=end)
            temp[k++]=arr[start]<arr[end]?arr[i++]:arr[j++];
        while (i<=mid)
            temp[k++]=arr[i++];
        while (j<=end)
            temp[k++]=arr[j++];

        System.arraycopy(temp,0,arr,start,end-start+1);
    }
}
