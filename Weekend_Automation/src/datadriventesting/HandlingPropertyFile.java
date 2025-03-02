package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
//We are converting high level data into stream of bytes and storing in FIS variable
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to retrieve the data from property file we create an object of Properties class
//In order to access non-static methods of Properties class we create an Object
	Properties p=new Properties();
//We are loading the binary data in to the Properties object using load(fis)
	p.load(fis);
//To retrieve the data we are using getProperty(String key) which will take the key has parameter
//and returns the value that has been associated along the key
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
