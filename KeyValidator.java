// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 2
 * Name: Janelle Woolley
 * Username: woollejane
 * ID: 300660812
 */

import ecs100.*;
import java.awt.Color;

/**
 * Asks user for a key word and checks whether it meets a set of rules or not.
 *
 * @author Janelle Woolley
 * @version 1.0 18/03/2024
 */

public class KeyValidator {

    /**
     * Asks user for key word and then checks if it is a valid key word.
     */
    public void checkKey(){
        UI.clearText();
        String key = UI.askString("Key:   ");
        UI.println();
        this.validateKey(key);
    }

    /**
     * Report that the key is valid or report ALL the rules that the key failed.
     */
    public void validateKey(String key){
        /*# YOUR CODE HERE */
        
        boolean validKey = true;
        
        // if key is less than 6
        if(key.length() < 6){
            UI.println("Key is too short!");
            validKey = false;
        }
        
        // if key is more than 12
        // starts with ? or !
        // contains @
        // has 1 upper case and 1 lower case

    }


    /**
     * Setup GUI and buttons
     */
    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearText );
        UI.addButton("Check Key", this::checkKey );
        UI.addButton("Quit", UI::quit );
        UI.setDivider(1);       // Expand the text area
    }

    /**
     * Create object and call setupGUI on it
     */ 
    public static void main(String[] args){
        KeyValidator kv = new KeyValidator();
        kv.setupGUI();
    }
}
