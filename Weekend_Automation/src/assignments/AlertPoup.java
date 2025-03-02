package assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPoup {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui/alert?sublist=0");
		d.findElement(By.id("buttonAlert2")).click();
		Alert a = d.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.accept();
		d.navigate().to("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		d.findElement(By.id("fileInput")).sendKeys("C:\\Users\\QSP\\eclipse-workspace1\\seleniumnew\\Weekend_Automation\\data\\Resume.doc");
	}
}
