package org.DataStructure.HashMap;

public class OwnHashMap {
    private Node []arr;
    private int capacity;

    public OwnHashMap() {
        capacity = 16;
        arr = new Node[capacity];
    }

    public void put(String key, int value) {
        int hashKey = hashFunction(key);
        int index = getIndexFunction(hashKey);

        Node bucket = new Node(hashKey,key,value);
        if (arr[index] == null) {
            arr[index] = bucket;
        }else {
            Node current = arr[index];
            while (current.next != null) {
                current=current.next;

            }
            current.next=bucket;


        }


    }

    private int hashFunction(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += (int) key.charAt(i);

        }
        return sum;
    }

    private int getIndexFunction(int hashedKey) {
        return hashedKey & (capacity-1);


    }

    public int get (String key) {
        int hashKey = hashFunction(key);
        int index = getIndexFunction(hashKey);
        if (arr[index] == null) {
            return -1;
        }else {
            Node current = arr[index];
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }
                current = current.next;
            }
            return -1;
        }
    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            if (arr[i] == null) {
                System.out.println("the index"+ i +" " +"NULL");

            }else {
                Node current = arr[i];
                while (current != null) {
                    System.out.println("The index"+ i +" "+ current.value+ " " + "the key is "  +current.key + " " +"the hash code is " +current.hash);
                current = current.next;
                }

            }
        }
    }

    

}
