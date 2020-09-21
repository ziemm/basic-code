package cn.xie.homework2;

import cn.xie.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author: xie
 * @create: 2020-09-20 14:07
 **/
public class HaoWeiLai01 {
    public String notReCuPreOrder (TreeNode root) {
        // write code here
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null)
            return "";
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            res.add(node.val);
            if(node.right!=null)
                stack.push(node.right); //先push右节点
            if(node.left!=null)
                stack.push(node.left);
        }

        String ans =null;
        for (Integer re : res) {
            ans += re;
            ans +=",";
        }
        String sub = ans.substring(0, ans.length() - 1);
        return '"'+sub+'"';
    }
}
