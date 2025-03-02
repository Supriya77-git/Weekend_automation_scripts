package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	Thread.sleep(1000);//It is a statement used to make the compiler wait for mentioned duration
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
//getPageSource() is used to get the source code of a webpage
		String pgsrc = driver.getPageSource();
		System.out.println(pgsrc);
		driver.manage().window().setSize(new Dimension(1024, 840));
		driver.manage().window().minimize();
		driver.quit();
	}
}