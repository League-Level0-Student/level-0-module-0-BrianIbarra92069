package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot
Robot Pyare = new Robot();

        // 3. Put the robot's pen down
			Pyare.penDown();

        // 6. Make the robot move as fast as possible
			Pyare.setSpeed(900000000);

        // 5. Do everything below here 4 times
			
			for (int i = 8; i < 92; i++) {
				
			

        //         2. Move your robot 200 pixels
					Pyare.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)

					Pyare.turn(90);}
    }
}
