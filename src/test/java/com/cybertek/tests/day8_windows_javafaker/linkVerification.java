package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class linkVerification {
    WebDriver driver;

    //TC #1: Smartbear software link verification
    // 1.Open browser
    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
    }

    @Test
    public void SmartBear_Task1() {
        // 3.Enter username: “Tester”
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");

        // 5.Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
        // 6.Print out count of all the links on landing page
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("Total number of the link" + allLinks.size());
        // 7.Print out each link text on this page
        int linkWithText = 0;
        int linkWithOutText = 0;
        for (int i = 0; i < allLinks.size(); i++) {
            System.out.println("Printing the Text Link "+allLinks.get(i).getText());
            System.out.println(allLinks.get(i).getAttribute("href"));
        }
    }


    }

