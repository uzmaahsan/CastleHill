package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yahoo.com");
        String expectedTitle = "Yahoo";
        String actualTitle = driver.getTitle();
        // creating our verification
        if(actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected.verification Passed!");
        }else{
            System.out.println("Tittle is not as expected . Verification failed");

        }
        driver.close();
    }
}
