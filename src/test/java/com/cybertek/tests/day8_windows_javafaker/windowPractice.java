package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class windowPractice {
    WebDriver driver;

    //1. Create new test and make set ups
    //2. Go to : https://www.amazon.com
    //3. Copy paste the lines from below into your class
    //4. Create a logic to switch to the tab where Etsy.com is open
    //5. Assert: Title contains “Etsy
    //((JavascriptExecutor) driver).executeScript("window.open('http://google.com/%27,%27_blank%27);%22);
    // ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com/%27,%27_blank%27);%22);
    //((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com/%27,%27_blank%27);%22);
    //These lines will simple open new tabs using something called JavaScript Execut and get those pages.
    // We will learn JavaScriptExecutor later as well.
    @BeforeMethod

    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }
    @Test
    public void multiWindows() throws InterruptedException {
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com','_blank');");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com','_blank');");
        Thread.sleep(1000);
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com','_blank');");
        for (String each : driver.getWindowHandles()) {
            driver.switchTo().window(each);
            System.out.println("Title in current page " + driver.getTitle());
            if(driver.getTitle().contains("Etsy")){
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;

        }

        }



    }
}