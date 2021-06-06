package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC3_ForgotPassword {
    public static void main(String[] args) {
        //#3: PracticeCybertek/ForgotPassword URL verification
        WebDriverManager.chromedriver().setup();
        // 1.Open Chrome browser
        WebDriver driver = new ChromeDriver();
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // 3.Enter any email into input box
      driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        // 4.Click on Retrieve password
     driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i")).click();
        // 5.Verify URL contains: Expected: “email_sent”
        String ExpectedUrl = "email_sent";
        String ActualUrl = driver.getCurrentUrl();

        if(ActualUrl.contains(ExpectedUrl)){
            System.out.println("Url Verified");
        }else{
            System.out.println("Url Verification Failed");
        }
        // 6.Verify textbox displayed the content as expected.Expected: “Your e-mail’s been sent!”Hint: You need to use getText method for this practice.
        String ExpTxtBox = "Your e-mail’s been sent!";
        WebElement text_box = driver.findElement(By.xpath("//*[@id=\"content\"]/h4"));
        String Act = text_box.getAttribute("Your e-mail’s been sent!");
        System.out.println(Act);
    }
}
