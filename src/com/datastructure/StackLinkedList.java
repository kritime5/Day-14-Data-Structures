package com.datastructure;

public class StackLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node top = null;
    }

    public void push(int i) {
        int data = 0;
        Node new_node = new Node(data);

        Node top = null;
        if (top == null) {
            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;
        }
    }

    public void pop(Node top) {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            top = top.next;
        }
    }

    public void display() {
        Node top = null;
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String[] args) {
        StackLinkedList S1=new StackLinkedList();
        S1.push(70);
        S1.push(30);
        S1.push(56);
        S1.display();


    }
}
