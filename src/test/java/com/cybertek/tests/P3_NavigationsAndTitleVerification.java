package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https:/google.com");
        driver.findElement(By.linkText("Gmail")).click();
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if(actualTitle.contains(expectedInTitle)){
            System.out.println("Title verification Passed! ");
        }else{
            System.out.println("FAILED");
        }
        String expectedTitle = "Practice";
        actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

    }
}
