package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements_Apple_Task02 {
    public static void main(String[] args) throws InterruptedException {
        ////TC #02: FINDELEMENTS_APPLE
        //        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        //        // 2.Go to https://www.apple.com/
        driver.get("https://www.apple.com/");

        //        // 3.Click to iPhone
        WebElement iphone = driver.findElement(By.xpath("//a[@href='/iphone/']"));
        iphone.click();
        //        // 4.Print out the texts of all links
        List<WebElement> iphoneLinks = driver.findElements(By.xpath("//body//a"));
        Thread.sleep(4000);
        List<WebElement> iPhoneLinks = driver.findElements(By.xpath("//body//a"));
        //        // 5.Print out how many link is missing text
        int countLinkWithText = 0;
        for (int i = 0; i < iPhoneLinks.size(); i++) {
            if (!iPhoneLinks.get(i).getText().isEmpty()) {
                countLinkWithText++;
            } else {
                System.out.println(i + ") Link texts: " + iPhoneLinks.get(i).getText());
            }
        }
        System.out.println("============== RESULT =================");
        System.out.println("Total number of links: " + iPhoneLinks.size());
        System.out.println("Total number of links with TEXT: " + countLinkWithText);
        System.out.println("Total number of links without TEXT: " + (iPhoneLinks.size() - countLinkWithText));
        driver.quit();
    }


        }

// 6.Print out how many link has text
//        // 7.Print out how many total link
    
