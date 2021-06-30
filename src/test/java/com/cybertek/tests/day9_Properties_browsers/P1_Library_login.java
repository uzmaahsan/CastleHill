package com.cybertek.tests.day9_Properties_browsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_login {

    WebDriver driver;
    private com.cybertek.utilities.WebDriverFactory WebDriverFactory;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://library1.cybertekschool.com/login.html");
    }
    @Test
    public void login_link_count_test(){
        //Task #1: Library software link verification
        //3. Enter username: “”
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        inputUsername.sendKeys("student11@library");
        //4. Enter password: “”
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");
        //5. Click to Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        loginButton.click();
        //6. Print out count of all the links on landing page

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        //7. Print out each link text on this page

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }

    }

}


