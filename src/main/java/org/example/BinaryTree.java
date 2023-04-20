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
}
