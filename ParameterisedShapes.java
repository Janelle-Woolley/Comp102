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
 * @ version 1.0 19/03/2024
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
        
        // ask user for heights of stripes
        double h1 = UI.askDouble("Height of first stripe: "); // height for stripe 1
        double h2 = UI.askDouble("Height of second stripe: "); // height for stripe 2
        double h3 = UI.askDouble("Height of third stripe: "); // height for stripe 3
        
        // ask user if circles are filled or unfilled
        boolean circlesFilled = UI.askBoolean("Do you want the circles filled (yes/no): ");
        
        // call drawFancyRect
        drawFancyRect(left, top, h1, h2, h3, col1, col2, col3, circlesFilled);
        
    }

    /**
     * Calculates the total height and width of the rectangle.
     * The width of the rectangle is 1.5 times the height of the rectangle.
     * It then calls drawStripe three times to draw the three stripes,
     * and outlines the rectangle with a black contour.
     */
    public void drawFancyRect(/*# YOUR CODE HERE */ double left, double top, double h1, double h2, double h3, Color col1, Color col2, Color col3, boolean circleType){

        UI.clearGraphics();
        /*# YOUR CODE HERE */
        
        // height = h1 + h2 + h3
        // width = height * 1.5
        // topStripeTwo = top + h1
        // topStripeThree = top + h1 + h2
        
        // call draw stripe x3
        // stripe 1 (left, top, width, h1, col1, circleType, 0)
        // stripe 2 (left, topStripeTwo, width, h2, col2, circleType, 1)
        // stripe 3 (left, topStripeThree, width, h3, col3, circleType, 2)
        
        // draw black outline
        // Use black pen
        // draw rect (left, top, width, height)
    
    }

    /**
     * Draws a stripe at the given position that has the right circle at the right place.
     */
    public void drawStripe(/*# YOUR CODE HERE */ /* left, top, width, height, stripeColor circleType, circleShift */ ){
        /*# YOUR CODE HERE */
        // diameter = height * 0.2
        // circleLeftShift = ((left + (width/3 * circleShift)) + ((width/3)/2)) - diameter/2
        // circleTopShift = (top + height/2) - diameter/2
        
        // draw stripe
        // Use color pen
        // fill rect (left, top, width, height)
        
        // draw circle
        // Use black pen
        // if circle is filled
            // fill oval (circleLeftShift, circleTopShift, diameter, diameter)
        // else circle is just outline
            // draw oval (circleLeftShift, circleTopShift, diameter, diameter)

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
