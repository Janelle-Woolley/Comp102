// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 1
 * Name: Janelle Woolley
 * Username: woollejane
 * ID: 300660812
 */

import ecs100.*;
import java.awt.Color;

/**
 * Draws various flags
 *
 * @author Janelle Woolley
 * @version 1.1 11/03/2024
 * 
 * You can find lots of flag details (including the correct dimensions and colours)
 * from  http://www.crwflags.com/fotw/flags/ 
 */

public class FlagDrawer{
    public static final double LEFT = 100;  // the left side of the flags
    public static final double TOP = 50;    // the top of the flags

    /**
     * Draw the flag of the United Arab Emirates.
     * The flag has a vertical red stripe on the left, and
     * three horizontal stripes (green, white, black) on the right.
     * See the assignment for dimensions and details.
     */
    public void drawUAEFlag() {
        UI.clearGraphics();
        UI.println("UAE Flag");
        double width = UI.askDouble("How wide: "); // ask user for width
        
        // declare and intalise variables for repeated values
        double height = width/2;
        double stripeLeft = LEFT + (width * 1/4);
        double stripeWidth = width * 3/4;
        double stripeHeight = height * 1/3;

        // Draw Vertical Red Section
        UI.setColor(Color.red); // Use red pen
        UI.fillRect(LEFT, TOP, width * 1/4, height); // Draw red rectangle
        
        // Draw Horizontal Green Stripe
        UI.setColor(Color.green); // Use green pen
        UI.fillRect(stripeLeft, TOP, stripeWidth, stripeHeight); // Draw green stripe
        
        // Draw Horizontal White Stripe
        UI.setColor(Color.white); // Use white pen
        UI.fillRect(stripeLeft, TOP + (height * 1/3), stripeWidth, stripeHeight); // Draw white stripe 
        
        // Draw Horizontal Black Stripe
        UI.setColor(Color.black); // Use black pen
        UI.fillRect(stripeLeft, TOP + (height * 2/3), stripeWidth, stripeHeight); // Draw black stripe 
        
        // Draw Flag Outline
        UI.drawRect(LEFT, TOP, width, height); // Draw Black Outline 

    }

    /**
     * Draw the flag of Greenland.
     * The top half of the flag is white, and the bottom half is red.
     * There is a circle in the middle (off-set to left) which is
     * also half white/red but on the opposite sides.
     * The flag is 2/3 as high as it is wide (ratio 2:3).
     */
    public void drawGreenlandFlag() {
        UI.clearGraphics();
        UI.println("Greenland Flag");
        double width = UI.askDouble("How wide: "); // ask user for width
        
        // declare and intialise local variables
        double height = width * 2/3;
        double stripeheight = height * 1/2;
        double arcLeft = LEFT + (width * 1/6);
        double arcTop = TOP + (height * 1/6);
        double arcWidth = width / 2.25;
        double arcHeight = height * 2/3;

        // Draw White Half
        UI.setColor(Color.white);// Use white pen
        UI.fillRect (LEFT, TOP, width, stripeheight); // Draw White rectangle
        
        // Draw Red Half
        UI.setColor(Color.red); // Use red pen
        UI.fillRect(LEFT, TOP + stripeheight, width, stripeheight); // Draw Red rectangle
        
        // Draw Red Semi-circle
        UI.fillArc(arcLeft, arcTop, arcWidth, arcHeight, 0, 180); // Draw Red Semi-circle
        
        // Draw White Semi-circle
        UI.setColor(Color.white); // Use white pen
        UI.fillArc(arcLeft, arcTop, arcWidth, arcHeight, 180, 180);// Fill Arc 
        
        // Draw Flag Outline
        UI.setColor(Color.black); // Use black pen
        UI.drawRect(LEFT, TOP, width, height); // Draw Black Outline

    }
    
    /**
     *  The Czech flag
     *  The flag is 2/3 as high as it is wide (ratio 2:3).
     *  Two horizontal stripes (white and red) with a blue isoceles triangle on the left side.
     *  Note: there is no fillTriangle method in the UI class! Maybe you could use arcs?
     */
    public  void drawCzechFlag(){
        UI.clearGraphics();  
        UI.println("Czech Flag");
        double width = UI.askDouble("How wide: "); // ask user for width
        
        // declare and initalise local variables
        double halfWidth = width * 1/2;
        double height = width / 1.5;
        double arcLeft = LEFT - width;
        double arcDiamiter = width * 2;
        double stripeLeft = LEFT + halfWidth;
        double stripeHeight = height * 1/2; 

        // Draw Blue Section
        UI.setColor(Color.blue); // Use blue pen
        UI.fillRect(LEFT, TOP, halfWidth, height); // Make half the flag blue
        
        // Draw White Arc
        UI.setColor(Color.white); // Use white pen
        UI.fillArc(arcLeft, TOP - width, arcDiamiter, arcDiamiter, 326.31, 33.69); // Draw white arc to get top side of triangle
        
        // Draw Red Arc
        UI.setColor(Color.red); // Use red pen
        UI.fillArc(arcLeft, TOP - (width-height), arcDiamiter, arcDiamiter, 0, 33.69); // Draw red arc to get bottom side of triangle
        
        // Fill Red Stripe
        UI.fillRect(stripeLeft, TOP + stripeHeight, halfWidth, stripeHeight); // Draw red rectangle to finish red stripe
        
        // Fill White Stripe
        UI.setColor(Color.white); // Use white pen
        UI.fillRect(stripeLeft, TOP, halfWidth, stripeHeight); // Draw white rectangle to finish white stripe
        
        // Draw Flag Outline
        UI.setColor(Color.black); // Use black pen
        UI.drawRect(LEFT, TOP, width, height); // Draw Black outline

    }
    
    /**   CHALLENGE
     * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
     * Draw the Misubishi Logo.
     */
        public void drawMitsubishiLogo() {
        /*# YOUR CODE HERE */
        UI.clearGraphics();  
        UI.println("Mitsubishi Logo");
        double width = UI.askDouble("How wide: "); // ask user for width
        
        // declare and initalise local variables
        double radius = width / 3;
        double diamiter = radius * 2;
        
        // LEFT and TOP shifts for the arcs
        double middleTriangleLeft = LEFT + (radius * 1/2);
        double leftTriangleLeft = LEFT - radius;
        double rightTriangleRight = LEFT + (radius * 2);
        double middleTriangleTop = TOP + (radius * 3/4);
        double topTriangleTop = TOP - (radius * 31/32);
        double bottomTriangleTop = TOP + (radius * 13/8);
        
        UI.setColor(Color.red); // Use red pen
        
        // Draw Middle Triangles
        UI.fillArc(middleTriangleLeft, middleTriangleTop, diamiter, diamiter, 60, 60); // Draw middle top arc
        UI.fillArc(middleTriangleLeft, middleTriangleTop, diamiter, diamiter, 180, 60); // Draw middle left arc
        UI.fillArc(middleTriangleLeft, middleTriangleTop, diamiter, diamiter, 300, 60); // Draw middle right arc
        
        // Draw Top Triangle
        UI.fillArc(middleTriangleLeft, topTriangleTop, diamiter, diamiter, 240, 60); // draw top arc
        
        // Draw Left Triangle
        UI.fillArc(leftTriangleLeft, bottomTriangleTop, diamiter, diamiter, 0, 60); // draw left arc
        
        // Draw Right Triangle
        UI.fillArc(rightTriangleRight, bottomTriangleTop, diamiter, diamiter, 120, 60); // draw right arc

    }

    /**   CHALLENGE
     * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
     * Draw the Koru Flag.
     * It was one of the new flag designs for the 2016 referendum,
     * designed by Sven Baker from Wellington
     * The flag is 1/2 as high as it is wide (ratio 1:2).
     */
    public void drawKoruFlag() {
        /*# YOUR CODE HERE */

    }

    public void setupGUI(){
        UI.addButton("Clear", UI::clearPanes);
        UI.addButton("Flag of UAE", this::drawUAEFlag);
        UI.addButton("Flag of Greenland", this::drawGreenlandFlag);
        UI.addButton("Czech Flag", this::drawCzechFlag);        
        UI.addButton("CHALLENGE: Mitsubishi logo", this::drawMitsubishiLogo);        
        UI.addButton("CHALLENGE: Koru Flag", this::drawKoruFlag);
        UI.addButton("Quit", UI::quit);

        UI.setDivider(0.3);
    }

    public static void main(String[] arguments){
        FlagDrawer fd = new FlagDrawer();
        fd.setupGUI();
    }

}