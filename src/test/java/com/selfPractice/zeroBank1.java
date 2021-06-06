package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zeroBank1 {
    public static void main(String[] args) {
        //TC #1: Zero Bank header verification1.
        WebDriverManager.chromedriver().setup();
        //  Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
   // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/");
        // 3. Verify header text Expected: “Log in to ZeroBank”
        //Expected:"Log in to ZeroBank
        String expectedHeader = "Log in to ZeroBank";
        // locate the web element
        // get the text of it using getText() method
        String actualHeader = driver.findElement(By.tagName("h3")).getText();
        //String actualHeaderText = actualHeader.getText();
        if(actualHeader.equals(expectedHeader)){
            System.out.println("Header Verification PASSED");
        }else{
            System.out.println("Header Verification FAILED");
        }
        




    }
}
