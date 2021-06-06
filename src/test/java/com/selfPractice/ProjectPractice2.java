package com.selfPractice;

import com.cybertek.tests.UtilsClass.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
public class ProjectPractice2 {
        WebDriver driver;
        @BeforeMethod
        public void setupMethod(){
            driver = WebDriverFactory.getDriver("chrome");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         driver.get("https://qa3.vytrack.com/user/login");
        }

        @Test
        public void generalInformation() throws InterruptedException {
            driver.findElement(By.xpath("//input[@id='prependedInput']")).sendKeys("user171");
            driver.findElement(By.xpath("//input[@id='prependedInput2']")).sendKeys("UserUser123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();

            WebElement fleetIcon = driver.findElement(By.xpath("//span[@class='title title-level-1']"));
            fleetIcon.click();
            WebElement vehiclesButton = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
            vehiclesButton.click();

            Thread.sleep(1000);
            driver.findElement(By.linkText("grid-row row-click-action")).click();

        }
    }

