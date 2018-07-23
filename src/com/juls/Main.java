package com.juls;

import com.juls.linkedlist.ListCycle;
import com.juls.linkedlist.SinglyListNode;

public class Main {

    public static void main(String[] args) {
        SinglyListNode linkedList = new SinglyListNode();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1, 2);
        linkedList.getObject(2).setNext(linkedList);
        ListCycle cycle=new ListCycle();
        System.out.println(cycle.hasCycle(linkedList));

    }
}
