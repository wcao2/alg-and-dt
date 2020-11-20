package cn.ascending.ascendingAlgorithm;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

//https://leetcode.com/discuss/interview-question/861453/amazon-oa-2020-items-in-containers
//https://www.jianshu.com/p/2dcff3634326
public class AmazonOA1 {
    public static List<Integer> numberOfItems(String s, List<Integer> startIndices, List<Integer> endIndices){
        TreeMap<Integer,Integer> treeMap=new TreeMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='|'){
                treeMap.put(i,count);
            }else{
                count++;
            }
        }

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<startIndices.size();i++){
            list.add(testNum(treeMap,startIndices.get(i)-1,endIndices.get(i)-1));
        }
        return list;
    }


    static int testNum(TreeMap<Integer,Integer> treeMap, int start, int end){
        //ceiling: >=key 的第一个元素
        if(treeMap.floorEntry(end)==null || treeMap.ceilingEntry(start)==null){
            return 0;
        }
        int i=treeMap.floorEntry(end).getValue()-treeMap.ceilingEntry(start).getValue();
        return Math.max(i,0);
    }

}
