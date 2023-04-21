package org.example;

public class Main {
    public static void main(String[] args) {
        Node nodel4v5r8 = new Node(5);
        Node nodel3v8r0 = new Node(8);
        nodel3v8r0.setRight(nodel4v5r8);
        Node nodel3v2l0 = new Node(2);
        Node nodel2v0r7 = new Node(0);
        nodel2v0r7.setRight(nodel3v8r0);
        nodel2v0r7.setLeft(nodel3v2l0);
        Node nodel2v1l7 = new Node(1);
        Node nodel2v5r3 = new Node(5);
        Node nodel2v2l3 = new Node(2);
        Node nodel1v7r5 = new Node(7);
        nodel1v7r5.setRight(nodel2v0r7);
        nodel1v7r5.setLeft(nodel2v1l7);
        Node nodel1v3l5 = new Node(3);
        nodel1v3l5.setRight(nodel2v5r3);
        nodel1v3l5.setLeft(nodel2v2l3);
        Node nodel0v5p = new Node(5);
        nodel0v5p.setRight(nodel1v7r5);
        nodel0v5p.setLeft(nodel1v3l5);

        BinaryTree binaryTree = new BinaryTree(nodel0v5p);
        System.out.println(binaryTree.countLeaves());
        System.out.println(binaryTree.countLongestPath());
    }
}