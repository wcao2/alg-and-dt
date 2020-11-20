package cn.ascending.LeetCode;

//112
public class Pathsum {
    public boolean hasPathSum(TreeNode root, int sum){
        if(root==null) return false;
        return pathSum(root,sum,0);
    }
    public boolean pathSum(TreeNode root, int sum, int currSum){
        if(root.left==null && root.right==null) return sum==currSum+root.val;
        if(root.left==null) return pathSum(root.right,sum,currSum+root.val);
        if(root.right==null) return pathSum(root.left,sum,currSum+root.val);
        return pathSum(root.left,sum,currSum+root.val) || pathSum(root.right,sum,currSum+root.val);
    }
}
