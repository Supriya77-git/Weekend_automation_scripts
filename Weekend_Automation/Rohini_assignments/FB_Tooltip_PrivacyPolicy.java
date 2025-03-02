// Write a script to print tooltip text (information text) of PrivacyPolicy in Facebook.

package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Tooltip_PrivacyPolicy {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		Thread.sleep(5000);
		String toolTip = ele.getAttribute("title");
		System.out.println(toolTip);
		
		driver.quit();
	}

}
