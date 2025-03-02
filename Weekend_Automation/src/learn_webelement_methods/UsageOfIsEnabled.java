package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
//	driver.get("https://www.instagram.com/");Thread.sleep(2000);
	driver.get("https://www.facebook.com/");
	boolean res = driver.findElement(By.name("login")).isEnabled();
//isEnabled() is used to check whether element is enabled or disabled
//If disabled we cannot perform any action on the element
//	boolean res = driver.findElement(By.tagName("button")).isEnabled();
	if(res==true) {
		System.out.println("Login button is enabled");
	}else {
		System.out.println("Login button is disabled");
	}
	driver.quit();
}
}
