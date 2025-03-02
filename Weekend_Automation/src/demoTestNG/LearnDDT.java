package demoTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnDDT {

//	@Parameters({"url","un","pwd"})
	@Test(dataProvider = "getData",dataProviderClass = LearnDataProvider.class)
public void demo(String un,String pwd) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.quit();
	}
}
