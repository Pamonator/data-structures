/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicstack;

import exception.EmptyStackException;

/**
 *
 * @author a1402072
 */
public class DynamicStack {

    public Node top = null;

    public void stackUp(int value) {

        Node newNode = new Node();
        newNode.setValue(value);
        newNode.setPrevious(this.top);
        this.top = newNode;

    }

    public void unstack() throws EmptyStackException {

        if (!isEmpty()) {

            this.top = top.getPrevious();

        } else {

            throw new EmptyStackException("A pilha está vazia!");

        }

    }

    public int top() {

        return this.top.getValue();

    }

    public int size() throws EmptyStackException {

        int size = 0;

        if (!isEmpty()) {

            Node nodeAux = this.top;

            while (nodeAux != null) {

                size++;
                nodeAux = nodeAux.getPrevious();

            }

        } 

        return size;

    }

    public boolean isEmpty() {

        return this.top == null;

    }

    public void showValues() throws EmptyStackException {

        if (!isEmpty()) {

            Node nodeAux = this.top;

            while (nodeAux != null) {

                System.out.println(nodeAux.getValue());
                nodeAux = nodeAux.getPrevious();

            }

        } else {

            throw new EmptyStackException("A pilha está vazia!");

        }

    }

}
