package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");Thread.sleep(2000);
//It is used to enter the text into the textbox
//Using keys class we can click on any keys in the keyboardx
	driver.findElement(By.id("email")).sendKeys("Virat@18"+Keys.CONTROL+"AC");Thread.sleep(2000);
	driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
	driver.findElement(By.linkText("Sign Up")).submit();//UnsupportedOperationException
}
}
