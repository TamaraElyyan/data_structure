package org.DataStructure;

public class OwnStack {
    private int [] arr;
    private int size;


    public OwnStack() {
        arr = new int[10];
        size = 0;
    }
    public int push(int num) {
        ensureCapcity();
        arr[size] = num;
        size++;
        return  num;
    }
    public int pop() {
        int num = arr[size-1];
        arr[size-1] = 0;
        size--;
        return num;
    }
    public int peek() {
        return arr[size-1];

    }
    public boolean isEmpty() {
        return size == 0;

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
    public int search(int num) {
        OwnStack tempStack = new OwnStack();
        boolean flag = false;
        int index = 0;

        while(!isEmpty()){
            index++;
            int tempNum = peek();
            if(tempNum == num){
                flag = true;
                break;
            }
            tempStack.push(pop());
        }

        while(!tempStack.isEmpty()){
            push(tempStack.pop());
        }

        if(flag){
            return index;
        }
        return -1;


    }





    public void print(){
        for(int i = 0; i < size ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



}
