package handling_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
	WebElement mtr = driver.findElement(By.id("mtr"));
	Select s=new Select(mtr); 
	s.selectByIndex(0); 
	s.selectByValue("2"); 
	s.selectByVisibleText("Vada"); 
	s.selectByContainsVisibleText("dose"); 
	s.deselectByIndex(3); 
	s.deselectByValue("1"); 
	s.deselectByVisibleText("Dosa"); 
	s.deSelectByContainsVisibleText("Vada");
	s.deselectAll();
	
}
}
