package cn.ascending.LeetCode;

//53
public class MaxArr {
    public static int maxSubArray(int[] nums){
        int result=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=Math.max(nums[i]+sum,nums[i]);
            result=Math.max(result,sum);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,-5};
        System.out.println(maxSubArray(nums));
    }
}
