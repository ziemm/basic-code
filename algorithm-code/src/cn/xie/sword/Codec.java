package cn.xie.sword;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: xie
 * @create: 2020-06-08 22:54
 **/
public class Codec {
    private String results;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null)
            return "[]";
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root); //
        results ="["+root.val;
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(tmp.left!=null){
                queue.offer(tmp.left);
                results+=","+tmp.left.val;
            }else {
                results+=",null";
            }

            //right
            if(tmp.right!=null){
                queue.offer(tmp.right);
                results+=","+tmp.right.val;
            }else {
                results +=",null";
            }
        }

        return results +="]";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.length()==2)
            return null;
        //去除首尾字符串
        data = data.substring(1,data.length()-1);
        //
        String[] vals = data.split(",");

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
        queue.offer(root);
        int i =1;//标记后续处理的节点值
        while (!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            if(vals[i].equals("null")){
                tmp.left=null;
            }else {
                tmp.left=new TreeNode(Integer.valueOf(vals[i]));
                queue.offer(tmp.left);
            }
            i++;
            if(vals[i].equals("null")){
                tmp.right=null;
            }else {
                tmp.right = new TreeNode(Integer.valueOf(vals[i]));
                queue.offer(tmp.right);
            }
            i++;
        }
        return root;
    }
}
