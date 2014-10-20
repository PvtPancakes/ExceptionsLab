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
public class FirstNameNotFoundException extends IllegalArgumentException {
    
    public FirstNameNotFoundException(){
        super();
    }
    
    public FirstNameNotFoundException(String s){
        super(s);
    }
    
    public FirstNameNotFoundException(String message, Throwable cause){
        super(message, cause);
    }
    
    public FirstNameNotFoundException(Throwable cause){
        super(cause);
    }
    
}
