package handling_multiple_elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tool_tip {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver. manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Privacy Policy']"));
		String text = ele.getAttribute("title");
		System.out.println(text);
		driver. quit();
		
	}

	}
