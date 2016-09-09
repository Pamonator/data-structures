/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularlist;

import linkedlist.*;

/**
 *
 * @author gilca
 */
public class Node {
    
    private int value;
    private Node next;  
    
    public void setNext(Node next) {
        
        this.next = next;
        
    }
    
    public Node getNext() {
        
        return this.next;
        
    }
    
    public void setValue(int value) {
        
        this.value = value;
        
    }
    
    public int getValue() {
        
        return this.value;
        
    }
    
}
