package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui");
		driver.findElement(By.xpath("//section[text() = 'Web Elements']")).click();
		driver.findElement(By.xpath("//section[text() = 'Frames']")).click();
		driver.findElement(By.xpath("//section[text() = 'iframes']")).click();
		driver.findElement(By.xpath("//a[text() = 'Nested iframe']")).click();
		driver.switchTo().frame(0);
		WebElement un = driver.findElement(By.xpath("//p[text()= 'Admin@gmail.com']"));
		String username = un.getText();
		
		WebElement pass = driver.findElement(By.xpath("//p[text()= 'Admin@1234']"));
		String password = pass.getText();
		
		WebElement conf = driver.findElement(By.xpath("///p[text()= 'Default Confirm Password']"));
		String Defcon = conf.getText();
		
		driver.switchTo().frame(0);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirm-password")).sendKeys(Defcon);
		
	
	
		

		

		
		
	
		
		
	}

}
