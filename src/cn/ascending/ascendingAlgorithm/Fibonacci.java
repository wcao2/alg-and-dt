package cn.ascending.ascendingAlgorithm;

// Fibonacci sequence ----> 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
public class Fibonacci {
    //find the pointed position's value
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
        int a=fi(3);
        System.out.println(a);
    }

}
