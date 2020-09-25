package cn.ascending.collection.TreeSet;

import java.util.Comparator;

public class TSComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        //String implements Comparable interface
        return s2.compareTo(s1);//ascii降序
    }
}
