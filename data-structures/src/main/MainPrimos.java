/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import linkedlist.LinkedList;
import node.Node;

/**
 *
 * @author a1402072
 */
public class MainPrimos {

    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        int n = 20;

        for (int i = 0; i <= n; i++) {

            Node node = new Node();
            node.setValue(i);
            node.setNext(null);

            linkedList.enlist(linkedList.getFirst(), node);

        }
        
        linkedList.primos(linkedList.getFirst());

        linkedList.showValues(linkedList.getFirst());
        
    }

}
