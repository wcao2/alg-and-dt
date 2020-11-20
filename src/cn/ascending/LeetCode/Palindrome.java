package cn.ascending.LeetCode;

public class Palindrome {
    public boolean isPalindrome(String s){
        int i=0;
        int j=s.length()-1;
        s = s.toLowerCase();
        while(i<j){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                //continue:结束本次循环
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }
            if(s.charAt(j)!=s.charAt(i)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
