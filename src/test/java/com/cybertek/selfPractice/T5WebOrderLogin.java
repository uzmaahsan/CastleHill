package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5WebOrderLogin {

    public static void main(String[] args) throws InterruptedException {
        //TC#5: Basic login authentication
        // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:Expected: Web Orders Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Login page verify");
        }else {
            System.out.println("Verify Failed");
        }
        // 4-Enter username: Tester
        WebElement inputUserName = driver.findElement(By.id("ctl00_MainContent_username"));
        inputUserName.sendKeys("Tester");
        // 5-Enter password: test
        WebElement inputPassword = driver.findElement(By.id("ctl00_MainContent_password"));
        inputPassword.sendKeys("test");
        // 6-Click “Sign In” button
       WebElement button = driver.findElement(By.className("button"));
       button.click();
        // 7-Verify titleequals:
        actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        // Expected: Web Orders
        expectedTitle = "Web Orders";
        if(actualTitle.equalsIgnoreCase(expectedTitle)){
            System.out.println("home page title passed");
        }else{
            System.out.println("home page title Failed");

        }
        Thread.sleep(3000);
    }
}
