package handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		Alert a = driver.switchTo().alert();
		String alertText = a.getText();
		a.accept();
		System.out.println(alertText);
	}
}
