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
public class EmptyTreeException extends NullPointerException {
    
    public EmptyTreeException() {
        
        super();
        
    }
    
    public EmptyTreeException(String message) {
        
        super(message);
        
    }
    
}
