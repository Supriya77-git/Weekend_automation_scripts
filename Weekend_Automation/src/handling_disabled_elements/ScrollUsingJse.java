package handling_disabled_elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUsingJse {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://doodles.google/about/");
	JavascriptExecutor jse=(JavascriptExecutor) driver;
	jse.executeScript("window.scrollTo(0,3000)");//It will scroll for 3000 pixels
	jse.executeScript("window.scrollBy(0,2000)");//It will scroll from 3000 pixels to 5000pixels
}
}
