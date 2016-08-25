/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import stack.Stack;

/**
 *
 * @author a1402072
 */
public class MainStack {

    public static void main(String[] args) {

        Stack stack = new Stack(5);
        
        System.out.println("Lista vazia: " + stack.isEmpty());
        
        System.out.println("Lista cheia: " + stack.isFull());

        try {
            stack.stackUp(10);
            stack.stackUp(6);
            stack.stackUp(1);
            stack.stackUp(4);
            stack.stackUp(7);
            stack.stackUp(9);
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            
        }

        System.out.println("topo da pilha: " + stack.top());
        
        System.out.println("Lista cheia: " + stack.isFull());

        stack.unstack();

        System.out.println("topo da pilha: " + stack.top());

        System.out.println("Lista vazia: " + stack.isEmpty());
        
        System.out.println("Lista cheia: " + stack.isFull());
        
        System.out.println("Tamanho da pilha = " + stack.size());

    }

}
