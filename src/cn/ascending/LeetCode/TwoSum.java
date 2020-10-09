package cn.ascending.LeetCode;

//1
public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target-nums[i]){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("there is no solution");
    }

    public static void main(String[] args) {
        int [] arr={2,5,3};


        int[] arr1=twoSum(arr,5);
        System.out.println(arr1[0]+"  "+arr1[1]);
    }
}
