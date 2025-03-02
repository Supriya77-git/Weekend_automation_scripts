package handling_multiple_elements;

import java.awt.Dimension;

import javax.swing.text.html.FormSubmitEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement button = driver.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		String tagName= button.getTagName();
		System.out.println("Tagname of the button:" + tagName);
		String colour = button.getCssValue("color");
		System.out.println("Colour of the button is :" + colour);
		String text = button.getText();
		System.out.println("TagText of the button is:" + text);
		boolean res = button.isDisplayed();
		if (res) {
			System.out.println("Facebook logo is displayed");
		}else {
			System.out.println("Facebook logo is not displayed");
		}

		boolean res2 = button.isEnabled();
		if (res2) {
			System.out.println("Facebook button is enabled");
		}else {
			System.out.println("Facebook button is not enabled");
		}
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Keerthana"+ Keys.CONTROL+"AC" );
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Keys.CONTROL+"V" );
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		org.openqa.selenium.Dimension d = day.getSize();
		org.openqa.selenium.Dimension m = month.getSize();
		org.openqa.selenium.Dimension y = year.getSize();
		int h1 = d.getHeight(); int w1 = d.getWidth();
		int h2 = m.getHeight(); int w2 = m.getWidth();
		int h3 = y.getHeight(); int w3 = y.getWidth();
		if(h1==h2 && h2==h3 && h2==h3 | w1==w2 && w2==w3 && w3==w1) {
			System.out.println("Dropdowns are of same size");
		}else {
			System.out.println("Dropdowns are of different sizes");
		}
		WebElement r1 = driver.findElement(By.xpath("//label [ text() = 'Female']"));
		WebElement r2 = driver.findElement(By.xpath("//label [ text() = 'Male']"));
		WebElement r3 = driver.findElement(By.xpath("//label [ text() = 'Custom']"));
		int p1 = r1.getLocation().getY() ;
		int p2 = r2.getLocation().getY();
		int p3 = r3.getLocation().getY();
		if(p1==p2 && p2==p3 && p3==p1) {
			System.out.println("Radio buttons are alligned properly");
		}else {
			System.out.println("Radio buttons are not alliged properly");
		}
		boolean res4 = r1.isEnabled() ;
		boolean res5 = r2.isEnabled();
		boolean res6 = r3.isEnabled();
		
		r2.click();
		
	if (res4==true) {
		System.out.println("r1 is selected");
	}
	else if (res5== true) {
		System.out.println("r2 is selected");
	}
	else if (res6== true) {
		System.out.println("r3 i selected");
	}else {
		System.out.println("none of the radio buttons are selected");
	}
	
	//driver.findElement(By.linkText("Sign Up")).submit(); // not within form tag
	//driver.findElement(By.xpath("//button[text()= 'Sign Up']")).submit();
	driver.findElement(By.xpath("//button[text()= 'Sign Up']")).click();
	Thread.sleep(2000);
	driver.quit();
	
		

	}

}
