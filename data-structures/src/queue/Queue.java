/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

import exception.EmptyQueueException;
import exception.FullQueueException;

/**
 *
 * @author gilca
 */
public class Queue {

    public int[] vector;
    public int first;
    public int last;
    public int n;
    private int size;

    public Queue(int n) {

        this.vector = new int[n];
        this.n = n;
        this.first = -1;
        this.last = -1;
        this.size = 0;

    }

    public void enqueue(int value) throws FullQueueException {

        if (this.isEmpty()) {

            this.first++;
            this.last = this.first;
            this.vector[this.first] = value;
            this.size++;

        } else if (!this.isFull()) {

            if (this.last == (this.n - 1)) {

                this.last = 0;
                this.vector[last] = value;

            } else {

                this.last++;
                this.vector[last] = value;

            }

            this.size++;

        } else {

            throw new FullQueueException("A fila está cheia!");

        }

    }

    public void dequeue() throws EmptyQueueException {

        if (!this.isEmpty() && this.size() > 1) {

            if (this.first == (this.n - 1)) {

                this.first = 0;

            } else {

                this.first++;

            }

            this.size--;

        } else if (!this.isEmpty() && this.size() == 1) {

            this.first = -1;
            this.last = -1;
            this.size = 0;

        } else {

            throw new EmptyQueueException("A fila está vazia!");

        }

    }

    public boolean isEmpty() {

        return this.last < 0 || this.first < 0;

    }

    public boolean isFull() {

        return this.size == n;

    }

    public int size() {

        return this.size;

    }

    public void showValues() throws EmptyQueueException {

        if (!this.isEmpty()) {

            if (this.first == this.last) {

                System.out.println(vector[this.first]);

            } else if (this.first < this.last) {

                for (int i = this.first; i <= this.last; i++) {

                    System.out.println(vector[i]);

                }

            } else {

                for (int i = this.first; i < (n - 1); i++) {

                    System.out.println(vector[i]);

                }
                
                for (int i = 0; i < this.last; i++) {
                    
                    System.out.println(vector[i]);
                    
                }

            }

        } else {

            throw new EmptyQueueException("A fila está vazia!");

        }

    }

}
