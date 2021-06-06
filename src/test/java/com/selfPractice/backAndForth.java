package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class backAndForth {
    public static void main(String[] args) throws InterruptedException {
      //  TC #3: Back and forth navigation
        WebDriverManager.chromedriver().setup();
        // 1- Open a chrome browser
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // -2 Go to: https://google.com
        driver.get("https://google.com");
        // 3-Click to Gmail from top right
        driver.findElement(By.linkText("Gmail")).click();
        // .4-Verify title contains:
        // Expected Gmail:
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(expectedTitle.contains(expectedTitle)) {
            System.out.println("Title Verification: PASSED");
        }else{
            System.out.println("Title Verification: FAILED");
        }
        // 5-Go back to Google by using the .
        // back();
        driver.navigate().back();
        actualTitle= driver.getTitle();
        expectedTitle ="Google";
        if(expectedTitle.contains(expectedTitle)) {
            System.out.println("Title Verification: PASSED");
        }else{
            System.out.println("Title Verification: FAILED");
        }

        // 6-Verify title equals:Expected: Google
        Thread.sleep(3000);
        driver.close();
    }
}
