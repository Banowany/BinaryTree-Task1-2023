package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    @Test
    void countLeavesInEmptyTree()
    {
        BinaryTree binaryTree = new BinaryTree(null);
        assertEquals(0, binaryTree.countLeaves());
    }

    @Test
    void countLeavesInSingleNodeTree()
    {
        Node node = new Node(9);
        BinaryTree binaryTree = new BinaryTree(node);
        assertEquals(1, binaryTree.countLeaves());
    }

    @Test
    void countLeavesInSingleBranchTree()
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
        assertEquals(1, binaryTree.countLeaves());
    }

    @Test
    void countLeavesInTreeWithTwoBranches()
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
        assertEquals(2, binaryTree.countLeaves());
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
    void equalsTwoEmptyTrees()
    {
        BinaryTree binaryTreeFirst = new BinaryTree(null);
        BinaryTree binaryTreeSecond = new BinaryTree(null);

        assertTrue(binaryTreeFirst.equals(binaryTreeSecond));
        assertTrue(binaryTreeSecond.equals(binaryTreeFirst));
    }

    @Test
    void equalsNonEmptyTreeWithEmptyTree()
    {
        Node node = new Node(9);
        BinaryTree binaryTreeNonEmpty = new BinaryTree(node);
        BinaryTree binaryTreeEmpty = new BinaryTree(null);

        assertFalse(binaryTreeNonEmpty.equals(binaryTreeEmpty));
        assertFalse(binaryTreeEmpty.equals(binaryTreeNonEmpty));
    }

    @Test
    void equalsTreesWhichHaveOnlyRootWithOtherValues()
    {
        Node node1 = new Node(9);
        BinaryTree binaryTree1 = new BinaryTree(node1);

        Node node2 = new Node(8);
        BinaryTree binaryTree2 = new BinaryTree(node2);

        assertFalse(binaryTree1.equals(binaryTree2));
        assertFalse(binaryTree2.equals(binaryTree1));
    }

    @Test
    void equalsTreesWhichHaveOnlyRootWithSameValues()
    {
        Node node1 = new Node(9);
        BinaryTree binaryTree1 = new BinaryTree(node1);

        Node node2 = new Node(9);
        BinaryTree binaryTree2 = new BinaryTree(node2);

        assertTrue(binaryTree1.equals(binaryTree2));
        assertTrue(binaryTree2.equals(binaryTree1));
    }

    @Test
    void equalsTreesWithSameStructureAndValues()
    {
        /*
           1
         2   3
          4 5 6
        */

        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(3);
        Node node1_4 = new Node(4);
        Node node1_5 = new Node(5);
        Node node1_6 = new Node(6);

        node1_1.setLeft(node1_2);
        node1_1.setRight(node1_3);

        node1_2.setRight(node1_4);

        node1_3.setLeft(node1_5);
        node1_3.setRight(node1_6);

        BinaryTree binaryTree1 = new BinaryTree(node1_1);

        Node node2_1 = new Node(1);
        Node node2_2 = new Node(2);
        Node node2_3 = new Node(3);
        Node node2_4 = new Node(4);
        Node node2_5 = new Node(5);
        Node node2_6 = new Node(6);

        node2_1.setLeft(node2_2);
        node2_1.setRight(node2_3);

        node2_2.setRight(node2_4);

        node2_3.setLeft(node2_5);
        node2_3.setRight(node2_6);

        BinaryTree binaryTree2 = new BinaryTree(node2_1);

        assertTrue(binaryTree1.equals(binaryTree2));
        assertTrue(binaryTree2.equals(binaryTree1));
    }

    @Test
    void equalsTreesWithSameStructureButOtherValue()
    {
        /*
           1
         2   3
          4 5 6
        */

        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(3);
        Node node1_4 = new Node(4);
        Node node1_5 = new Node(5);
        Node node1_6 = new Node(6);

        node1_1.setLeft(node1_2);
        node1_1.setRight(node1_3);

        node1_2.setRight(node1_4);

        node1_3.setLeft(node1_5);
        node1_3.setRight(node1_6);

        BinaryTree binaryTree1 = new BinaryTree(node1_1);

        /*
           1
         2   3
          4 5 7
        */

        Node node2_1 = new Node(1);
        Node node2_2 = new Node(2);
        Node node2_3 = new Node(3);
        Node node2_4 = new Node(4);
        Node node2_5 = new Node(5);
        Node node2_6 = new Node(7);//OTHER VALUE

        node2_1.setLeft(node2_2);
        node2_1.setRight(node2_3);

        node2_2.setRight(node2_4);

        node2_3.setLeft(node2_5);
        node2_3.setRight(node2_6);

        BinaryTree binaryTree2 = new BinaryTree(node2_1);

        assertFalse(binaryTree1.equals(binaryTree2));
        assertFalse(binaryTree2.equals(binaryTree1));
    }

    @Test
    void equalsTreesWithOtherStructure()
    {
        /*
           1
         2   3
          4 5 6
        */

        Node node1_1 = new Node(1);
        Node node1_2 = new Node(2);
        Node node1_3 = new Node(3);
        Node node1_4 = new Node(4);
        Node node1_5 = new Node(5);
        Node node1_6 = new Node(6);

        node1_1.setLeft(node1_2);
        node1_1.setRight(node1_3);

        node1_2.setRight(node1_4);

        node1_3.setLeft(node1_5);
        node1_3.setRight(node1_6);

        BinaryTree binaryTree1 = new BinaryTree(node1_1);

        /*
           1
         2   3
        4   5 6
        */

        Node node2_1 = new Node(1);
        Node node2_2 = new Node(2);
        Node node2_3 = new Node(3);
        Node node2_4 = new Node(4);
        Node node2_5 = new Node(5);
        Node node2_6 = new Node(6);

        node2_1.setLeft(node2_2);
        node2_1.setRight(node2_3);

        node2_2.setLeft(node2_4);

        node2_3.setLeft(node2_5);
        node2_3.setRight(node2_6);

        BinaryTree binaryTree2 = new BinaryTree(node2_1);

        assertFalse(binaryTree1.equals(binaryTree2));
        assertFalse(binaryTree2.equals(binaryTree1));
    }
}