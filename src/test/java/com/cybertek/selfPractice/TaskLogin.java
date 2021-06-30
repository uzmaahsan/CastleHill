package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskLogin {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        //1-Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:Expected: Web Orders Login

        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Web Orders Login")) {
        } else {
            System.out.println("FAILED");
        }
        // 4-Enter username: Tester
        driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
        // 5-Enter password: test
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        // 6-Click “Sign In” button
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_login_button\"]")).click();
        // 7-Verify titleequals:Expected: Web Orders
        String actualTitle2 = driver.getTitle();
        if (actualTitle2.equals("Web Orders")) {
            System.out.println("Title equals Verified");
        } else {
            System.out.println("Title is not Verified");

        }
    }
}

