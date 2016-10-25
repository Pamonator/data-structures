/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import circularlist.CircularList;
import java.util.Scanner;
import node.Node;

/**
 *
 * @author a1402072
 */
public class CircularListMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CircularList circularList = new CircularList();
        Node node;
        int value;
        int flag;

        System.out.println("### Welcome to the Circular List Tabajara Tester ###");

        do {

            System.out.println("\n# Escolha sua opçao:"
                    + "\n#1  - Adicionar um valor inteiro na lista."
                    + "\n#2  - Remover um valor inteiro da lista(apenas uma ocorrência)"
                    + "\n#3  - Remover o primeiro valor da lista"
                    + "\n#4  - Remover o último valor da lista"
                    + "\n#5  - Exibir os valores da lista."
                    + "\n#6  - Exibir status da lista."
                    + "\n#7  - Tamanho da lista."
                    + "\n#8  - Sair.");
            flag = scanner.nextInt();

            switch (flag) {
                case 1:

                    System.out.println("Digite o valor de deseja adicionar na lista: ");
                    value = scanner.nextInt();
                    circularList.enlist(value);
                    break;

                case 2:

                    System.out.println("Digite o valor de deseja remover da lista:");
                    value = scanner.nextInt();

                    try {

                        circularList.delist(value);

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }

                    break;

                case 3:

                    circularList.removeFirst();

                    break;

                case 4:

                    circularList.removeLast();

                    break;

                case 5:

                    System.out.println("\nValores contidos na lista: ");

                    if (circularList.isEmpty()) {

                        System.out.println("Lista vazia!!");

                    } else {

                        circularList.showValues();

                    }

                    break;

                case 6:

                    if (circularList.isEmpty()) {

                        System.out.println("Lista vazia");

                    } else {

                        System.out.println("Lista não vazia");

                    }
                    break;

                case 7:

                    try {

                        System.out.println("\nTamanho da lista = "
                                + circularList.size() + "\n");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }
                    break;

            }

        } while (flag != 8);

    }

}
