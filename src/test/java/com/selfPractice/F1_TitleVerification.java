package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    //TC #1: Facebook title verification1.
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        // Open Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2.Go to https://www.facebook.com
        driver.manage().window().maximize();
        driver.get(" https://www.facebook.com");
        // 3.Verify title: Expected: “Facebook -Log In or Sign Up”
        String expectedTitle = "Facebook - Log In or Sign Up";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title verification Failed!!");
        }
    }
}
