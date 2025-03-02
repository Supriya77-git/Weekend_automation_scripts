// Write a script to search iPhone 14 Pro Max in Flipkart and print all the mobile name along with mobile price.

package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Flipkart_Iphone14promaxName_Price {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(7000);
		driver.findElement(By.name("q")).sendKeys("iPhone 14 Pro Max"+Keys.ENTER);
		Thread.sleep(7000);
			
		List<WebElement> allEleName = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]"));
		int countName = allEleName.size();
		System.out.println("Total iPhone 14 Pro Max Name elements: "+countName);

		
		List<WebElement> allElePrice = driver.findElements(By.xpath("//div[contains(text(),'iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div"));
		int countPrice = allElePrice.size();
		System.out.println("Total iPhone 14 Pro Max Price elements: "+countPrice);

		
		if(countName == countPrice)
		{
			for (int i=0; i<countName && i<countPrice; i++)
			{
				WebElement ele3 = allEleName.get(i);
				WebElement ele4 = allElePrice.get(i);
				String name = ele3.getText();
				String price = ele4.getText();
				System.out.println(name+" = "+price);
			}
		}
		driver.quit();
	}

}
