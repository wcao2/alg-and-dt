package cn.ascending.ascendingAlgorithm.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
*  Queue是一种特殊的线性表 只允许在表的前端进行删除操作 在表的后端进行插入操作
*  LinkedList类实现了Queue接口 因此可以把LinkedList当做Queue使用
* */
public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue=new LinkedList<String>();
        //add element
        queue.offer("z");
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        for (String e:queue)
            System.out.println(e);
        System.out.println("===============");
        //get the first element  [If the queue is empty, element throws NoSuchElementException , while peek returns null]
        System.out.println("the first element: "+queue.element());
        System.out.println("===============");
        //get the first element
        System.out.println("the first element: "+queue.peek());
        System.out.println("===============");
        //get the first element and delete it from queue
        System.out.println("the first element will be removed "+queue.poll());
        for(String q:queue)
            System.out.println(q);
    }
}
