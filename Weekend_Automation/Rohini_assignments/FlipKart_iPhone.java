// Write a script to print auto suggestions in Flipkart after searching for iPhone.

package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_iPhone {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iphone");
		Thread.sleep(7000);
		List<WebElement> allSuggs = driver.findElements(By.xpath("//span[contains(text(),'iphone')]/.."));
		int count = allSuggs.size();
		System.out.println(count);
	for (WebElement ele : allSuggs) {
	String text=ele.getText();
	System.out.println(text);
			
	}

	driver.quit();

	}

}
