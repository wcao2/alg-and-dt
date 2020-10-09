package cn.ascending.java65;

import java.util.Arrays;
//find the largest sibling of an int value
public class Sibling {
    public static int sib(int n){
        String str =Integer.toString(n);
        int[] arr = new int[str.length()];//dynamic initialization
        for(int i=0; i<arr.length; i++){
            char c = str.charAt(i);
            String s = String.valueOf(c);
            int num = Integer.parseInt(s);
            arr[i] = num;
        }
        Arrays.sort(arr);
        //int[] newArr=new int[arr.length];
        String newStr="";
        for(int i=arr.length-1;i>=0;i--){
            //System.out.println(arr[i]);
            newStr=newStr+arr[i];
        }
        int newInt = Integer.parseInt(newStr);
        return newInt;
    }

    public static void main(String[] args) {
        System.out.println(sib(213));
    }
}
