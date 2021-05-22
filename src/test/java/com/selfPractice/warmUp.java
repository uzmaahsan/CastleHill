package com.selfPractice;

import com.cybertek.utllities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class warmUp {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");
        driver.get("https://qa3.vytrack.com/user/login");
        String actualTitle = driver.getTitle();
        String expectedTitle = "login";
        String check = actualTitle.equals(expectedTitle) ? "Passed: Actual title matches expected" : "Failed: Actual is NOT matching expected";
        System.out.println(check);


        WebElement usernameLoginPage = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        usernameLoginPage.sendKeys("Storemanager201");

        WebElement passwordLoginPage = driver.findElement(By.xpath("//input[@type='password']"));
        passwordLoginPage.sendKeys("UserUser123");
        passwordLoginPage.submit();

        String ActualTitle02 = driver.getTitle();
        String expectedTitle02 = "Dashboard";

        String check2 = ActualTitle02.equals(expectedTitle02) ? "Passed" : "Failed";
        System.out.println(check2);


        String checkLoginVsDashboard = ActualTitle02.equals(actualTitle) ? "Failed" : "Passed";
        System.out.println(checkLoginVsDashboard);

        String check3 = !actualTitle.equals(ActualTitle02) ? "Test Passed: Login page title doesn't match the Dashboard title" : "Test Failed: Login page title matches Dashboard page title";

        System.out.println(check3);

    }
}




