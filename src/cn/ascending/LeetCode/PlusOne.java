package cn.ascending.LeetCode;

//66
public class PlusOne {
    public static int[] pulsOne(int[] digits){
        int n=digits.length;
        for(int i=digits.length-1;i>=0;--i){
            if(digits[i]<9){
                ++digits[i];
                return digits;
            }
            digits[i]=0;
        }
        int[] res=new int[n+1];
        res[0]=1;
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,9};
        int[] ints = pulsOne(arr);
        for(int i:ints){
            System.out.print(i+", ");
        }
    }
}
