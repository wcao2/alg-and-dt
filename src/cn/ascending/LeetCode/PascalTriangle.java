package cn.ascending.LeetCode;

import java.util.ArrayList;
import java.util.List;

//118
//i : row number j: the nth element in the one row
public class PascalTriangle {
    public static List<List<Integer>> generate(int A){
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < A; i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j <=i ; j++) {
                if(j==0){
                    li.add(1);
                }else if(i==j){
                    li.add(1);
                }else {
                    li.add(arr.get(i-1).get(j)+arr.get(i-1).get(j-1));
                }
            }
            arr.add(li);
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));

    }
}
