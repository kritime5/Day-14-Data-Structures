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
    public static void main(String[] args) {
        LinkedList sll=new LinkedList();
        sll.head=new ListNode(56);
        ListNode second=new ListNode(30);
        ListNode third=new ListNode(70);
        sll.head.next=second;
        second.next=third;
        sll.display();
        System.out.print("Linked list program operation");
    }

}
