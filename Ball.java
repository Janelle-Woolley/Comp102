// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 6
 * Name: Janelle Woolley
 * Username: woollejane
 * ID: 300660812
 */

import ecs100.*;
import java.awt.Color;

/** Ball represents a ball that is launched by the mouse towards a direction.
 *    Each time the step() method is called, it will take one step.  
 *    
 * @author Janelle Woolley
 * @version 1.0 06/05/2024
 */

public class Ball{

    // Constants for all balls: size, position of the ground
    public static final double DIAM = 16;  // diameter of the balls.
    public static final double GROUND = BallGame.GROUND;
    public static final double RIGHT_END = BallGame.RIGHT_END;

    // Fields to store state of the ball:
    // x position, height above ground, stepX, stepY, colour
    //   The ball should initially be not moving at all. (step should be 0)
    /*# YOUR CODE HERE */
    
    private double xPos;
    private double height;
    private double stepX = 0;
    private double stepY = 0;
    private Color color;

    // Constructor
    /** Construct a new Ball object.
     *    Parameters are the initial position (x and the height above the ground),
     *    Stores the parameters into fields 
     *    and initialises the colour to a random colour
     *  SHOULD NOT DRAW THE BALL!
     */
    public Ball(double x, double h){
        /*# YOUR CODE HERE */
        
        this.xPos = x;
        this.height = h;
        this.color = new Color((float)Math.random(),(float)Math.random(),(float)Math.random());
        
    }

    // Methods
    /**
     * Draw the ball on the Graphics Pane in its current position
     * (unless it is past the RIGHT_END )
     */
    public void draw(){
        /*# YOUR CODE HERE */
        
        if (xPos < RIGHT_END && height < GROUND){
            // draw ball
            UI.setColor(color); // set pen color to the ball's color
            UI.fillOval(xPos - DIAM/2, GROUND - height - DIAM, DIAM, DIAM); // draw ball
            
            // draw outline
            UI.setColor(Color.black); // set pen color to black
            UI.drawOval(xPos - DIAM/2, GROUND - height - DIAM, DIAM, DIAM); // draw outline around ball
        }

    }

    /**
     * Move the ball one step (DO NOT REDRAW IT)
     *    Change its height and x position using the vertical and horizonal steps
     *    Reduce its vertical speed each step (due to gravity), 
     *    If it would go below ground, then change its y position to ground level
     *      and set the  vertical speed back to 0.
     */
    public void step(){
        /*# YOUR CODE HERE */
        
        xPos = xPos + stepX;
        height = height + stepY;
        stepY -= 0.2;
    
        if (height < 0){
            height = 0;
            stepY = 0;
        }

    }

    /**
     * Set the horizontal speed of the ball: how much it moves to the right in each step.
     * (negative if ball going to the left).
     */
    public void setXSpeed(double xSpeed){
        /*# YOUR CODE HERE */
        
        this.stepX = xSpeed;

    }

    /**
     * Set the vertical speed of the ball: how much it moves up in each step
     * (negative if ball going down).
     */
    public void setYSpeed(double ySpeed){
        /*# YOUR CODE HERE */
        
        this.stepY = ySpeed;

    }

    /**
     * Return the height of the ball above the ground
     */
    public double getHeight(){
        /*# YOUR CODE HERE */
        
        return this.height;

    }

    /**
     * Return the horizontal position of the ball
     */
    public double getX(){
        /*# YOUR CODE HERE */
        
        return this.xPos;

    }


}
