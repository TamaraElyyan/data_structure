package org.example;



import org.DataStructure.Tree.BinarySearchTree.OwnBinarySearchTree;
import org.DataStructure.Tree.generalTree.Node;
import org.DataStructure.Tree.generalTree.OwnGeneralTree;


public class Main {
    public static void main(String[] args) throws Exception {

//        OwnArrayList list = new OwnArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2);
//        list.add(3);
//        list.remove(1);
////      list.add(2,5);
//        list.removeNumber(3);
//        list.print();
//        System.out.println(list.size());
//        System.out.println((list.actualSize()));


//        OwnLinkedList list = new OwnLinkedList();
//        System.out.println(list.IsEmpty());
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(2,5);
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
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.print();
//        queue.dequeue();
//        queue.print();
//        System.out.println(queue.front());
//        System.out.println(queue.rear());


//        OwnHashTable hashTable = new OwnHashTable();
//        hashTable.put("Mia",1);
//        hashTable.put("Tim",2);
//        hashTable.put("Bea",3);
//        hashTable.put("Zoe",4);
//        hashTable.put("Sko",4);
//        hashTable.put("abc",4);
//        hashTable.put("bbc",4);
//        hashTable.put("bbb",4);
//        hashTable.put("cbb",4);
//        hashTable.put("cdb",4);
//        hashTable.put("cdd",4);
//        hashTable.put("rte",4);
//        hashTable.print();
//        hashTable.remove("Tim");
//        hashTable.print();
//        hashTable.put("Sso",2);
//        hashTable.print();
//        System.out.println(hashTable.get("Mia"));
//        System.out.println(hashTable.get("dsf"));


//        OwnHashMap hashMap = new OwnHashMap();
//        hashMap.put("x1",1);
//        hashMap.put("x2",2);
//        hashMap.put("x3",3);
//        hashMap.put("x4",4);
//        hashMap.put("ahmad",5);
//        hashMap.put("ahmda",6);
//        System.out.println(hashMap.get("hhhh"));
//        hashMap.print();


//        OwnGeneralTree tree = new OwnGeneralTree();
//        tree.root = new Node('A');
//        tree.root.left = new Node('B');
//        tree.root.right = new Node('C');
//        tree.root.left.left = new Node('D');
//        tree.root.left.right = new Node('E');
//        tree.root.right.left = new Node('F');
//        tree.root.right.right = new Node('G');
//        tree.root.right.right.left = new Node('H');
//        tree.root.right.right.right = new Node('I');
//        tree.traversalPreOrder(tree.root);
//        tree.traversalInOrder(tree.root);
//        tree.traversalPostOrder(tree.root);

        OwnBinarySearchTree tree = new OwnBinarySearchTree();

        tree.insert(66);
        tree.insert(75);
        tree.insert(23);
        tree.insert(35);
        tree.insert(80);
        tree.insert(30);

        tree.traversalInOrder(tree.root);

        System.out.println(tree.search(23));
        System.out.println(tree.search(50));


    }

}
