package cn.ascending.collection;

import java.util.*;

public class SortedValue {
    public static void main(String[] args) {
        Map< Integer, String> map=new HashMap<Integer, String>();

        map.put(101, "Hemendra");
        map.put(99, "Andrew");
        map.put(103, "Anish");
        map.put(18, "Mohan");
        map.put(11, "Christine");
        map.put(109, "Rebeca");
        map.put(111, "David");
        map.put(19, "Rahim");
        map.put(10, "Krishna");
        List<Map.Entry<Integer, String>> entries = new ArrayList<>(map.entrySet());
        //before sort
        for(int i=0;i<entries.size();i++){
            String value=entries.get(i).toString();
            System.out.println(value);
        }

        System.out.println("-----------------------------");
        Collections.sort(entries, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> t1, Map.Entry<Integer, String> t2) {
                return t1.getValue().compareTo(t2.getValue());
            }
        });

        //after sort(based on value)
        for(int i=0;i<entries.size();i++){
            String value=entries.get(i).toString();
            System.out.println(value);
        }
    }
}
