package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
		//clear() is used to clear the text present inside textBox
		driver.findElement(By.id("email")).clear();
		driver.navigate().to("https://fb.com");
		//click() will scroll until the element is visible and it will click on the elements
		//Using this method we can click on links, buttons, checkbox, dropdowns, radio etc
		driver.findElement(By.linkText("Sign Up")).click();
	}
}
