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
        
        //(int)(Math.random() * (max - min) + min)
        
        // create three animals
        // randomly choose number between START_LEFT & START_RIGHT
        // animal 1
        Animal animal1 = new Animal("turtle", "Boris", (START_LEFT + (START_RIGHT - START_LEFT) * Math.random()), 100);
        
        // randomly choose number between START_LEFT & START_RIGHT
        // animal 2
        Animal animal2 = new Animal("bird", "Patrica", (START_LEFT + (START_RIGHT - START_LEFT) * Math.random()), 500);
        
        // randomly choose number between START_LEFT & START_RIGHT
        // animal 3
        Animal animal3 = new Animal("dinosaur", "Dave", (START_LEFT + (START_RIGHT - START_LEFT) * Math.random()), 300);
        
        routine(animal1);
        routine(animal2);
        routine(animal3);
        
        // get leftmost animal
        Animal leftAnimal = closestToLeft(animal1, animal2, animal3);
        // get rightmost animal
        Animal rightAnimal = closestToRight(animal1, animal2, animal3);
        
        // while the animals haven't crossed the line
        while(leftAnimal.getX() > EXIT_LEFT && rightAnimal.getX() < EXIT_RIGHT) {
            // leftmost animal move left
            leftAnimal.goLeft();
            // rightmost animal move right
            rightAnimal.goRight();
        }
        
        // have the winner shout
        // if the animal has the greater distance between the exit (after crossing) and animal's x position it wins
        if(rightAnimal.getX() - EXIT_RIGHT > EXIT_LEFT - leftAnimal.getX()){
            rightAnimal.speak("I win");
        } else if (rightAnimal.getX() - EXIT_RIGHT < EXIT_LEFT - leftAnimal.getX()){
            leftAnimal.speak("I win");
        }
    }

    /** return the animal closest to the left */
    public Animal closestToLeft (Animal a1, Animal a2, Animal a3){
        // get the animals lefts
        double a1Left = a1.getX();
        double a2Left = a2.getX();
        double a3Left = a3.getX();
        
        // compare the animals lefts
        if(a1Left < a2Left && a1Left < a3Left){
            return a1;
        } else if (a2Left < a1Left && a2Left < a3Left){
            return a2;
        } else {
            return a3;
        }
    }
    
    /** return the animal closest to the right */
    public Animal closestToRight (Animal a1, Animal a2, Animal a3){
        /*# YOUR CODE HERE */
        // get the animals rights
        double a1Right = a1.getX();
        double a2Right = a2.getX();
        double a3Right = a3.getX();
        
        // compare the animals rights
        if(a1Right > a2Right && a1Right > a3Right){
            return a1;
        } else if (a2Right > a1Right && a2Right > a3Right){
            return a2;
        } else {
            return a3;
        }
    }

    /** Make animal perform a routine*/
    public void routine(Animal animal){
        animal.introduce("hi hi hi");
        animal.goLeft();
        animal.goLeft();
        animal.jump(50);
        animal.speak("yippe!");
        animal.goRight();
        animal.goRight();
        animal.goRight();
        animal.jump(100);
        animal.shout("i'm done");
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

