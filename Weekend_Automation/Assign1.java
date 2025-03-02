package Assignments;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assign1 {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications","--start-maximized");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://pib.gov.in/indexd.aspx?reg=3&lang=1");//trigger the url
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alt  = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		WebElement edu = driver.findElement(By.linkText("Ministry of Education"));
		Actions b = new Actions(driver);//using scrollToElement
		b.moveToElement(edu).perform();
		edu.click();
		Alert d = driver.switchTo().alert();
		d.accept();//to handle confirmation popup -if click on ok button
		
		Set<String> allwid = driver.getWindowHandles();  //to transfer the control to child tab
		for(String wid: allwid) {
			driver.switchTo().window(wid);
			Thread.sleep(2000);
		}
		
		WebElement dept = driver.findElement(By.xpath("//a[@ title='Departments']"));//in order to mouse over the element department find locators and store it in variable of type webelement
		Actions a = new Actions(driver);
		a.moveToElement(dept).perform();
		WebElement highedu=driver.findElement(By.linkText("Higher Education"));//from dept->mouseHover to Higher education after that use an action called click();
		highedu.click();
		String actualTitle = driver.getTitle();
		String expectedTitle="Higher Education";
		if(actualTitle.contains(expectedTitle))
		{
			System.out.println("Titles are same");
		}
		else
		{
			System.out.println("Titles are not same");
		}
		}
		
		

	}


