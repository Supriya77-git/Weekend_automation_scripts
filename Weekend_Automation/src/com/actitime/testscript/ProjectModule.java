package com.actitime.testscript;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule extends BaseClass{
	@Test(groups="SmokeTest")
	public void createProject() {
		driver.findElement(By.linkText("REPORTS")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {		}
		Reporter.log("createProject",true);
	}
//		@Test(groups = "RegressionTest")
//	public void deleteProject() {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {		}
//		Reporter.log("deleteProject",true);
//	}
//		@Test(groups = "RegressionTest")
//	public void modifyProject() {
//			try {
//				Thread.sleep(3000);
//			} catch (InterruptedException e) {		}
//		Reporter.log("modifyProject",true);
//	}
}
