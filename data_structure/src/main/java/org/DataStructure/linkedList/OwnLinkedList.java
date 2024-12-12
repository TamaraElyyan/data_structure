package org.DataStructure.linkedList;

public class OwnLinkedList {
   private Node head;
   private int size;

   public OwnLinkedList() {
       size = 0;
   }
   public boolean IsEmpty (){
       if(head == null ) {
           return true;
       }
       return false;
   }
   public void add (int number){
       Node newNode = new Node(number);

       if(IsEmpty()){
           head = newNode;
       }else {
           Node current = head;
           while(current.next != null) {
               current = current.next;
           }
           current.next = newNode;


       }
       size++;

   }
   public void add (int index, int number){
       if(index < 0 || index > size){
           System.out.println("Index out of bounds");
           return;
       }
       if(IsEmpty()&& index > 0){
           System.out.println("Index out of bounds");
           return;
       }

       Node newNode = new Node(number);
       Node current = head;
       for(int i = 0; i < index-1 ; i++){
           current = current.next;
       }
       newNode.next = current.next;
       current.next = newNode;
       size ++;

   }
   public void addFirst(int number){
       Node newNode = new Node(number);
       if(IsEmpty()){
           head = newNode;
       }
       else {
           newNode.next = head;
           head = newNode;
       }
       size++;
   }
   public void remove (){
       if(head != null){
           head = head.next;
           size--;

       }

   }
   public void remove (int index){
       if(index < 0 || index > size){
           System.out.println("Index out of bounds");
           return;
       }

       if(head == null && index > 0){
           System.out.println("Index out of bounds");
           return;
       }
       Node current = head;
       Node previous = null;
       for(int i = 0; i < index ; i++){
           previous = current;
           current = current.next;
       }
       previous.next = current.next;
       size--;


   }
   public void print(){
       Node current = head;
       while(current != null) {
           System.out.print(current.data + " ");
           current = current.next;
       }
   }
   public void set(int index, int number){
       if(index < 0 || index > size){
           System.out.println("Index out of bounds");
           return;
       }

       if(head == null && index > 0){
           System.out.println("Index out of bounds");
           return;
       }

       Node current = head;
       for(int i = 0; i < index ; i++){
           current = current.next;
       }

       current.data = number;
   }
   public int get(int index){
       if(head != null ){
           Node current = head;
           for(int i = 0; i < index ; i++){
               current = current.next;

           }
           return current.data;

       }else  {
           System.out.println("Index out of bounds");
           return -1;
       }

   }
   public boolean contains(int number){
       if(head == null ){
           return false;
       }
       Node current = head;
       while(current != null){
           if(current.data == number){
               return true;
           }
           current = current.next;
       }
       return false;
   }
   public void clear (){
       head = null;
   }
   public int size(){
       return size;
   }



}
