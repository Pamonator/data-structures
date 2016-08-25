/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

import exception.EmptyListException;

/**
 *
 * @author gilca
 */
public class LinkedList {

    private Node first = null;
    private Node last = null;

    public void enlist(int value) {

        Node newNode;

        if (this.isEmpty()) {

            newNode = new Node();
            newNode.setValue(value);
            newNode.setNext(null);
            this.first = newNode;
            this.last = newNode;
            this.last.setNext(this.first);

        } else {

            newNode = new Node();
            newNode.setValue(value);
            newNode.setNext(null);
            this.last.setNext(newNode);
            this.last = newNode;

        }

    }

    public void delist(int value) {

        Node nodeAux = this.first;

        if (nodeAux.getValue() == value) {

            this.first = this.first.getNext();

        }

        while (nodeAux.getNext() != null) {

            if (nodeAux.getNext().getValue() == value) {

                nodeAux = nodeAux.getNext();

            }

            nodeAux = nodeAux.getNext();

        }

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

            throw new EmptyListException("A fila está vazia!");

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
