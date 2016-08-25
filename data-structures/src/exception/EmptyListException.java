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
public class EmptyListException extends NullPointerException {
    
    public EmptyListException() {
        
        super();
        
    }
    
    public EmptyListException(String message) {
        
        super(message);
        
    }
    
}
