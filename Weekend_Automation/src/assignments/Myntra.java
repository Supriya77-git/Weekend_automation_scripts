package assignments;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
public static void main(String[] args) throws InterruptedException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the Section");
	String section = s.nextLine();
	System.out.println("Enter the Item");
	String item = s.nextLine();
	System.out.println("Enter the Size");
	String size = s.nextLine();
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://myntra.com");
	WebElement navEle = driver.findElement(By.xpath("//a[@data-type='navElements' and text()='"+section+"']"));
	Actions a=new Actions(driver);
	a.moveToElement(navEle).perform();
	section=section.toLowerCase();
	driver.findElement(By.xpath("//div[@data-group='"+section+"']//a[text()='"+item+"']")).click();
	driver.findElement(By.className("product-base")).click();
	Set<String> allWid = driver.getWindowHandles();
	for (String wid : allWid) {
		driver.switchTo().window(wid);
	}
	driver.findElement(By.xpath("//p[@class='size-buttons-unified-size' and text()='"+size+"']")).click();
	driver.findElement(By.xpath("//div[text()='ADD TO BAG']")).click();Thread.sleep(2000);
	String text = driver.findElement(By.className("notify-thumbnail-text")).getText();
	System.out.println(text);
}
}
