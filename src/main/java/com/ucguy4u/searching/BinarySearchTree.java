package com.ucguy4u.searching;

public class BinarySearchTree {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // Constructor
    BinarySearchTree() {
        root = null;
    }

    /**
     * insert the item in to binary search trea
     * 
     * @param args
     */

    void insert(int key) {
        root = insertrec(root, key);
    }

    Node insertrec(Node root, int key) {
        // If root is null then create new one.
        if (root == null) {
            root = new Node(key);
            return root;
        }
        // Recursively traverse down the tree
      if (key < root.key) {
            root.left = insertrec(root.left, key);
        } else if (key > root.key) {
            root.right = insertrec(root.right, key);
        }


        return root;
    }

    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }

    public static void main(String args[]) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(25);
        bst.insert(51);
        bst.inorder();
    }

}
