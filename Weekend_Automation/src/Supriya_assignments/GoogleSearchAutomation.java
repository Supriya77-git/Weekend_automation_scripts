package Supriya_assignments;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class GoogleSearchAutomation {
    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://www.google.com");
            Thread.sleep(7000);
            driver.switchTo().activeElement();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.activeElement.value = 'JAVA';");
       //   Actions a = new Actions(driver);
       //   a.sendKeys(Keys.ENTER).perform();
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER); 
            Thread.sleep(7000);
            driver.quit();
        }
    }

