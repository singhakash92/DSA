package org.example;



//Linked list is just bunch of nodes
//where each node has some data and knows where the next node is located

//operations
//insertAtFirst
//insertAtLast
//insertAtIndex
//deleteAtFirst
//deleteAtLast
//deleteAtIndex
//existsOrNot
//iterate


public class MyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
//        I'll have to check if my head is pointing to null or not
        if(head == null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }


    public void insertAtLast(int data){
        Node newNode = new Node(data);

        if(tail == null){
            tail = newNode;
            head = newNode;
            size++;
            return;
        }

        tail.next = newNode;
        tail = newNode;

        size++;
    }

    public void insert(int data, int index){
        if(index == 0){
            insertAtFirst(data);
            return;
        }
        if(index == size){
            insertAtLast(data);
            return;
        }
        if(index > size){
            System.out.println("index out of bound");
        }







    }


    private class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }







}


