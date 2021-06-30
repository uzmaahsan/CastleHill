package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {
        //1- Etst title Verification
        WebDriverManager.chromedriver().setup();
        //2- open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //-Go to https://www.etsy.com/
        driver.get("https://www.etsy.com/ ");
        driver.findElement(By.id("global-enhancements-search-query")).sendKeys("Wooden Spoon" + Keys.ENTER);
        //- search for wooden spoon
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTitle = driver.getTitle();
        //Verify title
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Etsy title verification PASSED!");
            //Expected "wooden spoon | Etsy"
        } else {
            System.out.println("Etsy title verification FAILED!!!");

        }
    }
}
