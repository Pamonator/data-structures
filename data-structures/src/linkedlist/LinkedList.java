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

            Node auxNode = this.first;

            while (auxNode.getNext() != null) {

                auxNode = auxNode.getNext();

            }

            auxNode.setNext(newNode);
        }

    }

    public void orderedEnlist(int value) {

        Node newNode;
        newNode = new Node();
        newNode.setValue(value);
        newNode.setNext(null);

        if (this.isEmpty()) {

            this.first = newNode;

        } else if (value < this.first.getValue()) {

            newNode.setNext(this.first);
            this.first = newNode;

        } else {

            Node auxNode = this.first;

            while (auxNode.getNext() != null && auxNode.getNext().getValue() <= value) {

                auxNode = auxNode.getNext();

            }

            if (auxNode.getNext() != null) {

                newNode.setNext(auxNode.getNext());
                auxNode.setNext(newNode);

            } else {

                auxNode.setNext(newNode);

            }

        }

    }

    public void delist(int value) throws EmptyListException {

        if (!this.isEmpty()) {

            while (this.doesValueExist(value)) {

                if (this.first.getValue() == value) {

                    this.first = this.first.getNext();

                } else {

                    Node auxNode = this.first;

                    while (auxNode.getNext() != null) {

                        if (auxNode.getNext().getValue() == value) {

                            auxNode.setNext(auxNode.getNext().getNext());

                        } else {

                            auxNode = auxNode.getNext();

                        }

                    }

                }

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

    public boolean removeValue(int value) throws EmptyListException {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            if (this.first.getValue() == value) {

                this.first = this.first.getNext();

                wasRemoved = true;

            } else {

                Node auxNode = this.first;

                while (auxNode.getNext() != null) {

                    if (auxNode.getNext().getValue() == value) {

                        auxNode.setNext(auxNode.getNext().getNext());

                        wasRemoved = true;

                    } else {

                        auxNode = auxNode.getNext();

                    }

                }

            }

        } else {

            throw new EmptyListException("A Lista esta vazia!");

        }

        return wasRemoved;

    }

    public boolean removeFirst() throws EmptyListException {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            this.first = this.first.getNext();

            wasRemoved = true;

        } else {

            throw new EmptyListException("A Lista esta vazia!");

        }

        return wasRemoved;

    }

    public boolean removeLast() {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            if (this.first.getNext() == null) {

                this.first = null;

                wasRemoved = true;

            } else {

                Node auxNode = this.first;

                while (auxNode.getNext().getNext() != null) {

                    auxNode = auxNode.getNext();

                }

                auxNode.setNext(null);

                wasRemoved = true;

            }

        } else {

            throw new EmptyListException("A Lista esta vazia!");

        }

        return wasRemoved;

    }

    public boolean isEmpty() {

        return this.first == null;

    }

    public int size() {

        int size = 0;

        if (!this.isEmpty()) {

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

    public void showValuesBackward(Node node) throws EmptyListException {

        if (node.getNext() != null) {
           
            showValuesBackward(node.getNext());
            System.out.println(node.getValue());

        } else {
            
            System.out.println(node.getValue());
            
        }

    }           

    private boolean doesValueExist(int value) {

        if (!this.isEmpty()) {

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

        }

        return false;

    }

}
