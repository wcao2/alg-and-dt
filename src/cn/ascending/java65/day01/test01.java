package cn.ascending.java65.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//How to reverse a String in java?
public class test01 {
    public static void main(String[] args) throws IOException {
        String input="";
        System.out.println("Enter the input String...");
        try{
            //TODO
//            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//            input=br.readLine();
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            //convert String to character array by using the built in java String class method toCharArray().
            char[] array1=s.toCharArray();
            int i;
            for (i = array1.length-1; i >=0; i--) {
                if(i==0){
                    System.out.println(array1[i]);
                }else {
                    System.out.print(array1[i]);
                }

            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
