package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myapractice {
    public static void main(String[] args) {
        //C#5: Basic login authentication
        WebDriverManager.chromedriver().setup();

        // 1-Open a chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:Expected: Web Orders Login
       String Exp_Title = "Web Orders Login";
       String Act_Title= driver.getTitle();
              if(Exp_Title.equals(Act_Title)){
                  System.out.println("Web Orders Login Verified");
              }else{
                  System.out.println("Web Orders Login Verification Failed");
              }
        // 4-Enter username: Tester
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_username\"]")).sendKeys("Tester");
        // 5-Enter password: test
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_password\"]")).sendKeys("test");
        // 6-Click “Sign In” button
        driver.findElement(By.className("button")).click();

        // 7-Verify titleequals:Expected: Web Orders
        String Exp_Title1 = "Web Orders";
        String Act_Title1= driver.getTitle();
        if(Exp_Title1.equals(Act_Title1)){
            System.out.println("Web Orders Verified");
        }else{
            System.out.println("Web Orders Verification Failed");
        }



    }
}
