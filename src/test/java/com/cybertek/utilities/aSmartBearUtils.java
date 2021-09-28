package com.cybertek.utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class aSmartBearUtils {
    //Mini-Task:CREATE A CLASS àSmartBearUtils•
    // Create a method called loginToSmartBear•
    // This method simply logs in to SmartBear when you call it.•
    // Accepts WebDriver type as parameter

    public static void loginToSmartBear(WebDriver driver) {
//        //1.Open browser
//        driver = WebDriverFactory.getDriver("Chrome");
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }
}

