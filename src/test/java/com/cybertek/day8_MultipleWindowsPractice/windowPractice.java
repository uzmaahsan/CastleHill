package com.cybertek.day8_MultipleWindowsPractice;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class windowPractice {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");
    }

    @Test
    public void multiple_window_test() throws InterruptedException {
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
            Thread.sleep(1000);
            ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

            for (String each : driver.getWindowHandles()) {
                driver.switchTo().window(each);
                System.out.println("Title in current page: " + driver.getTitle());
//            if (driver.getCurrentUrl().contains("etsy.com")) {
//                System.out.println("Title = " + driver.getTitle());
//                break;
//            }
                if (driver.getTitle().contains("Etsy")){
                    Assert.assertTrue(driver.getTitle().contains("Etsy"));
                    break;
                }
            }
        }
    }


