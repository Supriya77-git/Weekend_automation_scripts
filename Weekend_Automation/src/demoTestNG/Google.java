package demoTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Google {
	@Test
public void verifyTitle() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String actualTitle = driver.getTitle();
	String expectedTitle="Googly";
//	if(actualTitle.equals(expectedTitle)) {
//		System.out.println("Pass");
//	}else {
//		System.out.println("Fail");
//		Assert.fail();
//	}
	Assert.assertEquals(actualTitle,expectedTitle);
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualTitle, expectedTitle);
	driver.quit();
	s.assertAll();
}
}
