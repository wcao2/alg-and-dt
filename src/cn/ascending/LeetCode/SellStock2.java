package cn.ascending.LeetCode;


public class SellStock2 {
    public static int maxProfit(int[] prices){
        int res=0;
        for (int i = 0; i < prices.length-1; i++) {
            if(prices[i]<prices[i+1]){
                res+=prices[i+1]-prices[i];
            }
        }
        return res;
    }

    //1,2,4  第一天买第二天卖 第二天再买第三天卖
    public static void main(String[] args) {
        int[] arr={1,2,4,2,7};
        System.out.println(maxProfit(arr));
    }
}
