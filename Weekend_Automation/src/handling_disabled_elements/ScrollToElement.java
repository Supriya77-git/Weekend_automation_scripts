package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ScrollToElement {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://doodles.google/about/");
	WebElement ele = driver.findElement(By.xpath("//span[text()='2021']"));
	int yAxis = ele.getLocation().getY();
	JavascriptExecutor jse=(JavascriptExecutor) driver;
//This will scroll until the element is present in the top of the webpage
	jse.executeScript("window.scrollTo(0,"+yAxis+")");
	Actions a=new Actions(driver);
//This will scroll until the element is displayed in the webpage(Bottom of the screen)
	a.scrollToElement(ele).perform();
}
}
