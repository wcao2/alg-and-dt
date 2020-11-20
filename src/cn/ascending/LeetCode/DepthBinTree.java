package cn.ascending.LeetCode;

//104
public class DepthBinTree {
    public int maxDep(TreeNode root){
        if(root ==null){
            return 0;
        }

        int lh=maxDep(root.left);
        int rh=maxDep(root.right);

        int finalHeigt=Math.max(lh,rh)+1;
        return finalHeigt;
    }
}
