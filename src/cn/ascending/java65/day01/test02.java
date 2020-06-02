package cn.ascending.java65.day01;

import java.util.HashMap;
import java.util.Scanner;

//Find The First Non Repeated Character In A String
//If the word "stress" is input  then it should print  't'   as output .
public class test02 {
    public static void main(String[] args) {
        System.out.println("please input the string");
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        char c=firstNoRepeatedChar(s);
        System.out.println("the first non repeated character is: "+c);
    }

    public static Character firstNoRepeatedChar(String str){
        HashMap<Character,Integer> ht=new HashMap<Character, Integer>();
        int i,length;
        Character c;
        length=str.length();
        for (i = 0; i < length; i++) {
             c=str.charAt(i);
             if (ht.containsKey(c)){
                 ht.put(c,ht.get(c)+1);
             }else{
                 ht.put(c,1);
             }
        }

        for(i=0;i<length;i++){
            c=str.charAt(i);
            if(ht.get(c)==1){
                return c;
            }
        }
        return null;
    }
}
