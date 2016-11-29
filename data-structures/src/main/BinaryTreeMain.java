/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import binarytree.BinaryTree;
import java.util.Scanner;

/**
 *
 * @author a1402072
 */
public class BinaryTreeMain {

    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree();
        Scanner scanner = new Scanner(System.in);
        int values[] = {28, 6, 12, 19, 9};
        int value;

        for (int i = 0; i < values.length; i++) {
            
            binaryTree.insert(values[i]);
            
        }
                
        binaryTree.showTree(binaryTree.getRoot());
        System.out.println("\nFolhas: ");
        binaryTree.showLeaves(binaryTree.getRoot());
        
        
        System.out.println("numero de folhas: " + binaryTree.leafCount(binaryTree.getRoot()));
    }
}
