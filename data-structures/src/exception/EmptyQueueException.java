/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author gilca
 */
public class EmptyQueueException extends NullPointerException {
    
    public EmptyQueueException() {
        
        super();
        
    }
    
    public EmptyQueueException(String message) {
        
        super(message);
        
    }
    
}
