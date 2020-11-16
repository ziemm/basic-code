package cn.xie.sword;


/**
 * @author: xie
 * @create: 2020-05-20 22:53
 **/
public class IsSubStructure {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean result =false;

        if(A!=null&&B!=null){
            if(A.val==B.val)
                result=doesTreeHaveTree(A,B);
            if(!result)
                result = isSubStructure(A.left,B);
            if(!result)
                result = isSubStructure(A.right,B);
        }
        return result;
    }

    private boolean doesTreeHaveTree(TreeNode A, TreeNode B) {
        if(B==null)
            return true;
        if(A==null)
            return false;
        if(A.val!= B.val)
            return false;
        return doesTreeHaveTree(A.left, B.left)&&doesTreeHaveTree(A.right,B.right);
    }
}
