package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
       // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
       // 3. Verify title:
        String expectedTitle = "Yahoo";
      String actualTitle = driver.getTitle();
       // Expected: Yahoo
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Varification is PASSED");
        }else{
            System.out.println("Verification FAILED");
        }
        driver.close();

    }
}
