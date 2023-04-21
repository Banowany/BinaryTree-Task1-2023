package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void countLeaves() {
    }

    @Test
    void countLongestPathInEmptyTree()
    {
        BinaryTree binaryTree = new BinaryTree(null);
        assertEquals(0, binaryTree.countLongestPath());
    }

    @Test
    void countLongestPathInSingleNodeTree()
    {
        Node node = new Node(9);
        BinaryTree binaryTree = new BinaryTree(node);
        assertEquals(0, binaryTree.countLongestPath());
    }

    @Test
    void countLongestPathInSingleBranchTree()
    {
        Node node1 = new Node(5);
        Node node2 = new Node(7);
        Node node3 = new Node(0);
        Node node4 = new Node(8);
        Node node5 = new Node(5);

        node1.setLeft(node2);
        node2.setLeft(node3);
        node3.setLeft(node4);
        node4.setLeft(node5);

        BinaryTree binaryTree = new BinaryTree(node1);
        assertEquals(4, binaryTree.countLongestPath());
    }

    @Test
    void countLongestPathInTreeWithToBranchesThatHaveTheSameLength()
    {
        Node nodel0p = new Node(5);

        Node nodel1r = new Node(7);
        Node nodel2r = new Node(0);
        Node nodel3r = new Node(8);
        Node nodel4r = new Node(5);

        Node nodel1l = new Node(3);
        Node nodel2l = new Node(2);
        Node nodel3l = new Node(5);
        Node nodel4l = new Node(1);

        nodel0p.setLeft(nodel1l);
        nodel0p.setRight(nodel1r);

        nodel1r.setRight(nodel2r);
        nodel2r.setRight(nodel3r);
        nodel3r.setRight(nodel4r);

        nodel1l.setLeft(nodel2l);
        nodel2l.setLeft(nodel3l);
        nodel3l.setLeft(nodel4l);

        BinaryTree binaryTree = new BinaryTree(nodel0p);
        assertEquals(4, binaryTree.countLongestPath());
    }

    @Test
    void countLongestPathInTreeWithToBranchesWhereLeftIsShorter()
    {
        Node nodel0p = new Node(5);

        Node nodel1r = new Node(7);
        Node nodel2r = new Node(0);
        Node nodel3r = new Node(8);
        Node nodel4r = new Node(5);

        Node nodel1l = new Node(3);
        Node nodel2l = new Node(2);
        Node nodel3l = new Node(5);

        nodel0p.setLeft(nodel1l);
        nodel0p.setRight(nodel1r);

        nodel1r.setRight(nodel2r);
        nodel2r.setRight(nodel3r);
        nodel3r.setRight(nodel4r);

        nodel1l.setLeft(nodel2l);
        nodel2l.setLeft(nodel3l);

        BinaryTree binaryTree = new BinaryTree(nodel0p);
        assertEquals(4, binaryTree.countLongestPath());
    }

    @Test
    void countLongestPathInTreeWithToBranchesWhereRightIsShorter()
    {
        Node nodel0p = new Node(5);

        Node nodel1r = new Node(7);
        Node nodel2r = new Node(0);
        Node nodel3r = new Node(8);

        Node nodel1l = new Node(3);
        Node nodel2l = new Node(2);
        Node nodel3l = new Node(5);
        Node nodel4l = new Node(1);

        nodel0p.setLeft(nodel1l);
        nodel0p.setRight(nodel1r);

        nodel1r.setRight(nodel2r);
        nodel2r.setRight(nodel3r);

        nodel1l.setLeft(nodel2l);
        nodel2l.setLeft(nodel3l);
        nodel3l.setLeft(nodel4l);

        BinaryTree binaryTree = new BinaryTree(nodel0p);
        assertEquals(4, binaryTree.countLongestPath());
    }

    @Test
    void testEquals() {
    }
}