package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CybertekPractice {
    public static void main(String[] args) {
        // TC #2: Cybertek practice tool verifications
        WebDriverManager.chromedriver().setup();
        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to https://practice.cybertekschool.com
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        // 3. Verify URL contains
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        //  Expected: cybertekschool
        if (url.contains("cybertekschool")) {
            System.out.println("URL as expected. Test verified.");
        } else{
            System.out.println("URL is not as expected. Test failed.");

            }
            // 4. Verify title:
        if (title.equals("Practice")){
            System.out.println("Title is as expected. Test verified.");
            // Expected: Practice
        }else{
            System.out.println("Title not as expected. Test failed.");
        }


        }
    }
