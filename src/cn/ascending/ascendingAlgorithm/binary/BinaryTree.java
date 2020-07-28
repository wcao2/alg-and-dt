package cn.ascending.ascendingAlgorithm.binary;

import cn.ascending.ascendingAlgorithm.support.TreeNode;

public class BinaryTree {
    //Find the Maximum Depth or Height of a Tree
    TreeNode root;
    /* Compute the "maxDepth" of a tree -- the number of
       nodes along the longest path from the root node
       down to the farthest leaf node.*/
    int maxDepth(TreeNode node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.left);
            int rDepth = maxDepth(node.right);

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        System.out.println("Height of tree is : " +
                tree.maxDepth(tree.root));
    }
}
