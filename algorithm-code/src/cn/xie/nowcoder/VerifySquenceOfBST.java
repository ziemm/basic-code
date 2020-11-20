package cn.xie.nowcoder;

/**
 * @author: xie
 * @create: 2020-11-20 21:05
 **/
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)
            return false;
        if(sequence.length==1)
            return true;
        return verifySquenceOfBST(sequence,0,sequence.length-1);
    }
    public boolean verifySquenceOfBST(int [] sequence,int start,int end) {
        if(start>=end)
            return true;//递归出口
        int i =0;
        //搜索二叉树的后序遍历的最后一个元素是根
        int root = sequence[end];
        //寻找左子树的
        for (; i <end ; i++) {
            if(sequence[i]>root)
                break;
        }
        //右子树的值都要比root大
        int j =i;
        for (; j <end ; j++) {
            if(sequence[j]<root)
                return false;
        }
        //左右子树递归
        return verifySquenceOfBST(sequence,start,i-1)&&verifySquenceOfBST(sequence,i,end-1);
    }


}
