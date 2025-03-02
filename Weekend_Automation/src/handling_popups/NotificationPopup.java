package handling_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications","--start-maximized","-incognito");
//	opt.addArguments("--disable-notifications");//It will disable the notification popup
//	opt.addArguments("--start-maximized");//It will launch the browser in maximized mode
//	opt.addArguments("-incognito");//It will launch the browser in incognito mode
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.yatra.com/");
	}
}
