package cn.ascending.day02;

import java.util.Scanner;

//Armstrong number:equal to the sum of the cube of each digit
//371 = 27+343+1 which is equal to 3^3+7^3+1^3.
public class test07 {
    public static void main(String[] args) {
        int num, number, temp, total=0;
        System.out.println("please enter 3 digit number...");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();//todo
        sc.close();
        number=num;

        for(;number!=0;number/=10){
            temp=number%10;
            total=total+temp*temp*temp;
        }
        if(total==num){
            System.out.println(num+" is an Armstrong number");
        }else{
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
