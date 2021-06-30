package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {
        public static void main(String[] args) throws InterruptedException {
            //TC #2: Facebook incorrect login title verification
            // 1. Open Chrome browser
            //setup browser driver
            WebDriverManager.chromedriver().setup();
            //create driver instance and open browser
            WebDriver driver = new ChromeDriver();
            //use the 'driver' object created to use selenium methods
            //maximize browser
            driver.manage().window().maximize();
            // 2. Go to https://www.facebook.com
            driver.get("https://www.facebook.com");
            //Locating the web element using id locator and storing it in WebElement type.
            WebElement inputUsername =  driver.findElement(By.id("email"));
            // 3. Enter incorrect username
            inputUsername.sendKeys("something1213@gmail.com");
            //Locate the web element using
            WebElement inputPassword = driver.findElement(By.id("pass"));
            // 4. Enter incorrect password
            inputPassword.sendKeys("some wrong password" + Keys.ENTER);
            // 5. Verify title changed to:
            //Expected: “Log into Facebook”
            String expectedTitle = "Log into Facebook";
            System.out.println("expectedTitle = " + expectedTitle);
            Thread.sleep(2000);
            WebElement logIn = driver.findElement(By.className("_9axz"));


            //Freezing the code for 5 secs so that Chrome browser can catch up with loading the page
            Thread.sleep(5000);


            String actualTitle =logIn.getText();
            System.out.println("actualTitle = " + actualTitle);

            if (actualTitle.equalsIgnoreCase(expectedTitle)){
                System.out.println("Title verification PASSED!");
            }else{
                System.out.println("Title verification FAILED!");
            }
        }
    }



