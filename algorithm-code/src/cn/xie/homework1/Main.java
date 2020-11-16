package cn.xie.homework1;
import cn.xie.TreeNode;

import java.util.*;

/**
 * @author: xie
 * @create: 2020-08-23 15:55
 **/
public class Main {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        boolean res = false;
        if(A!=null &&  B!=null){
            if(A.val==B.val)
                res = doseTreeHasTree(A,B);
            if(!res)
                res = isSubStructure(A.left,B);
            if(!res)
                res = isSubStructure(A.right,B);
        }
        return res;
    }

    private boolean doseTreeHasTree(TreeNode A, TreeNode B) {
        if(B==null)
            return true;
        if(A==null)
            return false;
        if(A.val!=B.val)
            return false;
        return doseTreeHasTree(A.left,B.left)&&doseTreeHasTree(A.right,B.right);
    }
}
