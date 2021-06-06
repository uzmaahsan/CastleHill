package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank2 {
    public static void main(String[] args) {

        //TC #2: Zero Bank link text verification1.
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // Open Chrome browser2.Go to http://zero.webappsecurity.com/login.html
        driver.get(" http://zero.webappsecurity.com/login.html");
        // 3.Verify link text from top left:
        String linText = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/a")).getText();
        // Expected: “Zero Bank”4.Verify link hrefattribute value contains:
        if(linText.equals("Zero Bank")){
            System.out.println("Verified");
        }else{
            System.out.println("Verification FAILED!");
        }
        // Expected: “index.html”
       String link=driver.findElement(By.linkText("/index.html")).getText();
        System.out.println(link);

        if(linText.contains("index.html")){
            System.out.println("verified");

        }else{
            System.out.println("Failed");
        }
    }
}