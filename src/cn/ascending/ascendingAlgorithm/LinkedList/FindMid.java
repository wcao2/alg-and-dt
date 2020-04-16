package cn.ascending.ascendingAlgorithm.LinkedList;

import cn.ascending.ascendingAlgorithm.support.LinkedListNode;


public class FindMid {
    public LinkedListNode findMidNode(LinkedListNode head){
        if(head==null)
           return head;
        LinkedListNode slowPointer=head;
        LinkedListNode fastPointer=head;
        while(fastPointer!=null && fastPointer.next!=null){
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }
        return slowPointer;
    }

    public static void main(String[] args) {
        FindMid middleNode=new FindMid();

        LinkedListNode head=new LinkedListNode(1);
        head.next=new LinkedListNode(2);
        head.next.next=new LinkedListNode(3);
        head.next.next.next=new LinkedListNode(4);
        head.next.next.next.next=new LinkedListNode(5);
        head.next.next.next.next.next=new LinkedListNode(6);
        System.out.println(middleNode.findMidNode(head).val);
    }
}
