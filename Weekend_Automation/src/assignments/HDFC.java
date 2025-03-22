package assignments;

import java.time.Duration;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class HDFC {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hdfcbank.com/");
		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		Actions a=new Actions(driver);
		a.moveToElement(login).perform();
		driver.findElement(By.linkText("NetBanking")).click();
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		allWid=driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
			if(driver.getTitle().contains("Best Safety Measures")) {				break;			}		}
		List<WebElement> allLang = driver.findElements(By.xpath("//a[contains(@title,'Secure-Banking-Booklet')]"));
		ListIterator<WebElement> li = allLang.listIterator(allLang.size());
		while(li.hasPrevious()) {
			WebElement ele = li.previous();
			String lang = ele.getText();
			System.out.println(lang);
		}
	}
}
