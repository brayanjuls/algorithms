package com.juls;

import com.juls.linkedlist.SinglyListNode;

public class Main {

    public static void main(String[] args) {
        SinglyListNode linkedList = new SinglyListNode();
        System.out.println(linkedList.get(0));
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));
        linkedList.addAtIndex(0, 1);
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(1));

    }
}
