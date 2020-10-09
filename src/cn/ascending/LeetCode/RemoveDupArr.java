package cn.ascending.LeetCode;

//26  Remove Duplicates from Sorted Array
public class RemoveDupArr {
    public static int[] removeDup(int[] nums){
        int i=0;
        int k=0;
        int[] arr1=new int[nums.length];
        for(int j=1;j<nums.length;++j){
            if(nums[j]==nums[i]){
                arr1[k]=j;
                ++k;
            }else{
                nums[++i]=nums[j];
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,3,5};
        int[] arr2=removeDup(arr);
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]!=0)
                System.out.println(arr2[i]);
        }
    }
}
