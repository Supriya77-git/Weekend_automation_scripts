package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginToActitime {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		for(int i=0;i<1000;i++) {
			try {
				driver.findElement(By.name("username")).sendKeys("Admin");
				break;
			}catch(NoSuchElementException e) {
				System.out.println(i);
			}
		}
	}
}