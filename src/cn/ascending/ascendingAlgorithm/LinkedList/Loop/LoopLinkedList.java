package cn.ascending.ascendingAlgorithm.LinkedList.Loop;

//https://www.geeksforgeeks.org/find-length-of-loop-in-linked-list/

import cn.ascending.ascendingAlgorithm.support.LinkedListNode;

//judge if it is loop or not
//Write a function detectAndCountLoop() that checks whether a given Linked List contains loop and
// if loop is present then returns count of nodes in loop. Write a function detectAndCountLoop() that
// checks whether a given Linked List contains loop and if loop is present then returns count of nodes in loop.
public class LoopLinkedList {
    public boolean checkLoop(LinkedListNode node){
        LinkedListNode quick=node.next.next;
        LinkedListNode slow=node.next;

        while(quick!=slow){
            if(quick!=null){// not reach in end
                quick=quick.next.next;
                slow=slow.next;
            }else return false;//fast node arrives the end, so it is not Loop LinkedList
        }
        return true;//is Loop
    }

    LinkedListNode head;

    public LinkedListNode push(int data){
        LinkedListNode node=new LinkedListNode(data);
        node.next=head;
        //move the head to point to the new Node
        head=node;
        return node;
    }

    public static void main(String[] args) {
        LoopLinkedList lll=new LoopLinkedList();
        LinkedListNode n1=lll.push(1);
        LinkedListNode n2=lll.push(2);
        LinkedListNode n3=lll.push(3);
        LinkedListNode n4=lll.push(1);
        boolean b=lll.checkLoop(n4);
        System.out.println(b);
    }
}
