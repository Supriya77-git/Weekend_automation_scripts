package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class HadlingMouseHover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ajio.com/");
		WebElement men = driver.findElement(By.xpath("//a[@title='MEN']"));
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
		WebElement brands = driver.findElement(By.linkText("BRANDS"));
		a.moveToElement(brands).perform();
		driver.findElement(By.linkText("Superdry")).click();
	}
}
