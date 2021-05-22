package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://zero.webappsecurity.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("signin_button")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("user_login")).sendKeys("user name");
        driver.findElement(By.name("user_password")).sendKeys("password" + Keys.ENTER);
        driver.findElement(By.className("secondary-button small-link")).click();

        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        String expectedTitle = "Zero _ Account Summary";
        if(actualTitle.equals(expectedTitle)){
            System.out.println("PASSED _ Actual title is the same as expected title ");
        }else{
            System.out.println("FAILED : Title is not as expected ");
        }
        Thread.sleep(3000);
        driver.findElement(By.id("transfer_funds_tab")).click();







    }
}
