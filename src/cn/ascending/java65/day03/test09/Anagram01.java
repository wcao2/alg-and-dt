package cn.ascending.java65.day03.test09;

import java.util.Arrays;

/*
*  Anagram:If two strings contain same set of characters but in different order then the two strings are called anagrams.
* */
public class Anagram01 {
    public static void main(String[] args) {
        boolean result=isAnagram("Trump","ru mtp1");
        System.out.println(result);
    }

    public static boolean isAnagram(String first,String second){
        //1:convert the two strings to lower case and remove all white space
        //The string \s is a regular expression that means "whitespace",
        // and you have to write it with two backslash characters ( "\\s" ) when writing it as a string in Java.
        first=first.replaceAll("\\s","").toLowerCase();
        second=second.replaceAll("\\s","").toLowerCase();
        //2: check the string lengths are equal or not
        if(first.length()!=second.length()) return false;
        //3: convert string to char array
        char[] firstArray=first.toCharArray();
        char[] secondArray=second.toCharArray();
        //4:sort both array
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        //5: checking whether both strings are equal or not
        //检查两个数组是否包含相同数量的元素，并且两个数组中的所有相应元素对是否相等。
        return Arrays.equals(firstArray,secondArray);

        //array equals extends from object, 只有当两个对象的引用相同时才返回true
        //boolean b=firstArray.equals(secondArray);
    }
}
