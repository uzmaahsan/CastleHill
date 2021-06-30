package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class F1_TitleVerification {
    public static void main(String[] args) throws InterruptedException {
        //TC #1: Facebook title verification
        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to https://www.facebook.com
        driver.get(" https://www.facebook.com");
        // 3.Verify title: Expected: “Facebook -Log In or Sign Up”
        String actualTitle = driver.getTitle();
        String expectedTitle = "Facebook - Log In or Sign Up";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Verification PAsses");
        }else{
            System.out.println("Verification FAILED");
            Thread.sleep(3000);
            driver.close();
        }

    }
}
