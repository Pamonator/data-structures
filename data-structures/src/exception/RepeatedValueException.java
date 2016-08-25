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
public class RepeatedValueException extends Exception {
    
    public RepeatedValueException() {
        
        super();
        
    }
    
    public RepeatedValueException(String message) {
        
        super(message);
        
    }
    
}
