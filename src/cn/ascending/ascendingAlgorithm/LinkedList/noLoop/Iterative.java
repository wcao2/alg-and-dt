package cn.ascending.ascendingAlgorithm.LinkedList.noLoop;

import cn.ascending.ascendingAlgorithm.support.LinkedListNode;


/*
*  1: initialize the count as 0;
*  2: Initialize a node pointer, current=head
*  3: Do following while current is not NULL
*     a: current= current->next
*     b: count++;
*  4: return count;
* */
public class Iterative {
    //head of list
    LinkedListNode head;

    //insert a new Node at front of a list
    public void push(int data){
        LinkedListNode node=new LinkedListNode(data);
        //make next of new Node as head; last node address give to this node next(node next point to the last node)
        node.next=head;
        //move the head to point to the new Node
        head=node;
    }

    //get count of Nodes in linked list
    public int getCount(){
        LinkedListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        Iterative llist = new Iterative();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        int num = llist.getCount();
        System.out.println(num);
    }
}
