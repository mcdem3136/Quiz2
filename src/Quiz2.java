/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import becker.robots.City;
import becker.robots.Direction;
import static becker.robots.Direction.WEST;
import becker.robots.Robot;

/**
 *
 * @author matt mcdermott
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Can use Wall1.txt, Wall2.txt, or Wall3.txt
        City kw = new City("Wall1.txt");
        Robot matt = new Robot(kw, 1, 1, Direction.WEST);

        //program solutions coded under here
        //if the front is clear (i.e. no wall) move
        while (true) {
            if (matt.frontIsClear()) {
                matt.move();
            //if the front isn't clear, turn left, move, try again
            } else {
                matt.turnLeft();
                matt.move();
                matt.turnLeft();
                matt.turnLeft();
                matt.turnLeft();
            //stop if front is clear & facing west
            } if(matt.frontIsClear() && matt.getDirection() == WEST){
                break;
            }

        }
    }

}
