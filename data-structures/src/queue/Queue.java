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
    public int last;
    public int n;

    public Queue(int n) {

        this.vector = new int[n];
        this.n = n;
        this.last = -1;

    }

    public void enqueue(int value) throws FullQueueException {

        if (!this.isFull()) {

            this.last++;
            this.vector[last] = value;

        } else {
            
            throw new FullQueueException("A fila está cheia!");
            
        }

    }

    public void dequeue() throws EmptyQueueException {

        if (!this.isEmpty() && this.size() > 1) {

            for (int i = 1; i <= this.last; i++) {

                vector[i - 1] = vector[i];

            }

            last--;

        } else if (!this.isEmpty() && this.size() == 1) {

            last--;

        } else {

            throw new EmptyQueueException("A fila está vazia!");

        }

    }

    public boolean isEmpty() {

        return last < 0;

    }

    public boolean isFull() {

        return last == (n - 1);

    }

    public int size() {

        return last + 1;

    }

    public void showValues() throws EmptyQueueException {

        if (!this.isEmpty()) {

            for (int i = 0; i <= this.last; i++) {

                System.out.println(vector[i]);

            }

        } else {
            
            throw new EmptyQueueException("A fila está vazia!");
            
        }

    }

}
