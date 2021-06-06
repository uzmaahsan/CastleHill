package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonTask {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //openChromebrowser
        WebDriver driver = new ChromeDriver();
        // Go to http://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");
        //Click "Home" button
        driver.findElement(By.className("nav-link")).click();
        //Verify title as expected
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Practice";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Verification Passed");
        } else {
            System.out.println("Failed");

        }
    }
}