package cn.xie.sorts;

/**
 * @author: xie
 * @create: 2020-09-05 15:27
 **/
public class HeapSort {
    public static void main(String[] args) {
        HeapSort obj = new HeapSort();
        int[] tree = new int[]{2, 5, 3, 1, 10, 4,7,9,9,90};
        int n = tree.length;
        obj.heapSort(tree, n);
        for (int i = 0; i < tree.length; i++) {
            System.out.println(tree[i]);
        }
    }

    /*对第i个节点进行堆调整*/
    public void heapify(int[] tree, int n, int i) {
        if (i > n)
            return;  //递归出口
        int c1 = 2 * i + 1; //i节点的左子节点
        int c2 = 2 * i + 2; //i节点的右子节点
        int max = i; //暂时认为第i的结点的值是最大的
        //在当前子树中，找到根节点与两个子节点中最大值的下标
        if (c1 < n && tree[c1] > tree[max])  //c1 <n 是必要的，防止递归出界
            max = c1;
        if (c2 < n && tree[c2] > tree[max])
            max = c2;
        //如果max有过调整，则交换数值
        if (max != i) {
            swap(tree, max, i);
            heapify(tree, n, max); //递归继续向下调整
        }

    }

    /*依次将根节点与最后一个节点，倒数第二个节点，...交换，形成有序数组*/
    public void heapSort(int[] tree,int n){
        buildHeap(tree,n);
        for (int i = n-1; i >=0 ; i--) {
            swap(tree,i,0);
            heapify(tree,i,0);//调整剩下节点的堆结构，只需对此时的根节点调整就行，i表示当前树（堆结构）节点的数量
        }
    }

    /*建堆的过程就是对第一个非叶节点一次递减进行堆调整*/
    public void buildHeap(int[] tree,int n){
        int lastNode = n-1;
        int parent = (lastNode-1)/2;//找到第一个非叶子节点
        for (int i = parent; i >=0 ; i--) {
            heapify(tree,n,i);
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
