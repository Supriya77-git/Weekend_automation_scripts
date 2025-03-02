package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iphone_14_pro_max {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("iPhone 14 pro max"+Keys.ENTER);
		List<WebElement> Mname = driver.findElements(By.xpath("//div[contains (text(), 'Apple iPhone 14 Pro Max')]"));
		List<WebElement> Mprize = driver.findElements(By.xpath("//div[contains (text(), 'Apple iPhone 14 Pro Max')]/../../div[2]/div[1]/div[1]/div"));
		
		
		for(int i= 0; i<Mname.size(); i++) {
			System.out.println("Brand:" + Mname.get(i).getText() + "Price:" + Mprize.get(i).getText() );

		}
			
	}

}
