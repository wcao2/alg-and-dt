package cn.ascending.java65.day04;

import java.util.HashMap;
import java.util.Scanner;

/*
*  find the fist non-repeated character in String
* */
public class Test11supplement {
    public static void main(String[] args) {
        System.out.println("please enter the input string: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char c=characterCount(s);
        System.out.println(c);
    }

    public static Character characterCount(String inputStr){
        HashMap<Character,Integer> charCountMap=new HashMap<>();
        int i,length;
        Character c;
        length=inputStr.length();
        for(i=0;i<length;i++){
            c= inputStr.charAt(i);
            if(charCountMap.containsKey(c)){
                charCountMap.put(c,charCountMap.get(c)+1);
            }else{
                charCountMap.put(c,1);
            }
        }

        //find the letter which only shows once
        for(i=0;i<length;i++){
            c=inputStr.charAt(i);
            if(charCountMap.get(c)==1) return c;
        }
        return null;
    }
}
