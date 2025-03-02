package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_suggs {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iPhone");
		Thread.sleep(3000);
		List<WebElement> search = driver.findElements(By.xpath("//form[@action='/search']/ul/li/div/a"));
		
		//HOW TO FIND SUGGESTED ELEMETS ONLY?
		
		int count = search.size();
		System.out.println(count);
		
		for (WebElement ele: search) {
			//String text = ele.getText();
			System.out.println(ele.getText());
		}	
	}

}
