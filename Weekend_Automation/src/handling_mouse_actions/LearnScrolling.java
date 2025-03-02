package handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnScrolling {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bbc.com/");
	Actions a=new Actions(driver);
	//scrollByAmount(int x,int y) is used to scroll until the mentioned pixel values 
	a.scrollByAmount(0, 1000).perform();
	WebElement culture = driver.findElement(By.xpath("//h2[text()='Culture']"));
	//scrollToElement(WebEle ele) is used to scroll until the particular element is visible
	a.scrollToElement(culture).perform();
}
}
