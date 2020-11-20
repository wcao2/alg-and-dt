package cn.ascending.LeetCode;

public class SellStock {
    //time complexity o(n^2), space complexity o(1)
    public int maxProfit(int[] prices){
        int max=0;
        for (int i = 0; i < prices.length; ++i) {//i++需要借助临时存储空间(不是专业术语，理解就好)来存储加一以后的值，而++i直接加一就可以赋值给i
            for (int j = i+1; j < prices.length; j++) {
                if(prices[j]>prices[i]){
                    int profit=prices[j]-prices[i];
                    max=Math.max(max,profit);
                }
            }
        }
        return max;
    }

    //time complexity o(n), space complexity o(1)
    public int maxProfit1(int[] prices){
        int max=0;//MAX PROFIT
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){
                min=prices[i];//当成立 更新后面更小的， 更小的后面再和更小的相减
            }else {
                max=Math.max(max,prices[i]-min);
            }
        }
        return max;
    }
}
