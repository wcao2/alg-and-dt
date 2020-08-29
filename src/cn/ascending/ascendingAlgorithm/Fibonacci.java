package cn.ascending.ascendingAlgorithm;

public class Fibonacci {
    public static int fi(int n) {
       // if(arrs[n]!=0) return arrs[n];
        if(n==1||n==2){
            //arrs[n]=2;
            return 1;
        } else {
            return fi(n - 1) + fi(n - 2);
        }
    }

    public static void main(String[] args) {
        int a=fi(6);
        System.out.println(a);
    }

}
