package handling_frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingNestedFrame {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/T1.html");
	driver.findElement(By.id("t1")).sendKeys("1");
	//frame(Str id/name) is used to transfer the control to the frame by using id/name present in <iframe>
	driver.switchTo().frame("f1");
	driver.findElement(By.id("t2")).sendKeys("2");
	//frame(int index) is used to transfer the control to the frame to mentioned index
	//The indexing will start from 0 for every frame present in that particular html
	driver.switchTo().frame(0);
	driver.findElement(By.id("t3")).sendKeys("3");
	//parentFrame() is used to transfer the control the previous parent frame
	driver.switchTo().parentFrame();
	driver.findElement(By.id("t2")).sendKeys("4");
	WebElement frameEle = driver.findElement(By.name("f2"));//Storing the address of the frame in the ref var
	//frame(WebEle e) is used to transfer the control to the frame by passing the address of the <iframe> tag
	driver.switchTo().frame(frameEle);
	driver.findElement(By.id("t3")).sendKeys("5");
	//defaultContent() is used to transfer the control to the main parent window
	driver.switchTo().defaultContent();
	driver.findElement(By.id("t1")).sendKeys("6");
}
}
