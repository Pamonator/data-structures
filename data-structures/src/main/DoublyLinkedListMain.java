/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import doublylinkedlist.DoublyLinkedList;
import java.util.Scanner;

/**
 *
 * @author a1402072
 */
public class DoublyLinkedListMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
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
                    doublyLinkedList.enlist(value);
                    break;

                case 2:

                    System.out.println("Digite o valor de deseja adicionar na lista: ");
                    value = scanner.nextInt();
                    doublyLinkedList.orderedEnlist(value);
                    break;

                case 3:

                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        doublyLinkedList.removeValue(value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 4:

                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        doublyLinkedList.delist(value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 5:

                    doublyLinkedList.removeFirst();

                    break;

                case 6:

                    doublyLinkedList.removeLast();

                    break;

                case 7:

                    System.out.println("\nValores contidos na lista: ");

                    if (doublyLinkedList.isEmpty()) {

                        System.out.println("Lista vazia!!");

                    } else {

                        doublyLinkedList.showValues();

                    }

                    break;

                case 8:

                    System.out.println("\nValores contidos na lista: ");

                    if (doublyLinkedList.isEmpty()) {

                        System.out.println("Lista vazia!!");

                    } else {

                        doublyLinkedList.showValuesBackward(doublyLinkedList.getFirst());

                    }

                    break;

                case 9:

                    if (doublyLinkedList.isEmpty()) {

                        System.out.println("Lista vazia");

                    } else {

                        System.out.println("Lista não vazia");

                    }
                    break;

                case 10:

                    try {

                        System.out.println("\nTamanho da lista = "
                                + doublyLinkedList.size() + "\n");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }
                    break;

            }

        } while (flag != 0);

    }

}
