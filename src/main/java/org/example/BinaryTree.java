package org.example;

public class BinaryTree
{
    private final Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    private int countLeaves(Node node)
    {
        if (node == null)
            return 0;
        if (node.getLeft() == null && node.getRight() == null)
            return 1;

        return countLeaves(node.getLeft())+countLeaves(node.getRight());
    }
    public int countLeaves()
    {
        return countLeaves(root);
    }

    private int countLongestPath(Node node)
    {
        if(node==null)
            return 0;
        return Math.max(countLongestPath(node.getLeft()), countLongestPath(node.getRight()))+1;
    }
    public int countLongestPath()
    {
        return countLongestPath(root);
    }

    public Node getRoot() {
        return root;
    }

    private boolean equals(Node thisNode, Node otherNode)
    {
        if (thisNode == null && otherNode == null)
            return true;
        if (thisNode == null || otherNode == null)
            return false;
        if (thisNode.getValue() == otherNode.getValue())
            return equals(thisNode.getLeft(), otherNode.getLeft()) && equals(thisNode.getRight(), otherNode.getLeft());
        return false;
    }
    public boolean equals(BinaryTree binaryTree)
    {
        return equals(root, binaryTree.getRoot());
    }
}
