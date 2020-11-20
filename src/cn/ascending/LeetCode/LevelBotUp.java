package cn.ascending.LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//107
public class LevelBotUp {
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        List<List<Integer>> out=new ArrayList<>();
        if(root==null) return out;
        Queue<TreeNode> queue=new LinkedList<>();
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                level.add(curr.val);

                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
            //可以在插入操作过程中指定插入的位置，此时，会自动将当前位置及只有的元素后移进行插入
            out.add(0, level);
        }
        return out;
    }
}
