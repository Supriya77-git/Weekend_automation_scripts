package demoTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {//POM Class
	@FindBy(id="username")
 WebElement unTbx;
	@FindBy(name="pwd")
private WebElement pwdTbx;//Declaration
	@FindBy(xpath = "//div[text()='Login ']")
private WebElement loginBtn;
	
//public LoginPage(WebDriver driver) {
//PageFactory.initElements(driver, this);//Lazy-Initialization or Lazy-Instantiation
//}
//Business Logic Methods
public void setLogin(String un,String pwd) {
	unTbx.sendKeys(un);
	pwdTbx.sendKeys(pwd);//Utilization
	loginBtn.click();
}
}
