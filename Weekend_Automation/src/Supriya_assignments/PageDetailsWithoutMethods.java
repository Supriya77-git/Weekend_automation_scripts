package Supriya_assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;

public class PageDetailsWithoutMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        String title = (String) jse.executeScript("return document.title;");
        String currentUrl = (String) jse.executeScript("return window.location.href;");
        System.out.println("Page Title: " + title);
        System.out.println("Current URL: " + currentUrl);
        driver.quit();
    }
}  