/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicstack;

/**
 *
 * @author a1402072
 */
public class Node {
    
    private int value;
    private Node previous;  
    
    public void setPrevious(Node previous) {
        
        this.previous = previous;
        
    }
    
    public Node getPrevious() {
        
        return this.previous;
        
    }
    
    public void setValue(int value) {
        
        this.value = value;
        
    }
    
    public int getValue() {
        
        return this.value;
        
    }
    
}
