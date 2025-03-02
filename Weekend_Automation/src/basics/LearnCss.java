package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnCss {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
		driver.findElement(By.cssSelector("a[id='d1']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[name='n2']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[class='c 2']")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("a[href='https://www.qspiders.com']")).click();
	}
}