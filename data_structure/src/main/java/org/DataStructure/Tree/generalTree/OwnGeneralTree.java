package org.DataStructure.Tree.generalTree;

public class OwnGeneralTree {
      public Node root;


      public void traversalInOrder(Node root) {
            if (root != null) {
                  traversalInOrder(root.left);
                  System.out.print(" "+root.value);
                  traversalInOrder(root.right);


            }



      }

      public void traversalPreOrder(Node root) {
            if (root != null) {
                  System.out.print(" "+root.value);
                  traversalPreOrder(root.left);
                  traversalPreOrder(root.right);
            }
      }


      public void traversalPostOrder(Node root) {
            if (root != null) {
                  traversalPostOrder(root.left);
                  traversalPostOrder(root.right);
                  System.out.print(" "+root.value);
            }
      }

}
