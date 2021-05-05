package com.cybertek.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
    public static void main(String[] args) {


        // 1- set up web driver
        WebDriverManager.chromedriver().setup();


        // 2- creat the instance of the chrome driver
        WebDriver driver = new ChromeDriver();

        // 3- test if the driver id working
        driver.get("https://www.google.com");





    }
}
