package Frames;

import java.lang.module.FindException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		 WebElement swi = driver.findElement(By.className("dropdown-toggle"));
		Actions b = new Actions(driver);
		b.moveToElement(swi).perform();
		driver.findElement(By.xpath("//a[text() = 'Frames']")).click();
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		WebElement text = driver.findElement(By.xpath("//iframe[@src=\"MultipleFrames.html\"]"));
		driver.switchTo().frame(text);
		driver.switchTo().frame(0);
		driver.findElement(By.tagName("input")).sendKeys("Hello");
	
	}

}
