package com.maxeremin.quora.bst;

// binary search tree, дерево бинарного поиска
class Node {
    int val;
    Node left, right;
    Node (int key) {
        val = key;
        left = right = null;
    }
}
public class InsertionInBst {

    // function which inserts new values
    public static Node insert(Node root, int val) {
        // if leaf is empty insert here
            if (root == null) return new Node(val);

            // send root.left as a new root recursively
            if (val < root.val) root.left = insert(root.left, val);

            else root.right = insert(root.right, val);

            return root;
    }



}
