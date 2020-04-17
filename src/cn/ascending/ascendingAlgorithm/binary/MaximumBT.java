package cn.ascending.ascendingAlgorithm.binary;

import cn.ascending.ascendingAlgorithm.support.TreeNode;

//https://blog.csdn.net/a1439775520/article/details/105275542
public class MaximumBT {
    //get the max index from l to r
    public int maxIndex(int[] nums,int l,int r){
        int max_i=l;
        for(int i=l;i<r;i++){
            if(nums[max_i]<nums[i]){
                max_i=i;
            }
        }
        return max_i;
    }

    public TreeNode construct(int nums[] , int l, int r){
        if(l == r) return null;
        int max_i = maxIndex(nums,l,r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, l, max_i);
        root.right = construct(nums, max_i+1, r);
        return root;
    }

}
