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
import javax.swing.JColorChooser;

/** Parameterised Shapes: 
 * Pass/Fail level: draw rectangles with three horizontal stripes
 * Challenge: draw the flag of China
 * 
 * @author Janelle Woolley
 * @ version 1.0 18/03/2024
 */
public class ParameterisedShapes{

    /**
     * Asks user for a position, three colours, three heights and whether the circles are filled.
     * Then calls the drawFancyRect method, passing the appropriate arguments
     */
    public void doFancyRect(){
        double left = UI.askDouble("Left of rectangle");
        double top = UI.askDouble("Top of rectangle");
        UI.println("Now choose the colours");
        Color col1 = JColorChooser.showDialog(null, "First Stripe", Color.white);
        Color col2 = JColorChooser.showDialog(null, "Second Stripe", Color.white);
        Color col3 = JColorChooser.showDialog(null, "Third Stripe", Color.white);
        UI.println("Now choose the sizes");
        /*# YOUR CODE HERE */
        
        // height for stripes
        // height stripe 1
        // height stripe 2
        // height stripe 3
        
        // circles filled or unfilled
        
        // call drawFancyRect

    }

    /**
     * Calculates the total height and width of the rectangle.
     * The width of the rectangle is 1.5 times the height of the rectangle.
     * It then calls drawStripe three times to draw the three stripes,
     * and outlines the rectangle with a black contour.
     */
    public void drawFancyRect(/*# YOUR CODE HERE */ ){
        UI.clearGraphics();
        /*# YOUR CODE HERE */
        
        // call draw stripe x3
        // draw black outline
    
    }

    /**
     * Draws a stripe at the given position that has the right circle at the right place.
     */
    public void drawStripe(/*# YOUR CODE HERE */ ){
        /*# YOUR CODE HERE */
        
        // draw stripe
        // draw circle

    }

    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear", UI::clearPanes );
        UI.addButton("Fancy Rect", this::doFancyRect );
        // Add a button here to call your method for the challenge part
        UI.addButton("Quit", UI::quit );
    }

    public static void main(String[] args){
        ParameterisedShapes ps = new ParameterisedShapes ();
        ps.setupGUI();
    }

}
