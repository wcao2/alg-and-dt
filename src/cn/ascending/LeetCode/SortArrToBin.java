package cn.ascending.LeetCode;

//108
//https://blog.csdn.net/cui1004/article/details/107371682
public class SortArrToBin {
    public TreeNode sortedArrayToBST(int[] nums){
        if(nums.length==0){
            return null;
        }
        return dfs(nums,0,nums.length-1);
    }

    private TreeNode dfs(int[] nums, int low, int height){
        if(low>height){
            return null;
        }
        int mid=low+(height-low)/2;
        TreeNode root=new TreeNode(nums[mid]);
        //递归的构建左右子树
        root.left = dfs(nums,low,mid-1);
        root.right = dfs(nums,mid+1,height);

        return root;
    }
}
