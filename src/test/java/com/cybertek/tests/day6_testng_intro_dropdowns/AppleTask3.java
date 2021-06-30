package com.cybertek.tests.day6_testng_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AppleTask3 {
    public static void main(String[] args) {
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        // 2.Go to https://www.apple.com/
        driver.get(" https://www.apple.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 3.Click to all of the headers one by one
      List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//a"));
        // a.Mac, iPad, iPhone, Watch, TV, Music, Support
        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {
           headerLinks.get(eachLink).click();
            System.out.println(driver.getTitle());
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//a"));
            // 4.Print out the titles of the each page
            List<WebElement> linksOfAllPages = driver.findElements(By.xpath("//body//a"));
            // 5.Print out total number of links in each page
            int numberOfLinks = linksOfAllPages.size();
            System.out.println(numberOfLinks);
            // 6.While in each page:
            // a.Print out how many link is missing textTOTAL
            // b.Print out how many link has textTOTAL
            int missingTextTotal = 0;
            int TextLink = 0;
            for (WebElement eachLinkk : linksOfAllPages) {
                if(eachLinkk.getText().isEmpty()) {
                    missingTextTotal++;
                }
                else{
                    TextLink++;


            }

            }
            System.out.println(missingTextTotal + " missingTextTotal");
            System.out.println( TextLink + " TextLink ");


        }


    }
}
