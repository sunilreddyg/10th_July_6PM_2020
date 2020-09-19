package robot_window_interface;

import java.awt.Robot;
import java.awt.event.InputEvent;

public class Mouse_Syntax_Robot {

	public static void main(String[] args) throws Exception {
		
		//Create object for Robot framework
		Robot robot=new Robot();
		robot.setAutoDelay(1000);
		
		//Move cursor to required location
		robot.mouseMove(100, 200);
		
		//Mouse click
		robot.mousePress(InputEvent.BUTTON1_MASK); //left click
		robot.mousePress(InputEvent.BUTTON2_MASK); //middle click
		robot.mousePress(InputEvent.BUTTON3_MASK); //right click
		
		//Release mouse
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		
		//Scroll
		robot.mouseWheel(100);

	}

}
