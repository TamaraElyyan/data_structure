package org.DataStructure.HashTable;

public class OwnHashTable {
    private Node[] arr;
    private int size;
    private int capacity = 11;


    public OwnHashTable() {
        arr = new Node[capacity];
        size = 0;
    }

    public void put(String key, int value) {
        Node pair = new Node(key, value);
        int hashedKey = hashFunction(key);
        int index = getIndexFunction(hashedKey);

        if (arr[index] == null) {
            arr[index] = pair;
            size++;
        } else {
            int closetAvailableIndex = index + 1;
            boolean flag = false;
            while (closetAvailableIndex != index) {
                if (closetAvailableIndex == capacity) {
                    closetAvailableIndex = 0;
                }
                if (arr[closetAvailableIndex] == null) {
                    arr[closetAvailableIndex] = pair;
                    flag = true;
                    size++;
                    break;
                }
                closetAvailableIndex++;


            }
            if (flag == false) {
                System.out.println("The hash table is full");
            }

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
        return hashedKey % capacity;


    }

    public void print() {
        for (int i = 0; i < capacity; i++) {
            if (arr[i] != null) {
                System.out.print("[" + arr[i].key + " " + arr[i].value + "]");
            } else {
                System.out.print(arr[i] + " " + "null" + " ");
            }


        }
        System.out.println();
    }

    public int get(String key) {
        int hashedKey = hashFunction(key);
        int index = getIndexFunction(hashedKey);
        if (arr[index].key == key) {
            return arr[index].value;
        } else {
            int closetAvailableIndex = index + 1;
            while (closetAvailableIndex != index) {
                if (closetAvailableIndex == capacity) {
                    closetAvailableIndex = 0;
                }
                if (arr[closetAvailableIndex].key == key) {
                    return arr[closetAvailableIndex].value;
                }
                closetAvailableIndex++;


            }

            return -1;

        }
    }

    public void remove(String key) {
        int hashedKey = hashFunction(key);
        int index = getIndexFunction(hashedKey);
        if (arr[index].key == key) {
            arr[index] = null;
        } else {
            int closetAvailableIndex = index + 1;
            while (closetAvailableIndex != index) {
                if (closetAvailableIndex == capacity) {
                    closetAvailableIndex = 0;
                }
                if (arr[closetAvailableIndex].key == key) {
                    arr[closetAvailableIndex] = null;
                }
                closetAvailableIndex++;


            }


        }
    }

}
