package cn.ascending.ascendingAlgorithm.binary;


import cn.ascending.ascendingAlgorithm.support.TreeNode;

import java.util.*;
//Given a binary tree, find the lowest common ancestor of two given nodes in the tree.
/*
*   1:Start from the root node and traverse the tree.
    2:Until we find p and q both, keep storing the parent pointers in a dictionary.
    3:Once we have found both p and q, we get all the ancestors for p using the parent dictionary and add to a set called ancestors.
    4:Similarly, we traverse through ancestors for node q. If the ancestor is present in the ancestors set for p,
    this means this is the first ancestor common between p and q (while traversing upwards) and hence this is the LCA node.
* */
public class Lca {
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        //stack for tree traversal
        Stack<TreeNode> stack = new Stack<>();
        //hashmap for parent pointers
        Map<TreeNode,TreeNode> parent=new HashMap<>();

        parent.put(root,null);
        stack.push(root);

        //Iterate until find both p and q    (没有包含p或者没有包含q)
        while(!parent.containsKey(p)||!parent.containsKey(q)){
            //remove and return the first node in stack
            TreeNode node=stack.pop();
            //traversing the tree, keep saving the parent pointers
            if(node.left!=null){
                parent.put(node.left,node);//children,itself
                stack.push(node.left);//put the leaf ele to stack
            }
            if(node.right!=null){
                parent.put(node.right,node);
                stack.push(node.right);
            }
        }
        //Ancestor set() for node p
        Set<TreeNode> ancestors=new HashSet<>();

        //process all ancestors for node p using parent pointers
        while(p!=null){
            ancestors.add(p);
            p=parent.get(p);//get p's all ancestor include itself
        }
        //the first ancestor of q which appears in p's ancestor(set() ), is their lowest common ancestor
        while(!ancestors.contains(q))
            q=parent.get(q);//get the parent of q and set it to q
        return q;
    }
}
