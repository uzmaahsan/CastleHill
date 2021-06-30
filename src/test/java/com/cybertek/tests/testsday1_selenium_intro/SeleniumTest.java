package com.cybertek.tests.testsday1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
        public static void main(String[] args) {
            // 1- set up the web driver (this comes from the depen
            WebDriverManager.chromedriver().setup(); // this line will take care of the setup of it self

            // 2- creat the instance of the Chrome Driver
            WebDriver driver=new ChromeDriver();

            // 3 - test if the driver is working.
            driver.get("https://www.google.com/"); // after you run this java class, if we get a get a chromeBrowser to the google.com.
        }
    }


