package com.juls.linkedlist;

/**
 * Created by brayan on 23-07-18
 */
public class ListCycle {

    public boolean hasCycle(SinglyListNode head) {
        boolean cycle=false;
        SinglyListNode node=head;
        if(head==null)
            return cycle;

        while(node!=null && node.next!=null){
            if(node.next==head){
                cycle=true;
                break;
            }
            node=node.next;
            if(node.next == head){
                cycle=true;
                break;
            }
            node=node.next;
        }
        return cycle;
    }
}
