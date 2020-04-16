package cn.ascending.day01;

import java.util.HashSet;

//How to find intersection of two arrays in java?
//two arrays array1= {1,4,7, 9, 2} arrray2 = {1,7,3,4,5} the answer should be {1,4}
public class test03 {
    public static int[] interaction(int[] num1, int[] num2){
        HashSet<Integer> set1=new HashSet<Integer>();
        for(int i:num1){
            set1.add(i);
        }


        //TODO
        HashSet<Integer> set2=new HashSet<Integer>();
        for(int i:num2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] result=new int[set2.size()];
        int i=0;
        for (int n:set2){
            result[i++]=n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num1={1,2,3,4,5};
        int[] num2={2,3,4};
        int[] newArray=interaction(num1,num2);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]);
        }
    }
}
