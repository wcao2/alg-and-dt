package cn.ascending.collection;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void finalPrice(List<Integer> prices) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        int finalNum=0;
        int max=0;
        for (int i = 0; i < prices.size(); i++) {
            for(int j=i+1;j<prices.size();j++){
                if(prices.get(i)>=prices.get(j)){
                    finalNum=prices.get(i)- prices.get(j)+finalNum;
                    break;
                }
                //????????????????
            }

        }
        System.out.println(finalNum);
        System.out.println(list);

    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(6);
        l1.add(4);l1.add(4);
        finalPrice(l1);

    }
}
