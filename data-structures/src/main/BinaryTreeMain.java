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
        int flag;
        int value;

        System.out.println("### Welcome to the Binary Tree Tabajara Tester ###");
        
        do {
            
            System.out.println("\n# Escolha sua opçao:"
                    + "\n#1  - Adicionar um valor inteiro."
                    + "\n#2  - Exibir os valores da lista."
                    + "\n#0  - Sair.");
            flag = scanner.nextInt();
            
            switch (flag) {
                case 1:
                    System.out.println("Digite o valor de deseja adicionar na árvore: ");
                    value = scanner.nextInt();
                    binaryTree.insert(value);
                    break;
                case 2:
                    binaryTree.showTree(binaryTree.getRoot());
                    break;
                default:
                    throw new AssertionError();
            }
            

        } while (flag != 0);

    }

}
