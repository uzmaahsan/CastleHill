package com.cybertek.utllities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    public static WebDriver getDriver(String a){
        if (a.equalsIgnoreCase("Chrome")  ){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver ;
        }else if (a.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            return driver ;
        }
        WebDriver driver = null;



        return driver;
    }

}
