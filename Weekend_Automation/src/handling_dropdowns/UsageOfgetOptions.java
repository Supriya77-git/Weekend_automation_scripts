package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfgetOptions {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/Hotel.html");
//	driver.get("https://fb.com");
//	driver.findElement(By.linkText("Create new account")).click();
	WebElement dropDown = driver.findElement(By.id("slv"));
	Select s=new Select(dropDown); 
	//getFirstSelectedOption() is used get the first selected option in the listbox
	//If none of the options are selected it will throw NSEE
	WebElement ele = s.getFirstSelectedOption();
	System.out.println(ele.getText()+"-->first selected option");
	//getAllSelectedOptions() is used get all the selected options in the listbox
	//If none of the options are selected it will return Empty List
	List<WebElement> allSelOpt = s.getAllSelectedOptions();
	for(int i=0;i<allSelOpt.size();i++) {
		String text = allSelOpt.get(i).getText();
		System.out.println(text+"-->all selected options");	}
	//getOptions() is used to get all the options present in the listbox
	List<WebElement> allOptions = s.getOptions();
	for (WebElement element : allOptions) {//To print all options in the dropdown
		System.out.println(element.getText());	}
	//isMultiple() is used to check whether the dropDown is multi-select or not	
	boolean res = s.isMultiple();
	if(res==true) {		System.out.println("It is a multi select dropdown");	}
	else {		System.out.println("It is a single select dropdown");	}
	//getWrappedElement() is used to wrap all the options present in the listbox and convert into single element
    WebElement element = s.getWrappedElement();
    System.out.println(element.getText());
	driver.quit();
}
}
