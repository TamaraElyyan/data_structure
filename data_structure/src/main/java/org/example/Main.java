package org.example;

import org.DataStructure.HashTable.OwnHashTable;
import org.DataStructure.OwnQueue;

public class Main {
    public static void main(String[] args) throws Exception {

//        OwnArrayList list = new OwnArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.remove(1);
////        list.add(2,5);
//        list.removeNumber(3);
//
//        list.print();
//        System.out.println(list.size());
//        System.out.println((list.actualSize()));

//        OwnLinkedList list = new OwnLinkedList();
//        System.out.println(list.IsEmpty());
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.add(2,5);
//
//        list.addFirst(3);
//        list.print();


//        OwnStack stack = new OwnStack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.print();
//        System.out.println(stack.pop());
//        stack.print();


//        OwnQueue queue = new OwnQueue();
//        System.out.println( queue.isEmpty());
//
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.print();
//
//
//        queue.dequeue();
//         queue.print();
//
//
//        System.out.println(queue.front());
//
//        System.out.println(queue.rear());


        OwnHashTable hashTable = new OwnHashTable();
        hashTable.put("Mia",1);
        hashTable.put("Tim",2);
        hashTable.put("Bea",3);
        hashTable.put("Zoe",4);
        hashTable.put("Sko",4);
        hashTable.put("abc",4);
        hashTable.put("bbc",4);
        hashTable.put("bbb",4);
        hashTable.put("cbb",4);
        hashTable.put("cdb",4);
        hashTable.put("cdd",4);
        hashTable.put("rte",4);
        hashTable.print();

        hashTable.remove("Tim");
        hashTable.print();

        hashTable.put("Sso",2);
        hashTable.print();





//        System.out.println(hashTable.get("Mia"));
//        System.out.println(hashTable.get("dsf"));















    }

}