package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildUsingIterator {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	String pwid = driver.getWindowHandle();
	Set<String> allWid = driver.getWindowHandles();
	Iterator<String> i = allWid.iterator();
	while(i.hasNext()) {//Using iterator
		String wid = i.next();
		driver.switchTo().window(wid);
		if(!pwid.equals(wid)) {
			driver.close();
		}
	}
	for (String wid : allWid) {//using for each
		driver.switchTo().window(wid);
		if(!pwid.equals(wid)) {
			driver.close();
		}
	}
}
}
