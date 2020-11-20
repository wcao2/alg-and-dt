package cn.ascending.ascendingAlgorithm;

import java.util.*;

//https://leetcode.com/discuss/interview-question/862600/amazon-oa-2020-fraudulent-activity
public class AmazonOA {
    public List<String> getUsers(List<String> logs, int threshold){
        List<String> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(String log:logs){
            String[] logValue = log.split(" ");
            Set<String> set=new HashSet<>(Arrays.asList(logValue[0], logValue[1]));
            for(String userId:set){
                map.put(userId,map.getOrDefault(userId,0)+1);
            }
        }
        for(String userId:map.keySet()){
            if(map.get(userId)>=threshold){
                res.add(userId);
            }
        }
        Collections.sort(res);
        return res;
    }
}
