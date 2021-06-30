package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #2: Facebook incorrect login title verification
        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2.Go to https://www.facebook.com
        driver.manage().window().maximize();
        driver.get(" https://www.facebook.com");
        // 3.Enter incorrect username
      driver.findElement(By.name("email")).sendKeys("username@gmail.com");
        // 4.Enter incorrect password
        driver.findElement(By.name("pass")).sendKeys("password" + Keys.ENTER);
        Thread.sleep(5000);
        // 5.Verify title changed to: Expected: “Log into Facebook”
        String expectedTitle = "Log into Facebook";

        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("Title Verification PASSED");
        }else{
            System.out.println("Title Verification FAILED");
        }
    }
}
