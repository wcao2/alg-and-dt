package cn.ascending.LeetCode;

//69
public class Sqrt {
    public static int mySqrt(int x){
        if(x==0){
            return 0;
        }
        long beforeValue=1;
        for(int i=1;i<x;i++){
            if(i*i>x){
                break;
            }
            beforeValue=i;
        }
        return (int)beforeValue;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(7));
    }
}
