// This program is copyright VUW.
// You are granted permission to use it to construct your answer to a COMP102 assignment.
// You may not distribute it in any other way without permission.

/* Code for COMP102 - 2024T1, Assignment 4
 * Name: Janelle Woolley
 * Username: woollejane
 * ID: 300660812
 */

import ecs100.*;
import java.awt.Color;

/** PatternsDrawer: draws various repetitive patterns. 
  * @author Janelle Woolley
  * @version 1.0 22/04/2024
  */

public class PatternsDrawer{
    public static final double PATTERN_LEFT = 50.0;   // Left side of the pattern
    public static final double PATTERN_TOP = 50.0;    // Top of the pattern
    public static final double PATTERN_SIZE = 300.0;  // The size of the pattern on the window

    /** Draw a checkered board with alternating black and white squares
     *  Asks the user for the number of squares on each side
     */
    public void drawDraughtsBoard(){
        UI.clearGraphics();
        UI.setColor(Color.black);
        int num = UI.askInt("How many rows:");
        /*# YOUR CODE HERE */
        
        double width = PATTERN_SIZE/num;
        
        for(int row = 0; row < num; row ++){
            for(int column = 0; column < num; column ++){
                if (((row%2 == 0) && (column%2 == 0)) || ((row%2 != 0) && (column%2 != 0))){
                    UI.setColor(Color.white); // Use white pen
                } else {
                    UI.setColor(Color.black); // Use black pen
                }
                
                // draw a square of the board
                UI.fillRect(PATTERN_LEFT + (width*column), PATTERN_TOP + (width*row), width, width);
                
            }
        }
        
        UI.setColor(Color.black); // Use black pen
        // draw outline of board
        UI.drawRect(PATTERN_LEFT, PATTERN_TOP, PATTERN_SIZE, PATTERN_SIZE);
    }

    /** TriGrid
     * a triangular grid of squares that makes dark circles appear 
     * in the intersections when you look at it.
     */
    public void drawTriGrid(){
        UI.clearGraphics();
        UI.setColor(Color.black);
        int num = UI.askInt("How many rows:");
        /*# YOUR CODE HERE */
        
        int totalColumn = num;
        double widthWithGap = PATTERN_SIZE/num;
        double squareWidth = widthWithGap * 0.9;
        
        for(int row = 0; row < num; row ++){
            for(int column = 0; column < totalColumn; column ++){
                // draw a square
                UI.fillRect(PATTERN_LEFT + (widthWithGap*column), PATTERN_TOP + (widthWithGap*row), squareWidth, squareWidth);
            }
            totalColumn--;
        }
    }


    /**   CHALLENGE
     * DO NOT DO THIS IF YOU HAVE NOT DONE THE PREVIOUS METHODS
     * Draw a board made of hexagonals
     *  Asks the user for the number of hexagonals on each side
     */
    public void drawHexagonalBoard(){
        /*# YOUR CODE HERE */

    }

    /** Draw a Spiral board consisting of a square spiral path of small white squares.
     *  Asks the user for the number of squares along the top
     *
     * CHALLENGE
     */
    public void drawSpiralBoard(){
        /*# YOUR CODE HERE */

    }

    public void setupGUI(){
        UI.initialise();
        UI.addButton("Clear",UI::clearPanes);
        UI.addButton("Draughts", this::drawDraughtsBoard);
        UI.addButton("TriGrid", this::drawTriGrid);
        UI.addButton("CHALLENGE: Hexagon", this::drawHexagonalBoard);
        UI.addButton("CHALLENGE Spiral", this::drawSpiralBoard);
        UI.addButton("Quit",UI::quit);
    }   

    public static void main(String[] arguments){
        PatternsDrawer pd = new PatternsDrawer();
        pd.setupGUI();
    }

}
