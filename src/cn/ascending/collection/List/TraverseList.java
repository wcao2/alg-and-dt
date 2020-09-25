package cn.ascending.collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TraverseList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);//已经不是地址值 重写toString()方法 [b, b, c, d]
        System.out.println(list.toString());//same as above

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------");
        //2:
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);
        }
        System.out.println("----------------------");
        //3: enhanced for loop
        for (String s : list) {
            System.out.println(s);
        }

    }
}
