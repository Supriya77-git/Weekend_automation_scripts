// Write a script to print all the URLs present in Google after searching for Qspiders.
package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Url_Qspiders {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Qspiders"+Keys.ENTER);
		Thread.sleep(7000);
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		System.out.println(count);
		for (WebElement ele : allLinks)
		{
			String url = ele.getAttribute("href");
			System.out.println(url);
		}
		
		driver.quit();
	}

}
