package cn.ascending.java65.day04;

import java.util.*;

public class test12 {
//    public void addTwoList(List<Integer> list1, List<Integer> list2){
//        list1.addAll(list2);
//    }
//        public static void findSameEle(ArrayList<Integer> list1, ArrayList<Integer> list2){
//            list1.retainAll(list2);
//            Iterator<Integer> it=list1.iterator();
//            while (it.hasNext()) {
//                System.out.println(it.next());
//            }
//        }

        public static void findNotSameEle(ArrayList<Integer> list1, ArrayList<Integer> list2){
            list1.addAll(list2);//1 2 3 2
            Map<Integer,Integer> map=new HashMap<>();
            for(Integer temp:list1){
                Integer count=map.get(temp);
                map.put(temp,(count==null)?1:count+1);
            }
            Set<Integer> set=map.keySet();
            for (Integer key : set) {
                Integer value=map.get(key);
                if(value<2){
                    System.out.println(key);
                }
            }
        }

        //remove all duplicated element from list1
        public static List<Integer> removeDuplicated(ArrayList<Integer> list1, ArrayList<Integer> list2){
            list1.removeAll(list2);
            Iterator<Integer> it=list1.iterator();
            List<Integer> listTemp=null;
            while (it.hasNext()) {
                listTemp=new ArrayList<>();
                listTemp.add(it.next());
            }
            return listTemp;
        }

        public static void divideBigNum(ArrayList<Double> list1){
            double sum=0;
            double num=0.00;
            for (int i=0;i<list1.size();i++){
                num=list1.get(i)/1000000000;
                sum=sum+num;
            }
            System.out.println("the average of these nums is "+sum/list1.size()+" billion");
        }

    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);

        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(3);
        list2.add(2);

        //test1.findSameEle(list1,list2);
//        test1.findNotSameEle(list1,list2);
        test12.removeDuplicated(list1,list2);
    }

}
