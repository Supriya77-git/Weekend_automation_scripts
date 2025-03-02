package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class UserModule extends BaseClass{
	
	@Test(groups = "SmokeTest")
	public void createUser() {
		driver.findElement(By.linkText("USERS")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {		}
		Reporter.log("createUser",true);
	}
//		@Test(groups = "RegressionTest")
//	public void deleteUser() {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {		}
//		Reporter.log("deleteUser",true);
//	}
//		@Test(groups = "RegressionTest")
//	public void modifyUser() {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {		}
//		Reporter.log("modifyUser",true);
//	}
}
