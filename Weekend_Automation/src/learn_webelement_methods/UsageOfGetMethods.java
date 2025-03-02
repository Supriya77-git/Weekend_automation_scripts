package learn_webelement_methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethods {
public static void main(String[] args) {
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("https://fb.com");
WebElement button=d.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//getTagName() is used to get the tagName of the element
String tagName = button.getTagName();
//getText() is used to fetch the tag text/visible text of an element. 
//If there is no tag text for the element it will return empty space
String text = button.getText();
//getAttribute(String attName) is used to get the attribute value of mentioned attribute name
//If there is no att Name it will return null
String url = button.getAttribute("href");
//getCssValue(String PropName) is used to get the property value of mentioned property name
//If there is no property Name it will return null
String size = button.getCssValue("font-size");
System.out.println("Tagname of the button: "+tagName);
System.out.println("Tagtext of the button: "+text);
System.out.println("Url of the button: "+url);
System.out.println("Size of the button text: "+size);
d.quit();
}
}
