package cn.ascending.ascendingAlgorithm.array;
//找到指定倒数第几个元素
import java.util.Arrays;

public class findKthLar {
    public  int findKth(int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        int[] arr={2,9,3,4,5,8,7};
        int a=findKthLar.class.newInstance().findKth(arr,3);
        System.out.println(a);
    }
}
