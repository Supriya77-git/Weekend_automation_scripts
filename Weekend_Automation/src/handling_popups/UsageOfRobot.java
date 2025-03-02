package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class UsageOfRobot {
public static void main(String[] args) throws AWTException, InterruptedException {
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_SHIFT);
	r.keyPress(KeyEvent.VK_R);
	r.keyPress(KeyEvent.VK_C);
	r.keyPress(KeyEvent.VK_B);
	r.keyRelease(KeyEvent.VK_SHIFT);
}
}
