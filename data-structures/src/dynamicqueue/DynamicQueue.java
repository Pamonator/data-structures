/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicqueue;

import exception.EmptyQueueException;
import node.Node;

/**
 *
 * @author gilca
 */
public class DynamicQueue {

    private Node first = null;
    private Node last = null;

    public void enqueue(int value) {

        Node newNode;

        if (this.isEmpty()) {

            newNode = new Node();
            newNode.setValue(value);            
            newNode.setNext(null);
            this.first = newNode;
            this.last = newNode;

        } else {
            
            newNode = new Node();
            newNode.setValue(value);
            newNode.setNext(null);
            this.last.setNext(newNode);
            this.last = newNode;

        }
    }

    public void dequeue() throws EmptyQueueException {

        if (!this.isEmpty()) {

            this.first = this.first.getNext();

        } else {

            throw new EmptyQueueException("A fila está vazia!");

        }

    }

    public int head() {
        
        return this.first.getValue();
        
    }
    
    public int tail() {
        
        return this.last.getValue();
        
    }
    
    
    public boolean isEmpty() {

        return this.first == null;

    }

    public int size() {

        int size = 0;

        if (!isEmpty()) {

            size = 1;

            Node nodeAux = this.first;

            while (nodeAux.getNext() != null) {

                size++;
                nodeAux = nodeAux.getNext();

            }

        }

        return size;

    }

    public void showValues() throws EmptyQueueException {

        if (!this.isEmpty()) {

            Node nodeAux = this.first;
            
            System.out.println(nodeAux.getValue());

            while (nodeAux.getNext() != null) {

                System.out.println(nodeAux.getNext().getValue());
                nodeAux = nodeAux.getNext();

            }

        } else {

            throw new EmptyQueueException("A fila está vazia!");

        }

    }

}
