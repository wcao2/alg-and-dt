package cn.ascending.ascendingAlgorithm.binary;

//https://www.jdon.com/51818
import cn.ascending.ascendingAlgorithm.support.TreeNode;

import java.util.Stack;

public class Dfs {//Depth first search
    /*
     *  1: preorder: Node->Left->Right
     * */
    public static void preOrder(TreeNode n){
        if(n!=null){
            System.out.println(n);
        }else {
            return;
        }
        if(n.left!=null) preOrder(n.left);
        if(n.right!=null) preOrder(n.right);
    }

    //将递归算法转换为迭代算法的一种简单方法是使用堆栈数据结构
    public static void preOrderWithoutRecursion(TreeNode root) {
        Stack<TreeNode> nodes = new Stack<>();
        nodes.push(root);

        while (!nodes.isEmpty()) {
            TreeNode current = nodes.pop();
            System.out.printf("%s ", current);

            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }
    }

    /*
    *  2: Left->Node->Right
    * */
    public static void inOrder(TreeNode n){
        if(n.left!=null) inOrder(n.left);
        if(n!=null){
            System.out.println(n);
        }else{
            return;
        }
        if(n.right!=null) inOrder(n.right);
    }

    /*
     *  3: Left->Right->Node
     * */
    public static void PostOrder(TreeNode n){
        if(n.left!=null) PostOrder(n.left);
        if(n.right!=null) PostOrder(n.right);
        if(n!=null){
            System.out.println(n);
        }else{
            return;
        }

    }

    public static void main(String[] args) {
        //Dfs dfstest=new Dfs();
        TreeNode root=new TreeNode(5);
        TreeNode left1=new TreeNode(4);
        TreeNode right1=new TreeNode(1);
        root.left=left1;
        root.right=right1;
        left1.left=new TreeNode(3);
        left1.right=new TreeNode(2);
        right1.right=new TreeNode(2);
        Dfs.preOrder(root);
        System.out.println("--------------------");
        //Dfs.inOrder(root);
           // PostOrder(root);
        Dfs.preOrderWithoutRecursion(root);
    }
}


