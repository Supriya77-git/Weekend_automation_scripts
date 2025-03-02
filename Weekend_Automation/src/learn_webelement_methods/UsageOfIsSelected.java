package learn_webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfIsSelected {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement radio = driver.findElement(By.xpath("//label[text()='Male']/input"));
		radio.click();
	//isSelected() is used to check whether the element(radio button/checkBox) is selected or not
		boolean res = radio.isSelected();
		if(!res) {
			System.out.println("The radio button is not selected");
		}else {
			System.out.println("The radio button is selected");
		}
	}
}
