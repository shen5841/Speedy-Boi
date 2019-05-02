// Java program to demonstrate 
//schedule method calls of Timer class 
  
import java.util.Timer; 
import java.util.TimerTask; 

/**
 * Write a description of class Helper here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Helper extends TimerTask 
{ 
    public static int timeRemain = 0;
    
    public void run() 
    {   
        timeRemain += 1; 
        
    } 
} 
