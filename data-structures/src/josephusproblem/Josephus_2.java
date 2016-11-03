/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josephusproblem;

import circulardoublylinkedlist.CircularDoublyLinkedList;
import java.util.Scanner;

/**
 *
 * @author gilca
 */
public class Josephus_2 {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();
        int n, s, j;

        System.out.println("Informe um valor inteiro para N:");
        n = scanner.nextInt();
        System.out.println("Informe um valor inteiro para S:");
        s = scanner.nextInt();
        System.out.println("Informe um valor inteiro para J:");
        j = scanner.nextInt();
        
        System.out.println("Sobrevivente:" + list.josephusThisShit(n, s, j));
        
    }
    
}
