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
import java.util.*;

/** 
 * The program contains several methods for analysing and displaying
 *   the profile of a road, based on GPS measurements every 10 meters
 *   along a section of the road.
 *  There are several things about the profile that a user may be
 *    interested in, especially
 *    - The average and maximum height
 *    - A visual plot of the road profile
 *    
 * @author Janelle Woolley
 * @version 1.0 22/04/2024
 */
public class RoadProfiler{

    public static final double LEFT = 30;       // where the start of the road segment will be plotted
    public static final double SEA_LEVEL = 400; // heights will be plotted as a distance above y = SEA_LEVEL
    public static final double STEP = 10;       // horizontal distance along road between height measurements


    /**
     *  analyseProfile() reads a sequence of heights from the user,
     *  prints out average and maximum height and plots a profile of the road
     *  by calling appropriate methods
     */
    public void analyseProfile(){
        UI.clearPanes();
        ArrayList<Double> listOfHeights = UI.askNumbers("Enter profile levels, end with 'done': ");
        if (listOfHeights.size() != 0) {
            this.printAverageHeight(listOfHeights);
            UI.printf("Highest point was:  %.2f\n", this.maximumHeight(listOfHeights));
            this.displayProfile(listOfHeights);
        }
        else {
            UI.println("No readings");
        }
    }

    /**
     * Print the average height
     *   Assumes there is at least one number in the list.
     */
    public void printAverageHeight(ArrayList<Double> listOfHeights) {
        /*# YOUR CODE HERE */
        
        double total = 0;
        for (double num : listOfHeights){
            total = total + num;
        }
            
        double average = total/listOfHeights.size();
        UI.println("Average: " + average);

    }

    /**
     *  Find and return the maximum level in the list
     *   Assumes there is at least one number in the list.
     */
    public double maximumHeight(ArrayList<Double> listOfHeights) {
        /*# YOUR CODE HERE */
        
        double max = Double.NEGATIVE_INFINITY;
        
        for(double num : listOfHeights){
            if (num > max){
                max = num;
            }
        }
        
        return max;
        
    }

    /**
     * Plot a continuous profile of the road segment,
     *   that join up adjacent points
     *   assuming that 0 m (sealevel) is at y=SEA_LEVEL 
     */
    public void displayProfile(ArrayList<Double> listOfHeights) {
        UI.clearGraphics();
        UI.drawLine(LEFT, SEA_LEVEL, LEFT+1000, SEA_LEVEL); // draw the base line to show sea level
        /*# YOUR CODE HERE */
        
        double prevX = LEFT;
        double prevY = listOfHeights.get(0);
        
        // loops through list starting at the second value
        for (int num = 1; num < listOfHeights.size(); num++){
            double y;
            if(listOfHeights.get(num) > 400){
                y = listOfHeights.get(num) - SEA_LEVEL;
            } else {
                y = SEA_LEVEL - listOfHeights.get(num);
            }
            
            double x = prevX + STEP;
            
            UI.drawLine(prevX, prevY, x, y);
            
            prevX = x;
            prevY = y;
        }
        
        UI.println("Finished plotting");
    }

    /**
     * Set up the Gui with buttons
     */
    public void setupGUI() {
        UI.initialise();
        UI.addButton("Analyse", this::analyseProfile );
        UI.addButton("Quit", UI::quit );
    }

    /**
     * main: construct object and call setup GUI.
     */
    public static void main(String[] args) {
        RoadProfiler rp = new RoadProfiler();
        rp.setupGUI();
    }

}
