// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 3
 * Name: Janelle Woolley
 * Username: woollejane
 * ID: 300660812
 */

import ecs100.*;

/** Program to create simple animated animal character using the
 *  Animal class. 
 *  
 * @author Janelle Woolley
 * @version 1.0 25/03/2024 
 */

public class PetShow{

    public static final double EXIT_LEFT = 200;    
    public static final double EXIT_RIGHT = 700;    
    public static final double START_LEFT = 300;    
    public static final double START_RIGHT = 600;    

    /** animate creates three animals (randomly situated),
     *   that performs the same routine.
     *   Then the left and right most animals will compete
     *      towards their respective exit (the closest to them).
     *   The animal in the middle (horizontally) remains still.
     *   The animation stops when one of them have crossed their
     *      respective exit line.
     */
    public void animate(){
        UI.drawLine(EXIT_LEFT, 10, EXIT_LEFT, 700);
        UI.drawLine(EXIT_RIGHT, 10, EXIT_RIGHT, 700);
        /*# YOUR CODE HERE */
        
        // create three animals
        // randomly choose number between START_LEFT & START_RIGHT
        // animal 1
        // randomly choose number between START_LEFT & START_RIGHT
        // animal 2
        // randomly choose number between START_LEFT & START_RIGHT
        // animal 3
        
        // routine(animal 1)
        // routine(animal 2)
        // routine(animal 3)
        
        // get leftmost animal
        // get rightmost animal
        
        // while leftmost animal left < EXIT_LEFT && rightmost animal right < EXIT_RIGHT
            // leftmost animal move left
            // rightmost animal move right

    }

    /** return the animal closest to the left */
    public Animal closestToLeft (Animal a1, Animal a2, Animal a3){
        /*# YOUR CODE HERE */
        // get the animals lefts
        // compare the animals lefts
            // a1 > a2 && a1 > a3
            // return a1
            
            // a2 > a1 && a2 > a3
            // return a2
            
            // else
            // return a3
        
        return a1; // just so it compiles

    }
    
    /** return the animal closest to the right */
    public Animal closestToRight (Animal a1, Animal a2, Animal a3){
        /*# YOUR CODE HERE */
        // get the animals rights
        // compare the animals rights
            // a1 > a2 && a1 > a3
            // return a1
            
            // a2 > a1 && a2 > a3
            // return a2
            
            // else
            // return a3

        return a1; // just so it compiles
        
    }

    /** Make animal perform a routine*/
    public void routine(Animal animal){
        // introduce("hi hi hi")
        // go left()
        // jump(50)
        // speak("yippe")
        // go right()
        // shout("i'm done")
        
    }


    /** Make buttons to let the user run the methods */
    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearGraphics );
        UI.addButton("Animate", this::animate );
        UI.addButton("Quit", UI::quit );
        UI.setWindowSize((int)(EXIT_RIGHT+100), 700);
        UI.setDivider(0);       // Expand the graphics area
    }

    public static void main(String[] args){
        PetShow ps = new PetShow();
        ps.setupGUI();
    }
}

