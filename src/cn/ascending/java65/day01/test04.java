package cn.ascending.java65.day01;

import java.util.HashSet;

public class test04 {
    public static void main(String[] args) {
        boolean result=false;
        String inputStr="  Alvi@wsom";
        System.out.println(inputStr);

        //todo
        HashSet<Character> uniqueCharacter=new HashSet<>();
        for (int i=0;i<inputStr.length();i++){
            result=uniqueCharacter.add(inputStr.charAt(i));//todo
            if(result==false) break;
        }
        System.out.println(result);
    }
}
