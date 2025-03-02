package handling_frames;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Hdfc {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.hdfcbank.com/");
	WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
	Actions a=new Actions(driver);		a.moveToElement(login).perform();
	driver.findElement(By.linkText("NetBanking")).click();
	Set<String> allWid1 = driver.getWindowHandles();
	for (String wid : allWid1) {	driver.switchTo().window(wid);	}
	driver.switchTo().frame(0);
	driver.findElement(By.xpath("//div[@id='nortonimg1']//a[contains(text(),'Know')]")).click();
	Set<String> allWid2 = driver.getWindowHandles();
	for (String wid : allWid2) {
		driver.switchTo().window(wid);
		String actualTitle = driver.getTitle();
		String expectedTitle="Best Safety Measures";
		if(actualTitle.contains(expectedTitle)) {	break;	}	}
	List<WebElement> allLang = driver.findElements(By.xpath("//a[contains(@title,'Secure-Banking-Booklet')]"));
	int count = allLang.size();
	System.out.println(count);
//	ListIterator<WebElement> l = allLang.listIterator(count);//Will start the iteration from mentioned index
//	while(l.hasPrevious()) {	String lang = l.previous().getText();		System.out.println(lang);	}
	for(int i=count-1;i>=0;i--) {
		String lang = allLang.get(i).getText();
		System.out.println(lang);
	}
}
}
