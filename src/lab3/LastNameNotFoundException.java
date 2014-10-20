/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3;

/**
 *
 * @author eennis
 */
public class LastNameNotFoundException extends IllegalArgumentException {
    
    public LastNameNotFoundException(){
        super();
    }
    
    public LastNameNotFoundException(String s){
        super(s);
    }
    
    public LastNameNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    
    public LastNameNotFoundException(Throwable cause){
        super(cause);
    }
    
}
