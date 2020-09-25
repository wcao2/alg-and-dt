package cn.ascending.collection.TreeSet;

import java.util.TreeSet;

public class TS02 {
    public static void main(String[] args) {
        TreeSet<String> tree_set=new TreeSet<>(new TSComparator());
        tree_set.add("G");
        tree_set.add("E");
        tree_set.add("E");
        tree_set.add("K");
        tree_set.add("S");
        tree_set.add("4");
        System.out.println("The elements sorted in descending by using comparator "+tree_set);//[S, K, G, E, 4]
    }
}
