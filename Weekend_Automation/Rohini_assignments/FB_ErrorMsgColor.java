// Write a script to print the color of an error message in Facebook after clicking on the 'Login' button without entering the 
//credentials.

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_ErrorMsgColor {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='https://facebook.com/login/identify/']/.."));
		Thread.sleep(2000);
		
		String errorColor = ele.getCssValue("color");
		System.out.println(errorColor);
		System.out.println(ele.getText());
		driver.quit();
	}

}
