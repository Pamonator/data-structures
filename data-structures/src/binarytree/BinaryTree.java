/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author a1402072
 */
public class BinaryTree {

    private TreeNode root = null;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {

        return this.root == null;

    }

    public void insert(int value) {

        TreeNode newNode = new TreeNode(value);

        if (this.isEmpty()) {

            this.root = newNode;

        } else {

            TreeNode temp = this.root;

            boolean wasInserted = false;

            while (!wasInserted) {

                if (newNode.getValue() <= temp.getValue()) {

                    if (temp.getLeft() == null) {

                        temp.setLeft(newNode);
                        wasInserted = true;

                    } else {

                        temp = temp.getLeft();

                    }

                } else if (temp.getRight() == null) {

                    temp.setRight(newNode);
                    wasInserted = true;

                } else {

                    temp = temp.getRight();

                }

            }

        }

    }

    public void showTree(TreeNode temp) {

        if (temp != null) {

            System.out.println(temp.getValue());
            showTree(temp.getLeft());
            showTree(temp.getRight());

        }

    }

    public void showLeaves(TreeNode temp) {
        
        
        
    }
}
