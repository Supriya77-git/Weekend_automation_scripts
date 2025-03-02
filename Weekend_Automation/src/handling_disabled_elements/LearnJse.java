package handling_disabled_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnJse {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Disabled.html");
	driver.findElement(By.id("t1")).sendKeys("admin");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("document.getElementById('t2').value='manager'");
	jse.executeScript("document.getElementById('t1').value=''");//To clear the text inside the textbox
//	jse.executeScript("document.getElementById('t1').click()");//To click on a disabled element
}
}
