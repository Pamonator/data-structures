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
public class EmptyStackException extends NullPointerException {
    
    public EmptyStackException() {
        
        super();
        
    }
    
    public EmptyStackException(String message) {
        
        super(message);
        
    }
    
}
