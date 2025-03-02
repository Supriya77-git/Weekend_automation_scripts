package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfIsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//isDisplayed() is used to check whether the element is displayed or not
	boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
	if(res) {
		System.out.println("Pass: Facebook logo is displayed in the webpage");
	}else {
		System.out.println("Fail: Facebook logo is not displayed in the webpage");
	}
	driver.quit();
}
}
