package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {
    public static void main(String[] args) {
        //#1: Verifying “Simple dropdown” and “State selection” dropdown default values
        WebDriverManager.chromedriver().setup();
   // 1.Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //2.Go to http://practice.cybertekschool.com/dropdown
        driver.get(" http://practice.cybertekschool.com/dropdown");
        driver.manage().window().maximize();
        // 3.Verify “Simple dropdown” default selected value is correctExpected: “Please select an option”
        Select option =new Select(driver.findElement(By.xpath("//*[@id='dropdown']")));
        String word= option.getFirstSelectedOption().getText();
        System.out.println(word);
        if(word.equals("Please select an option")){
            System.out.println("Drop down Verified");
        }
        else{
            System.out.println("Drop down not Verified");
        }
        // 4.Verify“State selection” default selected value is correctExpected: “Select a State”
        Select option2 =new Select(driver.findElement(By.xpath("//*[@id='state']")));
       String word2= option2.getFirstSelectedOption().getText();
        if(word2.equals("Select a State")){
            System.out.println("Drop down Verified");
        }
        else{
            System.out.println("Drop down not Verified");
        }

    }
}
