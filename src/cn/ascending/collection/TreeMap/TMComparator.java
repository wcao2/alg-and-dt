package cn.ascending.collection.TreeMap;

import java.util.Comparator;

public class TMComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        //Employee is key
        //salary ascending
        return (int)(e1.getSalary() - e2.getSalary());//升序
        //or
//        if(e1.getSalary()>e2.getSalary()){
//            return 1;
//        }else if(e1.getSalary()<e2.getSalary()){
//            return -1;
//        }else {
//            return 0;
//        }
    }
}