package com.cybertek.selfPractice;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_Practice_Cybertek_Forgot_Password_url_Verification_Xpath {
    public static void main(String[] args) throws InterruptedException {
        //TC #3: PracticeCybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver(("Chrome"));
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get(" http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
        WebElement  inputbox = driver.findElement(By.xpath("//input[@name='email']"));
        inputbox.sendKeys("afaff@gmail.com");
        // 4.Click on Retrieve password
        WebElement RetrievePassword = driver.findElement(By.xpath("//*[@id='form_submit']/i"));
        RetrievePassword.click();
        // 5.Verify URL contains: Expected: “email_sent”
        WebElement message = driver.findElement(By.cssSelector("h4[name='confirmation_message']"));
        String expectedEmail = "Your e-mail's been sent!";
        String actualEmail = message.getText();
        if(actualEmail.contains("e-mail")&& actualEmail.contains("sent")){
            System.out.println("Verification PASSED");
        }
        else{
            System.out.println("Verification FAILED");
        }
        Thread.sleep(1000);

        // 6.Verify textbox displayed the content as expected.
        if(actualEmail.equalsIgnoreCase(expectedEmail)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        // Expected: “Your e-mail’s been sent!”
        driver.close();

    }
}
