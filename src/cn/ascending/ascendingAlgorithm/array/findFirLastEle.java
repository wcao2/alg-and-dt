package cn.ascending.ascendingAlgorithm.array;
//https://www.youtube.com/watch?time_continue=19&v=bU-q1OJ0KWw&feature=emb_logo
//find the first and last position of the Element in sorted Array
public class findFirLastEle {
    public static int[] searchRange(int[] nums,int target){
        int[] result=new int[2];
        result[0]=findStartingIndex(nums,target);
        result[1]=findEndingIndex(nums,target);
        return result;
    }

    public static int findStartingIndex(int[] nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int midpoint=start+(end-start)/2;
            if(nums[midpoint]>=target){//due to want to find the first occurrence of the duplicates
                end=midpoint-1;
            }else {
                start=midpoint+1;
            }
            if(nums[midpoint]==target) index=midpoint;
        }

        return index;
    }

    public static int findEndingIndex(int[] nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int midpoint=start+(end-start)/2;
            if(nums[midpoint]<=target){
                start=midpoint+1;//keep going to the rightmost one
            }else{
                end=midpoint-1;
            }
            if(nums[midpoint]==target) index=midpoint;
        }

        return index;
    }

    public static void main(String[] args) {
            int[] arr={1,2,3,3,4,5};
            int[] res= findFirLastEle.searchRange(arr,3);
            for(int a:res){
                System.out.println(a);
            }
    }
}
