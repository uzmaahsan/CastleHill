package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
       // TC#4: Google search1-Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
   // 2-Go to: https://google.com
        driver.get("https://google.com");
        // 3-Write “apple” in search box
        // 4-Click google search button
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
        // 5-Verify title:Expected: Title should start with “apple” word
        String actualTitle = driver.getTitle();
        String expectedTitle = "apple";
        System.out.println("actualTitle");
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Verification for this test is PASSED");

        }else{
            System.out.println("Verification for this test is Failed!");
           // System.out.println("expected:" +expectedTitle);
        }
        Thread.sleep(3000);
        driver.close();
    }
}
