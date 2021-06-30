package com.cybertek.selfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class AddRemoveElement {
    public static void main(String[] args) throws InterruptedException {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button
        WebElement AddElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        Thread.sleep(5000);
        AddElement.click();
        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteElement = driver.findElement(By.xpath("//button[.='Delete']"));

        if (deleteElement.isDisplayed()) {
            System.out.println("Delete button displayed verification PASSED");
        } else {
            System.out.println("Delete button is not displayed verification Failed");
        }
        deleteElement.click();
        Thread.sleep(5000);
            // 6. Verify “Delete” button is NOT displayed after clicking.
            if (!deleteElement.isDisplayed()) {
                System.out.println("Delete button displayed verification PASSED");
            } else {
                System.out.println("Delete button is not displayed verification Failed");

            }
        }
    }

