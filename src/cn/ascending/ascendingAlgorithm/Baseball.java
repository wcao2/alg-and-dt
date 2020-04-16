package cn.ascending.ascendingAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class Baseball {
    //calc and save the every round points and get the total sum of the array
    public static int calPoints(String[] elements){
        List<Integer> list=new ArrayList<>();
        for(String ele:elements){
            int n=list.size();
            if(ele.equals("+")){
                list.add(list.get(n-1)+list.get(n-2));
            }else if(ele.equals("C")){
                list.remove(n-1);
            }else if(ele.equals("D")){
                list.add(list.get(n-1)*2);
            }else{
                //parseInt() 方法用于将字符串参数作为有符号的十进制整数进行解析。
                list.add(Integer.parseInt(ele));
            }
        }
        return list.stream().reduce(0,Integer::sum);
    }

    public static void main(String[] args) {
        String[] elements={"1","2","+"};
        int result=Baseball.calPoints(elements);
        System.out.println(result);
    }
}
