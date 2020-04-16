package cn.ascending.ascendingAlgorithm.hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashTest {
    public static void main(String[] args) {
        Map<DataKey, Integer> hm=getAllData();

        DataKey dk=new DataKey();
        dk.setId(1);
        dk.setName("Ryo");
        System.out.println("2: "+dk.hashCode());
        hm.put(dk,11);//之前的先出站
        //System.out.println(hm.keySet());

        Integer value=hm.get(dk);
        System.out.println("3: "+value);
    }

    private static Map<DataKey,Integer> getAllData(){
        Map<DataKey,Integer> hm=new HashMap<>();
        DataKey dk=new DataKey();
        dk.setId(1);
        dk.setName("Ryo");
        System.out.println("1: "+dk.hashCode());
        hm.put(dk,10);
        return hm;
    }
}
