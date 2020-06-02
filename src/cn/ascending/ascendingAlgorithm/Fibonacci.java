package cn.ascending.ascendingAlgorithm;

public class Fibonacci {
    public static int fi(int n, int[] arrs) {
        if(arrs[n]!=0) return arrs[n];
        if(n==0 ){
            arrs[n]=1;
            return 0;
        }else if(n==1){
            arrs[n]=2;
            return 1;
        } else {
            arrs[n]=fi(n - 1,arrs) + fi(n - 2,arrs);
            return arrs[n];
        }
    }

    public static void main(String[] args) {
        int a=fi(0,new int[18]);
        System.out.println(a);
    }

}
