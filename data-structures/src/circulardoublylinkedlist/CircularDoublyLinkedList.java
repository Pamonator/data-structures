/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulardoublylinkedlist;

import exception.EmptyListException;

/**
 *
 * @author gilca
 */
public class CircularDoublyLinkedList {

    private Node first = null;

    public void enlist(int value) {

        Node newNode;
        newNode = new Node();
        newNode.setValue(value);        
        newNode.setPrevious(null);

        if (this.isEmpty()) {

            this.first = newNode;
            newNode.setNext(this.first);

        } else {

            Node auxNode = this.first;

            while (auxNode.getNext() != this.first) {

                auxNode = auxNode.getNext();

            }

            newNode.setPrevious(auxNode);
            newNode.setNext(this.first);
            auxNode.setNext(newNode);

        }

    }

    public void orderedEnlist(int value) {

        Node newNode;
        newNode = new Node();
        newNode.setValue(value);
        newNode.setNext(null);
        newNode.setPrevious(null);

        if (this.isEmpty()) {

            this.first = newNode;
            newNode.setNext(this.first);

        } else if (value < this.first.getValue()) {

            this.getLast().setNext(newNode);
            newNode.setNext(this.first);            
            this.first = newNode;
            

        } else {

            Node auxNode = this.first;

            while (auxNode.getNext() != this.first && auxNode.getNext().getValue() <= value) {

                auxNode = auxNode.getNext();

            }

            if (auxNode.getNext() != this.first) {

                newNode.setNext(auxNode.getNext());
                newNode.setPrevious(auxNode);
                auxNode.setNext(newNode);

            } else {

                auxNode.setNext(newNode);
                newNode.setPrevious(auxNode);
                newNode.setNext(this.first);

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

                    while (auxNode.getNext() != this.first) {

                        if (auxNode.getNext().getValue() == value) {

                            auxNode.setNext(auxNode.getNext().getNext());
                            auxNode.getNext().setPrevious(auxNode);

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

        while (aux.getNext() != this.first) {

            aux = aux.getNext();

        }

        return aux;
    }

    public boolean removeValue(int value) throws EmptyListException {

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
                        auxNode.getNext().setPrevious(auxNode);

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

    public boolean removeLast() {

        boolean wasRemoved = false;

        if (!this.isEmpty()) {

            if (this.first.getNext() == this.first) {

                this.first = null;

                wasRemoved = true;

            } else {

                Node auxNode = this.first;

                while (auxNode.getNext() != this.first) {

                    auxNode = auxNode.getNext();

                }

                auxNode.setNext(this.first);

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

    public void showValuesBackward(Node node) throws EmptyListException {

        if (node.getNext() != this.first) {

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

            while (nodeAux.getNext() != this.first) {

                if (nodeAux.getNext().getValue() == value) {

                    return true;

                }

                nodeAux = nodeAux.getNext();

            }

        }

        return false;

    }

}
