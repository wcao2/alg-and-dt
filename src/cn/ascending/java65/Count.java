package cn.ascending.java65;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Count {

    public static void reversiveStr(String str){
        //1:使用scanner获取用户输入的字符串
       /* Scanner sc=new Scanner(System.in);
        System.out.println("please input string: ");
        String str=sc.next();*/
        //2:创建map集合 key是字符串的字符 value是字符的个数
        HashMap<Character,Integer> map=new HashMap<>();
        //3:遍历字符串 获取每一个字符
        for(char c:str.toCharArray()){
            //4:
            if(map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        //5:
        for(Character key:map.keySet()){
            Integer value = map.get(key);
//            if(value==2){
                System.out.println(key+"===>"+value);
//            }
        }
    }

    public static void main(String[] args) {
       reversiveStr("abcbd");
    }
}
