package cn.xie.homework1;


/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main1 {
    public static void main(String[] args) {
        Main1 obj = new Main1();
        int[] tree = new int[]{2, 5, 3, 1, 10, 4};
        int n = tree.length;
        obj.heapSort(tree, n);
        for (int i = 0; i < tree.length; i++) {
            System.out.println(tree[i]);
        }
    }

    private void heapSort(int[] tree, int n) {
        buildHeap(tree, n);
        for (int i = n-1; i >=0 ; i--) {
           swap(tree,i,0);
           heapify(tree,i,0);
        }
    }

    private void buildHeap(int[] tree, int n) {
        int lastNode = n - 1;
        int parent = (lastNode - 1) / 2;

        for (int i = parent; i >= 0; i--) {
            heapify(tree, n, i);
        }
    }

    private void heapify(int[] tree, int n, int i) {
        if (i > n)
            return;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        int max = i;
        if (c1 < n && tree[c1] > tree[max]) max = c1;
        if (c2 < n && tree[c2] > tree[max]) max = c2;
        if (max != i) {
            swap(tree, max, i);
            heapify(tree,n,max);
        }
    }

    private void swap(int[] tree, int a, int b) {
        int temp = tree[a];
        tree[a] = tree[b];
        tree[b] = temp;
    }


}

