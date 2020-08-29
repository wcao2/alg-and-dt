package cn.ascending.java65.day02;

//How to remove all the white-spaces in the String?
public class test06 {
    static int i;

    static void sequeeze(String s){
        for(i=0;i<s.length();i++){
            char ch=s.charAt(i);
            /*if((i==s.length()-1)&&ch!=' '){
                System.out.println(ch);
            }else */if(ch!=' '){
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Original String is...");
        sequeeze("A B C D E F G HI GK LMN");
    }
}
