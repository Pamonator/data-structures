/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import linkedlist.LinkedList;
import node.Node;

/**
 *
 * @author a1402072
 */
public class LinkedListMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        Node node;
        int value;
        int flag;

        System.out.println("### Welcome to the Linked List Tabajara Tester ###");

        do {

            System.out.println("\n# Escolha sua opçao:"
                    + "\n#1  - Adicionar um valor inteiro na lista."
                    + "\n#2  - Adicionar um valor inteiro na lista de forma ordenada."
                    + "\n#3  - Remover um valor inteiro da lista(apenas uma ocorrência)"
                    + "\n#4  - Remover um valor inteiro da lista(todas as ocorrências)"
                    + "\n#5  - Remover o primeiro valor da lista"
                    + "\n#6  - Remover o último valor da lista"
                    + "\n#7  - Exibir os valores da lista."
                    + "\n#8  - Exibir lista ordenada decrescente."
                    + "\n#9  - Exibir status da lista."
                    + "\n#10 - Tamanho da lista."
                    + "\n#0  - Sair.");
            flag = scanner.nextInt();

            switch (flag) {
                case 1:

                    System.out.println("Digite o valor de deseja adicionar na lista: ");
                    value = scanner.nextInt();
                    node = new Node();
                    node.setValue(value);
                    node.setNext(null);
                    linkedList.enlist(linkedList.getFirst(), node);
                    break;

                case 2:

                    System.out.println("Digite o valor de deseja adicionar na lista: ");
                    value = scanner.nextInt();
                    node = new Node();
                    node.setValue(value);
                    node.setNext(null);
                    linkedList.orderedEnlist(linkedList.getFirst(), node);
                    break;

                case 3:

                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        linkedList.removeValue(linkedList.getFirst(), value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 4:

                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        linkedList.delist(linkedList.getFirst(), value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 5:

                    linkedList.removeFirst();

                    break;

                case 6:

                    linkedList.removeLast(linkedList.getFirst());

                    break;

                case 7:

                    System.out.println("\nValores contidos na lista: ");
                    
                    if (linkedList.isEmpty()) {

                        System.out.println("Lista vazia!!");

                    } else {

                        linkedList.showValues(linkedList.getFirst());

                    }

                    break;

                case 8:

                    System.out.println("\nValores contidos na lista: ");
                    
                    if (linkedList.isEmpty()) {

                        System.out.println("Lista vazia!!");

                    } else {

                        linkedList.showValuesBackward(linkedList.getFirst());

                    }

                    break;
                    
                case 9:

                    if (linkedList.isEmpty()) {

                        System.out.println("Lista vazia");

                    } else {

                        System.out.println("Lista não vazia");

                    }
                    break;

                case 10:

                    try {

                        System.out.println("\nTamanho da lista = "
                                + linkedList.size() + "\n");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }
                    break;

            }

        } while (flag != 0);

    }

}
