package handling_popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddToCart {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.ajio.com/");
	driver.findElement(By.name("searchVal")).sendKeys("Mens Shoes"+Keys.ENTER);
	driver.findElement(By.className("preview")).click();
	Set<String> allWid = driver.getWindowHandles();
	for (String wid : allWid) {
		driver.switchTo().window(wid);
	}	
	driver.findElement(By.xpath("//span[.='8']/..")).click();
	driver.findElement(By.className("pdp-addtocart-button")).click();
}
}
