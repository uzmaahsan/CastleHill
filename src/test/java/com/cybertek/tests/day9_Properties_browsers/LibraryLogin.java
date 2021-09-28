package com.cybertek.tests.day9_Properties_browsers;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LibraryLogin {
    WebDriver driver;
    //1.Open browser
    // 2.Go to website: http://library2.cybertekschool.com/login.html
    // 3.Enter username: “”
    // 4.Enter password: “”
    // 5.Click to Login button
    // 6.Print out count of all the links on landing page
    // 7.Print out each link text on this page

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://library1.cybertekschool.com/login.html");
    }

    @Test
    public void firstTest_Library() {
        WebElement userName = driver.findElement(By.xpath("//input[@type='email']"));
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
        // 3.Enter username: “”
        userName.sendKeys ("librarian13@library");
        // 4.Enter password: “”
        password.sendKeys("9rf6axdD");
        // 5.Click to Login button
        button.click();
        BrowserUtils.sleep(2);
        // 6.Print out count of all the links on landing page
        List<WebElement> allthelinks = driver.findElements(By.xpath("//body//a"));
        System.out.println("all the links are: "+allthelinks.size());

        for (WebElement each : allthelinks) {

            // 7.Print out each link text on this page
            System.out.println(each.getText());

        }

    }
}


