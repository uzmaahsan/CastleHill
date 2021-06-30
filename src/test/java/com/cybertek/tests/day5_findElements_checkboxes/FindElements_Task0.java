package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FindElements_Task0 {
    public static void main(String[] args) {
   // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
    //2.Go to https://www.merriam-webster.com/
        driver.manage().window().maximize();
        driver.get("https://www.merriam-webster.com/");
        // 3.Print out the texts of all links
        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : allLinks) {
            System.out.println(each.getText());

        }
        // 4.Print out how many link is missing text
        int missingLinks= 0;
        int linkText = 0;
        for (WebElement each : allLinks) {
            if(each.getText().isEmpty()){
                missingLinks++;
            }
            else{
                linkText++;

            }

        }
        System.out.println("total Missing Links " + missingLinks);
        // 5.Print out how many link has text
        System.out.println("Total link Text " + linkText);


        // 6.Print out how many total link
        int totalLink = allLinks.size();
        System.out.println("Total Links are " + totalLink);

        }

    }

