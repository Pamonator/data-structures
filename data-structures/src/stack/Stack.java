/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author a1402072
 */
public class Stack {

    public int[] vector;
    public int top;
    public int n;

    public Stack(int n) {

        this.vector = new int[n];
        this.top = -1;
        this.n = n;

    }

    public void stackUp(int value) throws Exception {

        if (!this.isFull()) {

            this.top++;
            this.vector[top] = value;

        } else {

            throw new Exception("A pilha já esta cheia!");

        }

    }

    public void unstack() {

        if (!this.isEmpty()) {

            top--;

        }

    }

    public int top() {

        return vector[top];

    }

    public int size() {

        return top + 1;

    }

    public boolean isEmpty() {

        return top == -1;

    }

    public boolean isFull() {

       return (top + 1) == n;
        
    }

}
