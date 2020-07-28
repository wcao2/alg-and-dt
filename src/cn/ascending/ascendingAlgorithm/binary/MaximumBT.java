package cn.ascending.ascendingAlgorithm.binary;

import cn.ascending.ascendingAlgorithm.support.TreeNode;

//https://blog.csdn.net/a1439775520/article/details/105275542
public class MaximumBT {
    //get the max index from left zone to right zone
    public int maxIndex(int[] nums,int l,int r){
        int max_i=l;
        for(int i=l;i<r;i++){
            if(nums[max_i]<nums[i]){
                max_i=i;
            }
        }
        //return the biggest ele's index in the given array in a specific range
        return max_i;
    }

    public TreeNode construct(int nums[] , int l, int r){//从上往下执行，从下往上返回
        if(l == r) return null;
        int max_i = maxIndex(nums,l,r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, l, max_i);
        root.right = construct(nums, max_i+1, r);
        return root;
    }

    public  TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

}
