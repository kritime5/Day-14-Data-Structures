package com.datastructure;

public class LinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }
    //UC4-INSERT 30 BETWEEN 56 AND 70
    public void insertBetween(int position, int value){
        //56-70
        //56-30-70
        ListNode node=new ListNode(value);
        if(position==1){
            node.next=head;
            head=node;
        }
        else {
            ListNode previous=head;
            int count=1;//position-1
            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=node;
            node.next=current;

        }

    }

    public static void main(String[] args) {
        LinkedList sll=new LinkedList();
        sll.head=new ListNode(56);
        ListNode second=new ListNode(70);

        //UC3-LINK LIST NODE WITH 56 IS CREATED FIRST, NEXT APPEND 30 TO 56 AND 70 TO 30
        sll.head.next=second;
        sll.insertBetween(2,30);
        sll.display();
        System.out.print("Linked list program operation");
    }

}
