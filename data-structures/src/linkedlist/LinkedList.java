/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import node.Node;
import exception.EmptyListException;

/**
 *
 * @author gilca
 */
public class LinkedList {

    private Node first = null;

    public void enlist(int value) {

        Node newNode;
        newNode = new Node();
        newNode.setValue(value);
        newNode.setNext(null);

        if (this.isEmpty()) {

            this.first = newNode;

        } else {

            Node aux = this.first;

            while (aux.getNext() != null) {

                aux = aux.getNext();

            }

            aux.setNext(newNode);
        }

    }

    public void delist(int value) throws EmptyListException {

        if (!this.isEmpty()) {

            if (this.doExist(value)) {

                Node nodeAux = this.first;

                if (nodeAux.getValue() == value) {

                    this.first = this.first.getNext();

                }

                while (nodeAux.getNext() != null) {

                    if (nodeAux.getNext().getValue() == value) {

                        nodeAux = nodeAux.getNext().getNext();

                    }

                    nodeAux = nodeAux.getNext();

                }

            } else {

                System.out.println("Valor não encontrado na lista!");

            }
            
        } else {
            
            throw new EmptyListException("A lista está vazia!");
            
        }

    }

    public Node getFirst() {

        return this.first;

    }

    public Node getLast() {

        Node aux = this.first;

        while (aux.getNext() != null) {

            aux = aux.getNext();

        }

        return aux;
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

    public void showValues() throws EmptyListException {

        if (!this.isEmpty()) {

            Node nodeAux = this.first;

            System.out.println(nodeAux.getValue());

            while (nodeAux.getNext() != null) {

                System.out.println(nodeAux.getNext().getValue());
                nodeAux = nodeAux.getNext();

            }

        } else {

            throw new EmptyListException("A lista está vazia!");

        }

    }

    public boolean doExist(int value) {

        Node nodeAux = this.first;

        if (nodeAux.getValue() == value) {

            return true;

        }

        while (nodeAux.getNext() != null) {

            if (nodeAux.getNext().getValue() == value) {

                return true;

            }

            nodeAux = nodeAux.getNext();

        }

        return false;

    }

}
