package org.DataStructure;

public class OwnQueue {

    private int [] arr;
    private int size;


    public OwnQueue() {
        arr = new int[10];
        size = 0;
    }

    public int enqueue(int num) {
        ensureCapcity();
        arr[size] = num;
        size ++;
        return num;

    }

    public void ensureCapcity(){
        if(size + 1  >= arr.length){
            int[] newArr = new int[arr.length + (arr.length >>1)];
            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
    }

    public void print(){
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public boolean isEmpty(){
        return size == 0;
    }

    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }


        int num = arr[0];
        for(int i = 0; i < size-1; i++){
            arr[i] = arr[i+1];

        }
        size--;
        return num;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return arr[0];
    }

    public int rear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        return arr[size-1];
    }
}

