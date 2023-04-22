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
        if (root==null) return 0;
        return countLongestPath(root)-1;
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
        {
            var leftSubTreeIsTheSame = equals(thisNode.getLeft(), otherNode.getLeft());
            var rightSubTreeIsTheSame = equals(thisNode.getRight(), otherNode.getRight());
            return leftSubTreeIsTheSame && rightSubTreeIsTheSame;
        }
        return false;
    }
    public boolean equals(BinaryTree binaryTree)
    {
        return equals(root, binaryTree.getRoot());
    }
}
