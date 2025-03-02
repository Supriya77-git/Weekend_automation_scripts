package demoTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA {//-->Test Class
	@Test
public void demo() {//-->Test Method
	Reporter.log("Hello World");//It will print the message on the report
//	Reporter.log("Hello World",false);
}
	@Test
public void demoA() {
	Reporter.log("Hi World",true);//It will print the message on both console and report
}
	@Test
public void demoB(){
	System.out.println("Bye World");//It will print the message on the console
}
}
