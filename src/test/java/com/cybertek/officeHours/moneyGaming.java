package com.cybertek.officeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class moneyGaming {
     /*
        1. Navigate to: https://moneygaming.qa.gameaccount.com/
        2. Click the JOIN NOW button to open the registration page
        3. Select a title value from the dropdown
        4. Enter your first name and surname in the form
        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        6. Submit the form by clicking the JOIN NOW button
        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        birth box
         */
    @Test
    public  void Task1(){

        // Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement joinButton = driver.findElement(By.xpath("//a[@class='newUser green']"));
        joinButton.click();
        WebElement titleElement = driver.findElement(By.id("title"));
        Select titleDropDown = new Select(titleElement);
        titleDropDown.selectByVisibleText("Mr");
        String expectedTitle = "Mr";
        String actualTitle = titleDropDown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualTitle,expectedTitle,"verify the title");
        WebElement firstName = driver.findElement(By.xpath("//input[@name='map(firstName)']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        firstName.sendKeys("Uzma");
        lastName.sendKeys("Ahsan");
        WebElement termBox = driver.findElement(By.xpath("//input[@name = 'map(terms)']"));
        termBox.click();
        WebElement submitButton = driver.findElement(By.xpath("//input[@value = 'Join Now!']"));
        submitButton.click();
        String expectedError = "This field is required";
        String actualError = driver.findElement(By.xpath("//label[@for='dob']")).getText();
        Assert.assertEquals(actualError,expectedError,"verify DOB error message");


    }
}
