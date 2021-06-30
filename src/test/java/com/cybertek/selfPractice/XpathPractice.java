package com.cybertek.selfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    // PracticeCybertek.com_ForgotPassword WebElement verification
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        // 1. Open Chrome browser
        // 2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        // 3. Locate all the WebElements on the page using XPATH locator only (total of 6)
        WebElement HomeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));
        // a. “Home” linkb. “Forgot password” headerc.
        WebElement Forgotpassword = driver.findElement(By.xpath("//h2"));

        // “E-mail” textd. E-mail input boxe.
        WebElement Email = driver.findElement(By.xpath("//label[@for='email']"));

        // “Retrieve password” buttonf.
        WebElement Retrievepassword = driver.findElement(By.xpath("//button[@id='form_submit']"));

        // “Powered byCybertek School” text
        WebElement PoweredBy = driver.findElement(By.xpath("//a['@target_blank']"));
        // 4. Verify all WebElements are displayed.
        if (HomeLink.isDisplayed()) {
            System.out.println("HomeLink displayed PASSES");
        } else {
            System.out.println("Home Link displayed FAILED");
        }
        if (Email.isDisplayed()) {
            System.out.println("Email displayed PASSES");
        } else {
            System.out.println("Email displayed FAILED");
        }

            if (Forgotpassword.isDisplayed()) {
                System.out.println("Forgot Password displayed PASSES");
            } else {
                System.out.println("Forgot Password displayed FAILED");
            }
            if (PoweredBy.isDisplayed()) {
                System.out.println("Powered By displayed PASSES");
            } else {
                System.out.println("Powered By displayed FAILED");
            }
            Thread.sleep(1000);
            driver.close();
        }
    }
