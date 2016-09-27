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

    public void enlist(Node temp, Node node) {

        if (this.isEmpty()) {

            this.first = node;

        } else if (temp.getNext() != null) {

            temp = temp.getNext();
            enlist(temp, node);

        } else {

            temp.setNext(node);

        }

    }

    public void orderedEnlist(Node temp, Node node) {

        if (this.isEmpty()) {

            this.first = node;

        } else if (node.getValue() < this.first.getValue()) {

            node.setNext(this.first);
            this.first = node;

        } else if (temp.getNext() != null && temp.getNext().getValue() <= node.getValue()) {

            temp = temp.getNext();
            orderedEnlist(temp, node);

        } else if (temp.getNext() != null) {

            node.setNext(temp.getNext());
            temp.setNext(node);

        } else {

            temp.setNext(node);

        }

    }

    public void delist(Node temp, int value) throws EmptyListException {

        if (!this.isEmpty()) {

            while (this.doesValueExist(temp, value)) {

                if (this.first.getValue() == value) {

                    this.first = this.first.getNext();

                } else if (temp.getNext() != null) {

                    if (temp.getNext().getValue() == value) {

                        temp.setNext(temp.getNext().getNext());

                    } else {

                        delist(temp.getNext(), value);

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

    public Node getLast(Node temp) {

        if (temp.getNext() != null) {

            getLast(temp.getNext());

        }

        return temp;
    }

    public boolean removeValue(Node temp, int value) throws EmptyListException {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            if (this.first.getValue() == value) {

                this.first = this.first.getNext();

                wasRemoved = true;

            } else if (temp.getNext() != null) {

                if (temp.getNext().getValue() == value) {

                    temp.setNext(temp.getNext().getNext());

                    wasRemoved = true;

                } else {

                    removeValue(temp.getNext(), value);

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

    public boolean removeLast(Node temp) {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            if (this.first.getNext() == null) {

                this.first = null;

                wasRemoved = true;

            } else if (temp.getNext().getNext() != null) {

                removeLast(temp.getNext());

            } else {

                temp.setNext(null);

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

    public void showValues(Node temp) {

        if (temp != null) {

            System.out.println(temp.getValue());
            showValues(temp.getNext());

        }

    }

    public void showValuesBackward(Node node) {

        if (node != null) {

            showValuesBackward(node.getNext());
            System.out.println(node.getValue());

        }

    }

    private boolean doesValueExist(Node temp, int value) {

        if (!this.isEmpty()) {

            if (temp.getValue() == value) {

                return true;

            }

            if (temp.getNext() != null) {

                if (temp.getNext().getValue() == value) {

                    return true;

                } else {

                    doesValueExist(temp.getNext(), value);

                }

            }

        }

        return false;

    }

    /**
     * Método que remove todos os valores não primos de uma lista de inteiros
     */
    public void primos() {

        if (this.first.getValue() == 0) {

            this.first = this.first.getNext();

        }

        if (this.first.getValue() == 1) {

            this.first = this.first.getNext();

        }

        Node temp = this.first;

        while (temp.getNext() != null) {

            Node aux = temp;

            while (aux.getNext() != null) {

                if (aux.getNext().getValue() % temp.getValue() != 0) {

                    aux = aux.getNext();

                } else {

                    aux.setNext(aux.getNext().getNext());

                }

            }

            temp = temp.getNext();

        }
    }

    public void primos(Node temp) {

        if (temp == this.first && temp.getValue() == 0) {

            this.first = this.first.getNext();
            temp = this.first;

        }

        if (temp == this.first && temp.getValue() == 1) {

            this.first = this.first.getNext();
            temp = this.first;

        }

        if (temp.getNext() != null) {

            Node aux = temp;

            while (aux.getNext() != null) {

                if (aux.getNext().getValue() % temp.getValue() != 0) {

                    aux = aux.getNext();

                } else {

                    aux.setNext(aux.getNext().getNext());

                }

            }

            primos(temp.getNext());

        }
    }

}
