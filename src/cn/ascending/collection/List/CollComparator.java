package cn.ascending.collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollComparator {
    public static void main(String[] args) {
        ArrayList<Person> list=new ArrayList<>();
        list.add(new Person("A",12));
        list.add(new Person("B",13));
        list.add(new Person("C",10));
        System.out.println("before sort list is "+list);
        Collections.sort(list);//ascending
        System.out.println(list);
        //define comparator
        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person t1, Person t2) {
                int result= t1.getAge()-t2.getAge();
                //if age same, use name first letter
                if(result==0){
                    result=t1.getName().charAt(0)-t2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list);//descending
    }
}

