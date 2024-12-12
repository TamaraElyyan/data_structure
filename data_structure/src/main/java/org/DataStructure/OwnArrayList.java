package org.DataStructure;

public class OwnArrayList {
    private int [] arr;
    private int size;
    public OwnArrayList() {
        arr = new int[10];
        size = 0;

    }
    public OwnArrayList(int n) {
            arr = new int[n];
            size = 0;
    }

    public int add(int n) {
        checkTheSize();
        arr[size] = n;
        size++;
        return n;

    }

    public int add(int index, int number) {
        checkTheSize();

        for (int i = size; i >= index ; i--) {
            arr[i+1] = arr[i] ;
        }
        arr[index] = number;
        size++;
        return number;

    }

    public void checkTheSize (){
        int capcity = arr.length;
        if (size +1 > capcity) {
            extendArray();
        }
    }



    private void extendArray() {
        int capacity = arr.length;
        int [] newArr = new int[capacity + (capacity>> 1)];
        for (int i = 0; i < capacity; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public int size(){
        return size;
    }

    public int actualSize(){
        return arr.length;
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public int remove(int index){
        if (index < 0 || index >= size) {
            return -1;
        }
        int deletedNumber = arr[index];
        for (int i = index ; i < size; i++) {
            arr[i] = arr[i+1];
        }
        size--;
        return deletedNumber;
    }

    public void removeNumber(int number){
        for (int i = 0; i < size; i++) {
            if (arr[i] == number) {
                remove(i) ;
                break;
            }
        }
    }

    public void clear()
    { arr = new int[10];
        size = 0;


    }
}
