package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void createCustomer() {
		driver.findElement(By.linkText("TASKS")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {		}
		Reporter.log("createCustomer",true);
	}
//	@Test(groups = "RegressionTest")
//public void deleteCustomer() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {		}
//	Reporter.log("deleteCustomer",true);
//}
//	@Test(groups = "RegressionTest")
//public void modifyCustomer() {
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {		}
//	Reporter.log("modifyCustomer",true);
//}
	
	
}
