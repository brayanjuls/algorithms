package com.juls.linkedlist;

/**
 * Created by brayan on 21-07-18
 */
public class SinglyListNode {

    Integer val;
    SinglyListNode next;
   public  SinglyListNode(int x){
        val = x;
    }

    public SinglyListNode(){
    }


    public int get(int index) {
        if(index==0 && this.val!=null)
            return this.val;
        if(this.next!=null)
            return this.next.get(--index);

        return -1;
    }

    public void addAtHead(int val) {
        if(this.next==null && this.val==null){
            this.val=val;
        }else{
            SinglyListNode curhead=new SinglyListNode(this.val);
            curhead.next=this.next;
            this.val=val;
            this.next=curhead;
        }
    }

    public void addAtTail(int val) {
        SinglyListNode last=this.getLastElement();
        SinglyListNode curlast =new SinglyListNode(val);
        last.next=curlast;

    }

    private SinglyListNode getLastElement(){
        if(this.next==null)
            return this;

        return this.next.getLastElement();
    }

    public SinglyListNode getObject(int index) {
        if(index==0)
            return this;

        if(this.next!=null)
            return this.next.getObject(--index);

        return null;
    }

    public void addAtIndex(int index, int val) {
        SinglyListNode cur=getObject(index);
        SinglyListNode beforecur=getObject(--index);
        if(cur!=null){
            SinglyListNode newcur=new SinglyListNode(val);
                if(beforecur!=null){
                    newcur.next=cur;
                    beforecur.next=newcur;
                }else{
                    addAtHead(val);
                }
        }else if(beforecur!=null && beforecur.val!=null){
            SinglyListNode newcur=new SinglyListNode(val);
            beforecur.next=newcur;
        }
    }

    public void deleteAtIndex(int index) {
        SinglyListNode cur=getObject(index);
        SinglyListNode beforecur=getObject(--index);
        if(cur!=null){
            if(beforecur!=null){
                beforecur.next=cur.next;
            }
            cur=null;
        }
    }

    public void setNext(SinglyListNode next) {
        this.next = next;
    }
}
