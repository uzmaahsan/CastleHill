package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class T3_Cybertek_Delete50Times {
    public static void main(String[] args) {
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        // 2. Go to http://practice.cybertekschool.com/add_remove_elements
        driver.get("http://practice.cybertekschool.com/add_remove_elements/");
        // 3. Click to “Add Element” button 50 times
        WebElement addElement = driver.findElement(By.xpath("//button[.='Add Element']"));
        for (int i = 0; i < 50; i++) {
            addElement.click();
        }
        // 4. Verify 50 “Delete” button is displayed after clicking.
        List<WebElement> listofDeleteButtons = driver.findElements(By.xpath("//button[.='Delete']"));
        WebElement deleteButton = driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("Number of delete buttons on the page" + listofDeleteButtons.size());
        // 5. Click to ALL “Delete” buttons to delete them.
        for (WebElement button : listofDeleteButtons) {
            button.click();
        }
        // 6. Verify “Delete” button is NOT displayed after clicking.
        try {

            if (!deleteButton.isDisplayed()) {
                System.out.println("Delete button is not displayed after clicking.PASS");
            } else {
                System.out.println("Delete button is displayed after clicking.Failed");
            }
        } catch (StaleElementReferenceException exception) {
            System.out.println("StaleElementReferenceException has been thrown.");
            System.out.println("It means element has been completely deleted from the HTML");
            System.out.println("delete button is not displayed. Verification PASSED!");
            // USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS Hint: Need to use findElements method.
        }
    }
}
