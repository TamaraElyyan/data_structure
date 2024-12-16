package org.DataStructure.Tree.BinarySearchTree;

public class OwnBinarySearchTree {
    public Node root;


    public boolean search (int number) {
        if (root == null) {
            return false;
        }

        Node current = root;
        while (current != null) {
            if (current.value == number) {
                return true;
            }
            if (current.value > number) {
                current = current.left;
            }else if (current.value < number) {
                current = current.right;
            }
        }
        return false;
    }

    public void insert(int number) {
       Node bucket = new Node(number);
       if (root == null) {
           root = bucket;
       }else {
           Node current = root;
           Node prev = null;
           while (current != null) {
               prev = current;
               if (number > current.value){
                   current = current.right;
               }else if (number < current.value){
                   current = current.left;
               }
           }
           if (number > prev.value) {
               prev.right = bucket;
           }else if (number < prev.value) {
               prev.left = bucket;
           }

       }

   }

    public void traversalInOrder(Node root) {
        if (root != null) {
            traversalInOrder(root.left);
            System.out.print(" " + root.value);
            traversalInOrder(root.right);


        }


    }

    public void traversalPreOrder(Node root) {
        if (root != null) {
            System.out.print(" " + root.value);
            traversalPreOrder(root.left);
            traversalPreOrder(root.right);
        }
    }

    public void traversalPostOrder(Node root) {
        if (root != null) {
            traversalPostOrder(root.left);
            traversalPostOrder(root.right);
            System.out.print(" " + root.value);
        }

    }

}