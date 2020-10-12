package cn.ascending.LeetCode;

public class MergeSortedArr {
    public static int[] merge(int[] arr1, int m, int[] arr2, int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while (i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                System.out.println("====================");
                arr1[k--]=arr1[i--];
            }else {
                System.out.println("---------------");
                arr1[k--]=arr2[j--];
            }
        }
        while (j>-0){
            arr1[k--]=arr2[j--];
        }

        return arr1;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,0,0,0,0,0};
        int[] b={6,7,8,9,10};
        int[] c=merge(a,5,b,5);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
