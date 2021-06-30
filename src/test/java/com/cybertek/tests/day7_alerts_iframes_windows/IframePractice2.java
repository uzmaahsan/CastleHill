package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice2 {

WebDriver driver;
    @BeforeMethod
    public void setUpMethod() {
        //1. Create a new class called: IframePractice
        //2. Create new test and make set ups
        //3. Go to: http://practice.cybertekschool.com/iframe
        //4. Assert: “Your content goes here.” Text is displayed.
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Edito

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }
    @Test
    //driver.switchTo().frame(0);
    public void iframe_test(){
        //Locating WebelementText
        driver.switchTo().frame("mce_0_ifr");
        WebElement YourcontentgoeshereText = driver.findElement(By.xpath("//p"));
        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(YourcontentgoeshereText.isDisplayed());
       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Edito
        Assert.assertTrue(headerText.isDisplayed());

    }
}