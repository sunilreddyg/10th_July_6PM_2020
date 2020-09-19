package robot_window_interface;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class Robot_With_Copy_Paste {

	public static void main(String[] args) throws Exception {
		
		//This program will launch a notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(4000);
		
		
		String text="Selenium automates browsers. That's it What you do with that power is entirely up to you.";
		
		//String Selection
		StringSelection Stext=new StringSelection(text);
		//Get System Default Clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Attach selected string to runtime clipboard
		clipboard.setContents(Stext, Stext);
		
	
		// Creating object creation for robot interface
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Because control is downkeys we must release after pressing it
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

	}

}
