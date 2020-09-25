package cn.ascending.java65.day04;

import java.util.ArrayList;
import java.util.List;

public class Test13 {
    public static void main(String[] args) {
//        int[] numbers=new int[]{1,2,3,4};
//        int result=0;
//        for(int number:numbers){
//            result*= number;
//        }
//        System.out.println(result); 0
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        List<Integer> r= Test13.someFunc(list1);
        System.out.println(r.get(1));
    }

    public static List<Integer> someFunc(final List<Integer> nums){
        List<Integer> result=new ArrayList<Integer>();
        for(int i=nums.size()-1;i>=0;i--){
            result.add(nums.get(i));
        }
        return result;
    }
}
