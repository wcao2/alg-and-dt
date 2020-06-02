package cn.ascending.java65.day04;

import java.util.HashMap;

public class Test11 {
    public static void main(String[] args) {
        characterCount("abcabc");
    }

    public static void characterCount(String inputStr){
        HashMap<Character,Integer> eachCharCountMap=new HashMap<>();
        //covert inputStr to char array
        char[] charArray=inputStr.toCharArray();
        //traverse each character into chararray
        for(char c:charArray){
            if(eachCharCountMap.containsKey(c)){
                eachCharCountMap.put(c,eachCharCountMap.get(c)+1);
            }else{
                eachCharCountMap.put(c,1);
            }
        }
        System.out.println(eachCharCountMap);
    }
}
