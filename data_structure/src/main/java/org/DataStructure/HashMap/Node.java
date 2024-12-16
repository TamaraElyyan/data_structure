package org.DataStructure.HashMap;

public class Node {
    public int value;
    public Node next;
    public String key;
    public int hash;


    public Node(int hash, String key, int value) {
        this.hash = hash;
        this.key = key;
        this.value = value;

    }

}
