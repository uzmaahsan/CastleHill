package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class P6_cyberTekTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       // TC #6: Practice Cybertek – Class locator practice
        //1. Open Chrome browser
        //2. Go to http://practice.cybertekschool.com/inputs
        driver.get("http://practice.cybertekschool.com/inputs");
        sleep(3000);
        driver.findElement(By.name("nav-Link")).click();
      //  3. Click “Home” button
       // 4. Verify title as expected:

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();
        if(actualTitle .equals(expectedTitle)){
            System.out.println("Title Verification PASSED!");
        }else{
            System.out.println("Title Verification FAILED!");
        }
    }

}
