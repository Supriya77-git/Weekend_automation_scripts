/*
 * 
Automate the following scenario:

1) Open the browser and trigger FB application, print the tagName, color, tagText and type of FB login button and check
whether it's displayed or not.

2) Click on Create new account and enter the first name and copy paste into surname and clear the first name using clear() method.
Check whether all the 3 drop downs(DOB) are of same size and all the 3 radio buttons(Gender) are aligned properly and check whether
all the 3 are selected or not and click on Sign up button using submit() method.

*/

package assignment;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_CreateNewAccount_DropDowns_RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement loginButton = driver.findElement(By.tagName("button"));
		String tagName = loginButton.getTagName();
		String color = loginButton.getCssValue("color");
		String text = loginButton.getText();
		@Nullable
		String type = loginButton.getAttribute("type");
		System.out.println("tagName of Login button: "+tagName);
		System.out.println("color of Login button: "+color);
		System.out.println("tagText of Login button: "+text);
		System.out.println("type of Login button: "+type);
		
		System.out.println("----------------------------------------------------------------");
		if(loginButton.isEnabled()==true)//if(loginButton.isEnabled)
		{
			System.out.println("Login button is enabled");
		}
		else
		{
			System.out.println("Login button is disabled");
		}
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		
		driver.findElement(By.linkText("Create new account")).click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Virat@18"+Keys.CONTROL+"AC");
		Thread.sleep(5000);
		
		driver.findElement(By.name("lastname")).sendKeys(Keys.CONTROL+"V");
		Thread.sleep(5000);
		
		firstName.clear();
		Thread.sleep(5000);
		
		//Finding the Day drop down
		WebElement day = driver.findElement(By.id("day"));
		Dimension dropDown1 = day.getSize();
		int h1 = dropDown1.getHeight();
		int w1 = dropDown1.getWidth();
		System.out.println("Day dropdown height: "+h1);
		System.out.println("Day dropdown width: "+w1);
		System.out.println("----------------------------------------------------------------");
		
		//Finding the Month drop down
		WebElement month = driver.findElement(By.id("month"));
		Dimension dropDown2 = month.getSize();
		int h2 = dropDown2.getHeight();
		int w2 = dropDown2.getWidth();
		System.out.println("Month dropdown height: "+h2);
		System.out.println("Month dropdown width: "+w2);
		System.out.println("----------------------------------------------------------------");
		
		//Finding the Year drop down
		WebElement year = driver.findElement(By.id("year"));
		Dimension dropDown3 = year.getSize();
		int h3 = dropDown3.getHeight();
		int w3 = dropDown3.getWidth();
		System.out.println("Year dropdown height: "+h3);
		System.out.println("Year dropdown width: "+w3);
		System.out.println("----------------------------------------------------------------");
		
		//Comparing the Day, Month and Year drop downs
		if ((h1==h2) && (h1==h3) && (h2==h3))
		{
			System.out.println("Day, Month and Year drop downs are of same size");
		}
		else
		{
			System.out.println("Day, Month and Year drop downs are of different size");
		}
		
		System.out.println("----------------------------------------------------------------");
		
		//Finding the Female radio button:
		List<WebElement> allRadioButtons = driver.findElements(By.xpath("//input[@type='radio']"));
		int radioButtonCount = allRadioButtons.size();
		System.out.println("Total Radio Buttons: "+radioButtonCount);
		
		WebElement female = allRadioButtons.get(0);
		WebElement male = allRadioButtons.get(1);
		WebElement other = allRadioButtons.get(2);
		
		Point rbutton1 = female.getLocation();
		Point rbutton2 = male.getLocation();
		Point rbutton3 = other.getLocation();
		
		int y1 = rbutton1.getY();
		int y2 = rbutton2.getY();
		int y3 = rbutton3.getY();
		
		System.out.println("Female Radion Button Y axis: "+y1);
		System.out.println("Male Radio Button Y axis: "+y2);
		System.out.println("Other Radion Button Y axis: "+y3);
		
		if ((y1==y2) && (y1==y3) && (y2==y3))
		{
			System.out.println("Female, Male and Other Radio buttons are aligned properly");
		}
		else
		{
			System.out.println("Female, Male and Other Radio buttons are not aligned properly");
		}
				
		System.out.println("----------------------------------------------------------------");
		
		if (female.isSelected())
		{
			System.out.println("Female dropdown is selected");
		}
		else
		{
			System.out.println("Female dropdown is not selected");
		}
		
		if (male.isSelected())
		{
			System.out.println("Male dropdown is selected");
		}
		else
		{
			System.out.println("Male dropdown is not selected");
		}
		if (other.isSelected())
		{
			System.out.println("Other dropdown is selected");
		}
		else
		{
			System.out.println("Other dropdown is not selected");
		}
		
		System.out.println("----------------------------------------------------------------");
		
		driver.findElement(By.tagName("button")).submit();
		
		Thread.sleep(15000);
		
		
		driver.quit();
	}

}
