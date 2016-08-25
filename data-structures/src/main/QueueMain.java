/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import dynamicqueue.DynamicQueue;
import exception.FullQueueException;
import java.util.Scanner;
import queue.Queue;

/**
 *
 * @author gilca
 */
public class QueueMain {

    public static void main(String[] args) {

        int n = 5;
        Queue queue;
        DynamicQueue dynamicQueue;
        Scanner scanner = new Scanner(System.in);
        int flag;
        int value;

        System.out.println("### Welcome to Queue Tabajara Tester ###");

        do {

            System.out.println("\n# Escolha sua opçao:"
                    + "\n#1 - Fila com vetor."
                    + "\n#2 - Fila dinâmica."
                    + "\n#0 - Sair.");
            flag = scanner.nextInt();

            switch (flag) {
                case 0:

                    break;
                case 1:

                    queue = new Queue(n);

                    do {

                        System.out.println("\n# Escolha sua opçao:"
                                + "\n#1 - Enfileirar um valor inteiro."
                                + "\n#2 - Desenfileirar."
                                + "\n#3 - Exibir os valores da fila."
                                + "\n#4 - Exibir status da fila."
                                + "\n#5 - Tamanho da fila."
                                + "\n#6 - Voltar ao menu anterior.");
                        flag = scanner.nextInt();

                        switch (flag) {

                            case 1:

                                System.out.println("Digite o valor a empilhar: ");
                                value = scanner.nextInt();

                                try {
                                    queue.enqueue(value);
                                } catch (FullQueueException ex) {

                                    System.out.println(ex.getMessage());

                                }

                                break;

                            case 2:

                                try {
                                    queue.dequeue();
                                    System.out.println("Done!");

                                } catch (Exception e) {

                                    System.out.println(e.getMessage());

                                }

                                break;

                            case 3:

                                try {

                                    System.out.println("\nValores contidos na fila: ");
                                    queue.showValues();

                                } catch (Exception e) {

                                    System.out.println(e.getMessage());
                                }

                                break;

                            case 4:

                                if (queue.isEmpty()) {

                                    System.out.println("Fila vazia");

                                } else {

                                    System.out.println("Fila não vazia");

                                }

                                break;

                            case 5:

                                try {

                                    System.out.println("\nTamanho da fila = "
                                            + queue.size() + "\n");

                                } catch (Exception e) {

                                    System.out.println(e.getMessage());

                                }

                                break;

                            case 6:

                                break;

                        }

                    } while (flag != 6);

                    break;

                case 2:
                    
                    dynamicQueue = new DynamicQueue();

                    do {

                        System.out.println("\n# Escolha sua opçao:"
                                + "\n#1 - Enfileirar um valor inteiro."
                                + "\n#2 - Desenfileirar."
                                + "\n#3 - Exibir os valores da fila."
                                + "\n#4 - Exibir status da fila."
                                + "\n#5 - Tamanho da fila."
                                + "\n#6 - Voltar ao menu anterior.");
                        flag = scanner.nextInt();

                        switch (flag) {
                            case 1:

                                System.out.println("Digite o valor a empilhar: ");
                                value = scanner.nextInt();
                                dynamicQueue.enqueue(value);
                                break;

                            case 2:

                                try {

                                    dynamicQueue.dequeue();
                                    System.out.println("Done!");

                                } catch (Exception e) {

                                    System.out.println(e.getMessage());

                                }

                                break;

                            case 3:

                                try {

                                    System.out.println("\nValores contidos na fila: ");
                                    dynamicQueue.showValues();

                                } catch (Exception e) {

                                    System.out.println(e.getMessage());
                                }

                                break;

                            case 4:

                                if (dynamicQueue.isEmpty()) {

                                    System.out.println("Fila vazia");

                                } else {

                                    System.out.println("Fila não vazia");

                                }

                                break;

                            case 5:

                                try {

                                    System.out.println("\nTamanho da fila = "
                                            + dynamicQueue.size() + "\n");

                                } catch (Exception e) {

                                    System.out.println(e.getMessage());

                                }

                                break;

                            case 6:

                                break;

                        }

                    } while (flag != 6);

                    break;

            }

        } while (flag != 0);

    }

}
