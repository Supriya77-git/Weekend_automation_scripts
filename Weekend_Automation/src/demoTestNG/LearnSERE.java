package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSERE {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
	WebElement ele = driver.findElement(By.tagName("a"));
	driver.navigate().refresh();
	ele.click();Thread.sleep(1000);
//	driver.navigate().back();
//	ele.click();
	
}
}
