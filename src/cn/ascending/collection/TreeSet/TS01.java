package cn.ascending.collection.TreeSet;

import java.util.TreeSet;

public class TS01 {
    public static void main(String[] args) {
        TreeSet<String> tree_set=new TreeSet<>();
        tree_set.add("G");
        tree_set.add("E");
        tree_set.add("E");
        tree_set.add("K");
        tree_set.add("S");
        tree_set.add("4");
        System.out.println("Set before using the comparator: "+tree_set);//[4, E, G, K, S]
    }

}

