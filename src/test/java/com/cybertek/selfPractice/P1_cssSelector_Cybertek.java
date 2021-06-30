package com.cybertek.selfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P1_cssSelector_Cybertek {
    public static void main(String[] args) {
       // 1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3. Locate all the WebElements on the page using XPATH and/or CSSlocator only (total of 6)
       // WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));

        // a. “Home” link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        // b. “Forgot password” header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
        // c. “E-mail” textd.
        WebElement eMailLabel = driver.findElement(By.cssSelector("label[for='email']"));
        // E-mail input box.
        WebElement inPutEmail = driver.findElement(By.cssSelector("input[name='email']"));
        // “Retrieve password” button.
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));

        // “Powered byCybertek School” text
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        
        // 4. Verify all WebElements are displayed.
        System.out.println("homeLink.isDisplayed() " + homeLink.isDisplayed());
        System.out.println("forgotHeader.isDisplayed() " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + eMailLabel.isDisplayed());

        System.out.println("inputEmail.isDisplayed() = " + inPutEmail.isDisplayed());

        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());

        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());
        //System.out.println(homeLink.isDisplayed());

    }
}
