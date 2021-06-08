package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_FacebookHeader {
    public static void main(String[] args) throws InterruptedException {
        // TC #4: Facebook header verification
        WebDriverManager.chromedriver().setup();
        //  1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //   2. Go to https://www.facebook.com/
        driver.get("https://www.facebook.com/");
        //   3. Verify “Create a page” link href value contains text:
        WebElement createPageLink = driver.findElement(By.className("_8esh"));

        //   Expected: “registration_form”
        String expectedInHref = "registration_form";
        String actualInValue = createPageLink.getAttribute("href");
        System.out.println("actualInValue = " + actualInValue);
        if(actualInValue.contains(expectedInHref)){
            System.out.println("HREF value verification PASSED!");
        }else{
            System.out.println("HREF value verification Failed!");
        }
        Thread.sleep(2000);
        driver.close();
    }
}
