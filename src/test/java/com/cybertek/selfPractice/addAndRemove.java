package com.cybertek.selfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class addAndRemove {
    //TC #2: PracticeCybertek.com_AddRemoveElements WebElement verification
    public static void main(String[] args) throws InterruptedException {

        // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");

        // 3. Click to “Add Element” button
        WebElement addElementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        addElementButton.click();
        // 4. Verify “Delete” button is displayed after clicking.
        WebElement deleteElementButton = driver.findElement(By.xpath("//button[.='Delete']"));
        if (deleteElementButton.isDisplayed()) {
            System.out.println("Delete button is Verified Passed");
        } else {
            System.out.println("Delete button is not Displayed Verified Failed!!");
        }
        // 5. Click to “Delete” button.
        try {
            deleteElementButton.click();
            // 6. Verify “Delete” button is NOT displayed after clicking.
            if (!deleteElementButton.isDisplayed()) {
                System.out.println("Delete button is not Displayed Verified passed!!");
            } else {
                System.out.println("Delete button is Verified Passed");
            }
        } catch (Exception E) {
            System.out.println(E);
        }

            // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS
            Thread.sleep(1000);
            driver.close();

        }

    }
