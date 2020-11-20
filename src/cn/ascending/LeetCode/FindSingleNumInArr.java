package cn.ascending.LeetCode;

import java.util.ArrayList;
import java.util.List;

//136
/*任何数和本身的异或为0
任何数与0的异或结果是自身
异或满足交换律，a^b^c = c^b^a*/
//适用于只有一个不重复
public class FindSingleNumInArr {
    // 1:without using extra memory
    public static int singleNum1(int[] nums){
        int result=0;
        for(int i:nums){
            result^=i;
        }
        return result;
    }

    // 2: with extra memory
    public static int singleNum2(int[] nums){
        List<Integer> no_dup_list = new ArrayList<>();
        for(int i:nums){
            if(!no_dup_list.contains(i)){
                no_dup_list.add(i);
            }else {
                no_dup_list.remove(new Integer(i));
            }
        }
        return no_dup_list.get(0);
    }

    public static void main(String[] args) {
        int[] arr={1,2,4,4,1};
        System.out.println(singleNum2(arr));
    }
}
