/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

import java.util.InputMismatchException;

/**
 *
 * @author gilca
 */
public class InvalidInputException extends InputMismatchException {
    
    public InvalidInputException() {
        
        super();
        
    }
    
    public InvalidInputException(String message) {
        
        super(message);
        
    }
    
}
