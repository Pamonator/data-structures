/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dynamicstack.DynamicStack;
import java.util.Scanner;

/**
 *
 * @author gilca
 */
public class MainDynamicStack {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DynamicStack dynamicstack = new DynamicStack();
        int value;
        int flag;

        System.out.println("### Welcome to the Dynamic Stack Tabajara Test ###");

        do {

            System.out.println("\n# Escolha sua opçao:"
                    + "\n#1 - Empilhar um valor inteiro."
                    + "\n#2 - Desempilhar."
                    + "\n#3 - Exibir os valores da pilha."
                    + "\n#4 - Exibir status da pilha."
                    + "\n#5 - Tamanho da pilha."
                    + "\n#6 - Sair.");
            flag = scanner.nextInt();

            switch (flag) {
                case 1:
                    System.out.println("Digite o valor a empilhar: ");
                    value = scanner.nextInt();
                    dynamicstack.stackUp(value);
                    break;
                case 2:
                    try {

                        dynamicstack.unstack();
                        System.out.println("Done!");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }
                    break;
                case 3:
                    try {

                        System.out.println("\nValores contidos na pilha: ");
                        dynamicstack.showValues();

                    } catch (Exception e) {

                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    if (dynamicstack.isEmpty()) {

                        System.out.println("Pilha vazia");

                    } else {

                        System.out.println("Pilha não vazia");

                    }
                    break;
                case 5:
                    try {

                        System.out.println("\nTamanho da pilha = "
                                + dynamicstack.size() + "\n");

                    } catch (Exception e) {

                        System.out.println(e.getMessage());

                    }
                    break;
                case 6:
                    System.out.println("### CHEERS!! ###");
                    break;
            }

        } while (flag != 6);

    }

}
