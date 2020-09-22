package cn.xie.sorts;

/**
 * @author: xie
 * @create: 2020-06-16 23:45
 **/
public class QuickSort {

    public static void main(String[] args){
        QuickSort t = new QuickSort();
        int[] a = {3,2,7,10,1,9,0,5};
        t.quickSort(a,0,a.length-1);
        for(int i : a)
            System.out.print(i+" ");
    }

    public void quickSort(int[] num,int low,int high){
        if(low<high){
            int pivot = partition(num,low,high);
            quickSort(num,low,pivot-1);
            quickSort(num,pivot+1,high);
        }

    }

    /*记住以数组为参数输入的快排写法*/
    private int partition(int[] num,int low,int high){
        int pivot= num[low];
        while (low<high){
            while (low<high&&num[high]>=pivot)high--;
            num[low]=num[high];
            while (low<high&&num[low]<=pivot)low++; //
            num[high]=num[low];
        }
        //low与high相遇时
        num[low]=pivot;
        return low;
    }
}
