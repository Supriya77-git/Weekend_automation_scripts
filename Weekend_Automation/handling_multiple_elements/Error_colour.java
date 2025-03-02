package handling_multiple_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_colour {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login.php/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"loginbutton\"]")).click();
		String error = driver.findElement(By.xpath("//div[contains(text(), 'The email address')]")).getCssValue("color");
		System.out.println("Colour of the error :" +error);
		driver.quit();
	

	}

}
