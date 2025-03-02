package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExecutionClass {//Test Class
	@Test
public void demo() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage();
	PageFactory.initElements(driver, l);
	l.setLogin("admin1","manager1");
	Thread.sleep(2000);
	l.setLogin("admin","manager");
	}
}