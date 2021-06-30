package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F3_HeaderVerification {
    public static void main(String[] args) {
        //TC #3: Facebook header verification
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browse
        WebDriver driver = new ChromeDriver();
        // 2. Go to https://www.facebook.com/
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
         // 3. Verify header text is as expected:
        WebElement header = driver.findElement(By.className("_8eso"));
        //Expected: “Connect with friends and the world around you on Facebook.”
        String expectedHeader = "Connect with friends and the world around you on Facebook.";
        String actualHeader = header.getText();
        if(actualHeader.equalsIgnoreCase(expectedHeader)){
            System.out.println("Header Verification Passes");
        }else{
            System.out.println("Header Verification PASSES");
        }

    }
}
