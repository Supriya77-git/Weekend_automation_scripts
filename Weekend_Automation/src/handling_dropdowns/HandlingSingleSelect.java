package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://fb.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
//selectByIndex(int index)is used to select an option based on the specified index starting from 0 
		s.selectByIndex(8);
//selectByValue(String value) is used to select option based on specified value present in the 
//option tag of the required element
		s.selectByValue("12");
//selectByVisibleText(String text) is used to select the option based on the tagText of option tag
		s.selectByVisibleText("Jul");
//		s.deselectByIndex(6);//We cannot deselect single select dropdowns
	}
}
