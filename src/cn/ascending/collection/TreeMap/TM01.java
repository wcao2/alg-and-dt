package cn.ascending.collection.TreeMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TM01 {
    public static void main(String[] args) {
        Employee e=new Employee("a","b",500);
        System.out.println(e.toString());//same: System.out.println(e);
        System.out.println(e.hashCode());

        TreeMap<Employee,String> empTreeMap = new TreeMap<>(new TMComparator());//若Employee作为key,则必须指定comparator

        empTreeMap.put(new Employee("Steve", "Smith", 2500), "0001");
        empTreeMap.put(new Employee("John", "Doe", 1500), "0002");
        empTreeMap.put(new Employee("Alex", "Rock", 4500), "0003");
        empTreeMap.put(new Employee("Tim", "Bax", 1000), "0004");

        Set<Map.Entry<Employee,String>> set=empTreeMap.entrySet();
        for(Map.Entry<Employee,String> entry:set){
            System.out.println(entry.getKey()+" <--> "+entry.getValue());
        }
        // System.out.println(empTreeMap);
    }
}
