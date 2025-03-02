package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOB {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));Thread.sleep(2000);
	Select s1=new Select(day);
	s1.selectByIndex(6);
	WebElement month = driver.findElement(By.id("month"));Thread.sleep(2000);
	Select s2=new Select(month);
	s2.selectByValue("7");
	WebElement year = driver.findElement(By.id("year"));Thread.sleep(2000);
	Select s3=new Select(year);
	s3.selectByVisibleText("1981");
	List<WebElement> allOpt = s2.getOptions();
	for(WebElement ele:allOpt) {
		System.out.println(ele.getText());
	}
}
}
