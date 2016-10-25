/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlist;

import exception.EmptyListException;
import node.Node;

/**
 *
 * @author gilca
 */
public class CircularList {

    private Node first = null;

    public void enlist(int value) {

        Node newNode = new Node();
        newNode.setValue(value);

        if (this.isEmpty()) {

            this.first = newNode;

        } else {

            Node auxNode = this.first;

            while (auxNode.getNext() != this.first) {

                auxNode = auxNode.getNext();

            }

            auxNode.setNext(newNode);

        }

        newNode.setNext(this.first);

    }

    public boolean delist(int value) throws EmptyListException {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            if (this.first.getValue() == value) {

                this.removeFirst();

                wasRemoved = true;

            } else {

                Node auxNode = this.first;

                while (auxNode.getNext() != this.first) {

                    if (auxNode.getNext().getValue() == value) {

                        auxNode.setNext(auxNode.getNext().getNext());

                        wasRemoved = true;

                    }

                    auxNode = auxNode.getNext();

                }

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

        if (!isEmpty()) {

            size = 1;

            Node nodeAux = this.first;

            while (nodeAux.getNext() != this.first) {

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

            while (nodeAux.getNext() != this.first) {

                System.out.println(nodeAux.getNext().getValue());
                nodeAux = nodeAux.getNext();

            }

        } else {

            throw new EmptyListException("A lista está vazia!");

        }

    }

    private boolean doExist(int value) throws EmptyListException {

        if (!this.isEmpty()) {

            Node nodeAux = this.first;

            if (nodeAux.getValue() == value) {

                return true;

            }

            while (nodeAux.getNext() != this.first) {

                if (nodeAux.getNext().getValue() == value) {

                    return true;

                }

                nodeAux = nodeAux.getNext();

            }

            return false;

        } else {

            throw new EmptyListException("A lista está vazia!");

        }

    }

    public void removeFirst() throws EmptyListException {

        if (!isEmpty()) {

            Node aux = this.first;

            while (aux.getNext() != this.first) {

                aux = aux.getNext();

            }

            this.first = this.first.getNext();

            aux.setNext(this.first);

        } else {

            throw new EmptyListException("Lista vazia!");

        }

    }

    public void removeLast() throws EmptyListException {

        if (!isEmpty()) {

            Node aux = this.first;

            while (aux.getNext().getNext() != this.first) {

                aux = aux.getNext();

            }

            aux.setNext(this.first);

        } else {

            throw new EmptyListException("Lista vazia!");

        }

    }

    public Node getFirst() {

        return this.first;

    }
}
