package handling_popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
	File f=new File("./data/Resume.doc");
	String absPath = f.getAbsolutePath();
//	driver.findElement(By.id("uploadButton")).sendKeys(absPath);
	driver.findElement(By.id("fileInput")).sendKeys(absPath);
}
}
