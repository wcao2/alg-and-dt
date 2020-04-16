package cn.ascending.ascendingAlgorithm.binary.bigNode;

import cn.ascending.ascendingAlgorithm.support.TreeNode;

import java.util.*;

/*
*  fina largest value in each row
* */
public class Bfsway {
    public List<Integer> largestValues(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                //get the first element and delete it from queue
                TreeNode treeNode=queue.poll();
                max=Math.max(max,treeNode.val);
                //
                if(treeNode.left!=null) queue.offer(treeNode.left);
                if(treeNode.right!=null) queue.offer(treeNode.right);
            }
            res.add(max);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode node=new TreeNode(1);
        node.left=new TreeNode(2);
        node.right=new TreeNode(3);
        node.left.left=new TreeNode(2);
        node.right.left=new TreeNode(5);
        Bfsway b=new Bfsway();
        List<Integer> list=b.largestValues(node);
        //1: traverse list advance for
       /* for(Integer value:list){
            System.out.println(value);
        }*/
        //2: Iterator
        Iterator it1=list.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
