/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephusproblem;

import circularlist.CircularList;
import java.util.Scanner;
import node.Node;

/**
 *
 * @author a1402072
 */
public class JosephusProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CircularList circularList = new CircularList();
        int n, s;

        System.out.println("Informe um valor inteiro para N:");
        n = scanner.nextInt();
        System.out.println("Informe um valor inteiro para S:");
        s = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            circularList.enlist(i + 1);

        }

        Node aux = circularList.getFirst();

        while (aux != aux.getNext()) {

            for (int i = 0; i < s; i++) {

                aux = aux.getNext();

            }

            circularList.delist(aux.getValue());
            
            aux = aux.getNext();

        }

        System.out.println("Sobrevivente: ");
        circularList.showValues();

    }

}
