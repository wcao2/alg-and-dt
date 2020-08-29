package cn.ascending.ascendingAlgorithm.binary;

import cn.ascending.ascendingAlgorithm.support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
*  Node->Left->Right   bfs:Breadth First Search
* */
public class Bfs {
    public static List<List<Integer>> largestValues(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> result=new ArrayList<>();
        queue.offer(root);

        while(!(queue.isEmpty())){//if the queue is not empty
            int size=queue.size();
            List<Integer> list=new ArrayList<>();
            //遍历每一个层级
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();//get element and delete it from queue
                System.out.println(node.val);
                list.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }


    public static void main(String[] args) {
       /* Bfs dfs=new Bfs();
        TreeNode root=new TreeNode(5);
        TreeNode left=new TreeNode(4);
        TreeNode right=new TreeNode(1);
        root.left=left;
        root.right=right;*/
        TreeNode root=new TreeNode(5);
        TreeNode left1=new TreeNode(4);
        TreeNode right1=new TreeNode(1);
        root.left=left1;
        root.right=right1;
        left1.left=new TreeNode(3);
        left1.right=new TreeNode(2);
        right1.right=new TreeNode(2);
        Bfs.largestValues(root);
    }
}
