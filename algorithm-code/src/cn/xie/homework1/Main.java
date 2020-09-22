package cn.xie.homework1;


/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        int[] tree = new int[]{2, 5, 3, 1, 10, 4, 7, 9, 9, 90, 100};
        int n = tree.length;
        obj.heapSort(tree, n);
        for (int i = 0; i < tree.length; i++) {
            System.out.println(tree[i]);
        }

    }

    public void heapSort(int[] arr, int n) {
        buildHeap(arr,n);
        for (int i = n - 1; i >= 0; i--) {
            swap(arr, i, 0);
            heapify(arr, i, 0);
        }
    }

    public void buildHeap(int[] arr, int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public void heapify(int[] arr, int n, int i) {
        if (i > n)
            return;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;

        if (c1 < n && arr[c1] > arr[max])
            max = c1;
        if (c2 < n && arr[c2] > arr[max])
            max = c2;
        if (i != max) {
            swap(arr, max, i);
            heapify(arr, n, max);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


}
