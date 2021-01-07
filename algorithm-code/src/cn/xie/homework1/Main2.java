package cn.xie.homework1;


import java.util.Scanner;
public class Main2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();
        int[] left = new int[k];
        int[] right = new int[n-k];

        for (int i = 0; i < left.length; i++) {
            left[i]=sc.nextInt();
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = sc.nextInt();
        }

        quickSort(left,0,left.length-1);
        quickSort(right,0,right.length-1);

        for (int i = 0; i < left.length; i++) {
            System.out.print(left[i]+" ");
        }
        for (int i = right.length-1; i >=0; i--) {
            System.out.print(right[i]+" ");
        }
    }

    public static void quickSort(int[] num,int low,int high){
        if(low<high){
            int pivot = partition(num,low,high);
            quickSort(num,low,pivot-1);
            quickSort(num,pivot+1,high);
        }
    }
    private static int partition(int[] num,int low,int high){
        int pivot= num[low];
        while (low<high){
            while (low<high&&num[high]>=pivot)high--;
            num[low]=num[high];
            while (low<high&&num[low]<=pivot)low++;
            num[high]=num[low];
        }
        num[low]=pivot;
        return low;
    }
}
