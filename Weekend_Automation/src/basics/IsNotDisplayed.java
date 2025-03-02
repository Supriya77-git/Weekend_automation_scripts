package basics;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IsNotDisplayed {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.myntra.com/men-casual-shoes");Thread.sleep(2000);
	boolean res = driver.findElement(By.xpath("(//H3[text()='Red Tape'])[1]/following-sibling::h4[@class='product-sizes']")).isDisplayed();
	System.out.println(res);
}
}
