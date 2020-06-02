package cn.ascending.ascendingAlgorithm.array;

import java.util.ArrayList;
import java.util.List;

/*
*   Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
    Find all the elements that appear twice in this array.
    Could you do it without extra space and in O(n) runtime?

    Each value in a array is between the value of 1 and the length of the array  [1,4]
* */
public class findDup {
    public static List<Integer> findDup(int[] nums){
        List<Integer> res=new ArrayList<>();
        for (int i = 0; i <nums.length ; i++) {//i [0,3]
            int index=Math.abs(nums[i])-1;//两个相同的数 得到的新的index应该值相等 ||  index可能为最大的数字=length || 用绝对值因为可能已经调换过了
            if(nums[index]<0)//说明之前已经被调换为负数
                res.add(index+1);//因为index是真实的数字-1过来的 所以还要加1
            nums[index]=-nums[index];
        }
        return res;
    }

    //user extra space
//    public static List<Integer> findDup1(int[] nums){
//        List<Integer> result=new ArrayList<>();
//        int[] count=new int[nums.length+1];//因为ele可能要当count数组的index,若nums为8的数组 最大的ele可能为8,所以初始化新数组count一定要为9
//        for (int i = 0; i <nums.length ; i++) {
//            count[nums[i]]++;//default is 0
//        }
//        for (int i = 0; i <count.length ; i++) {
//            if(count[i]==2){
//                result.add(i);
//            }
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] arr={4,3,3,3};
        //System.out.println(arr.length);
        List<Integer> list=findDup.findDup(arr);
        //遍历list
        //1
        for(int a:list){
            System.out.println(a);
        }
        //2
//        Iterator it1=list.iterator();
//        while (it1.hasNext()){//判断集合中还有没有可以被取出的元素,如果有返回true
//            System.out.println(it1.next());
//        }

    }
}
