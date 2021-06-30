package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(String browserType) {
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            // System.out.println("pass");

            return new ChromeDriver();

        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new FirefoxDriver();
            driver.manage().window().maximize();
            // System.out.println("fail");
            return driver;
        } else {
            System.out.println("Given browser type foes not exist. Driver = null");
            return null;
        }
    }
}


