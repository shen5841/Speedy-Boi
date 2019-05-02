/**
 * This is a class that plays the GUI version of the Thirteens game.
 * See accompanying documents for a description of how Thirteens is played.
 */


import java.util.Timer; 
import java.util.TimerTask;

public class SpeedyBoiGUIRunner
{
    /**
     * Plays the GUI version of Thirteens.
     * @param args is not used.
     */
    public static void main(String[] args) {
        
        Timer timer = new Timer(); 
        TimerTask task = new Helper(); 
        timer.schedule(task, 1000, 1000); 
        
        SpeedyBoiBoard board = new SpeedyBoiBoard();
        SpeedyBoiGUI gui = new SpeedyBoiGUI(board);
        gui.displayGame();
    }
}
