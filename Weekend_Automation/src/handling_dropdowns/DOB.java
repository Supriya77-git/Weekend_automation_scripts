package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DOB {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://fb.com");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement day = driver.findElement(By.id("day"));
	Select s1=new Select(day);
	s1.selectByIndex(4);
	WebElement month = driver.findElement(By.id("month"));
	Select s2=new Select(month);
	s2.selectByValue("11");
	WebElement year = driver.findElement(By.id("year"));
	Select s3=new Select(year);
	s3.selectByVisibleText("1988");
}
}
