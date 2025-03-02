package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LearnRightClick {//WAS to open the link in a New window
public static void main(String[] args) throws AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.instagram.com/");
	WebElement element = driver.findElement(By.xpath("//a[@aria-label='Get it on Google Play']"));
	Actions a=new Actions(driver);
	a.contextClick(element).perform();
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_W);
}
}
