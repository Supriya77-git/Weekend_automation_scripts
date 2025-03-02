package Supriya_assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchEmailTextboxText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
        String emailValue = driver.findElement(By.id("email")).getAttribute("value");
        System.out.println("Email value in the text box: " + emailValue);
        driver.quit();
    }
}
