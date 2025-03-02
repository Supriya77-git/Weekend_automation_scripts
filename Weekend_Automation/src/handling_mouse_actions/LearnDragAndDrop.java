package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class LearnDragAndDrop {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement block2 = driver.findElement(By.xpath("//h1[text()='Block 2']"));
	WebElement block3 = driver.findElement(By.xpath("//h1[text()='Block 3']"));
	WebElement column3 = driver.findElement(By.id("column-3"));
	int blockXaxis = block3.getLocation().getX();
	int xAxis = column3.getLocation().getX();
	System.out.println(xAxis);
	System.out.println(xAxis-blockXaxis);
	Actions a=new Actions(driver);
	a.dragAndDrop(block1, column3).perform();
	Thread.sleep(2000);
	a.clickAndHold(block2).moveToElement(column3).pause(2000).release().build().perform();
	Thread.sleep(2000);
	a.dragAndDropBy(block3, 400, 0).perform();
}
}
