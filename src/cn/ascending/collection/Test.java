package cn.ascending.collection;

import java.util.*;

public class Test {
    public static String featuredProduct(List<String> products) {
        //1:traverse the list and count the number of each element
        if(products==null || products.size()==0) return null;
        Map<String, Integer> map = new HashMap<>();
        for(String temp:products){
            Integer count = map.get(temp);
            map.put(temp,(count==null)?1:count+1);
        }
        //2:
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        int max=0;
        while(it.hasNext()){
            String key = it.next();
            Integer integer = map.get(key);
            if(max<integer){
                max=map.get(key);
            }
        }
        List list = test(map, max);
        Collections.sort(list);
        String lastOne =(String) list.get(list.size() - 1);
        return lastOne;
    }

    //3
    public static List test(Map map,Object o){
        ArrayList<Object> list = new ArrayList<>();
        Set set = map.keySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            String key = (String)it.next();
            if(o.equals(map.get(key))){
                list.add(key);
            }
        }
        return list;
    }

}
