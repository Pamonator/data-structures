/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import linkedlist.LinkedList;

/**
 *
 * @author a1402072
 */
public class LinkedListMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        int value;
        int flag;

        System.out.println("### Welcome to the Linked List Tabajara Tester ###");

        do {

            System.out.println("\n# Escolha sua opçao:"
                    + "\n#1 - Adicionar um valor inteiro na lista."
                    + "\n#2 - Remover um valor inteiro da lista(apenas uma ocorrência)"
                    + "\n#3 - Remover um valor inteiro da lista(todas as ocorrências)"
                    + "\n#4 - Remover o primeiro valor da lista"
                    + "\n#5 - Remover o último valor da lista"
                    + "\n#6 - Exibir os valores da lista."
                    + "\n#7 - Exibir status da lista."
                    + "\n#8 - Tamanho da lista."
                    + "\n#9 - Sair.");
            flag = scanner.nextInt();

            switch (flag) {
                case 1:

                    System.out.println("Digite o valor de deseja adicionar na lista: ");
                    value = scanner.nextInt();
                    linkedList.enlist(value);
                    break;

                case 2:

                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        linkedList.removeValue(value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;
                    
                case 3:
                    
                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        linkedList.delist(value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 4:
                    
                    linkedList.removeFirst();

                    break;

                case 5:

                    linkedList.removeLast();
                    
                    break;

                case 6:
                    
                    try {

                        System.out.println("\nValores contidos na lista: ");
                        linkedList.showValues();

                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;

                case 7:
                    
                    if (linkedList.isEmpty()) {

                        System.out.println("Lista vazia");

                    } else {

                        System.out.println("Lista não vazia");

                    }
                    break;

                case 8:
                    
                    try {

                        System.out.println("\nTamanho da lista = "
                                + linkedList.size() + "\n");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }
                    break;

                case 9:

                    break;

            }

        } while (flag != 9);

    }

}
