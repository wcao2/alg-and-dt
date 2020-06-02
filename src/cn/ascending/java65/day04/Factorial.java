package cn.ascending.java65.day04;

/*
*  find a factorial(阶乘) of a given number
* */
public class Factorial {

    //1: recursive (递归)
    public static int f1(int num){
        if(num==1){
            return 1;
        }else{
            return num*f1(num-1);
        }
    }

    //2: loop or iterative(i)
    public static int f2(int num){
        int result=1;
        if(num==1){
            return 1;
        }else{
            for(int i=2;i<=num;i++){
                result*=i;
            }
            return result;
        }
    }


}
