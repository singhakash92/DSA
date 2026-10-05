package org.example;




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



    }





    public void offer(int data){

    }

    public int poll(){
        if(head == null){
            System.out.println("the linked list is empty");
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


