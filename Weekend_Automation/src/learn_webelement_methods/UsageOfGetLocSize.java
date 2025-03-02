package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetLocSize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement email = driver.findElement(By.id("email"));
		WebElement pwd = driver.findElement(By.id("passContainer"));
		//getSize() is used to get the size of the element
		Dimension d1 = email.getSize();
		//From Dimension to get height and width separately we use getHeight() & getWidth()
		int h1 = d1.getHeight();				int w1 = d1.getWidth();
		int h2 = pwd.getSize().getHeight();		int w2 = pwd.getSize().getWidth();
		//getLocation() is used to get the location of the element
		Point p1 = email.getLocation();
		//From Point to get x Axis and y Axis separately we use getX() & getY()
		int x1 = p1.getX();
		
		//		int y1 = p1.getY();
//getRect() is used to get the size and location of an element.
//It is combination of getSize() &getLocation()
//		Rectangle r1 = email.getRect();
//To check whether element is aligned properly vertically we compare x Axis 
//To check whether element is aligned properly horizontally we compare y Axis
		int x2 = pwd.getLocation().getX();
		if(h1==h2 && w1==w2 && x1==x2) {
			System.out.println("Both textboxes are of same size and alligned properly");
		}else {
			System.out.println("Both textboxes are of different size and not alligned properly");
		}			driver.quit();
	}
}
