package com.cybertek.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day6_CheckBox {
    public static void main(String[] args) throws InterruptedException {
        // practice: CyberTek Checkboxes
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        // Go to http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");
       // WebElement checkbox1 = driver.findElement(By.xpath("//*[@id=\"box1\"]"));
        WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
        // confirm Checkbox #1 is Not selected by default.
        if(!checkbox1.isSelected()){
            System.out.println("Checkbox 1 is not selected,Verification Passed:");
        }else{
            System.out.println("Check box 1 is selected which verification failed ");
        }
        // confirm checkbox #2 is Selected by default.
        if(checkbox2.isSelected()){
            System.out.println("checkBox 2 is selected Verification passed");
        }else{
            System.out.println("checkBox 2 is not selected Verification failed");
        }
        // click checkbox#1 to select it.
        checkbox1.click();
        checkbox2.click();
        // click checkbox#2 to deselect it.
        if(checkbox1.isSelected()){
            System.out.println("checkbox1 is selected verification passed");
        }else{
            System.out.println("checkbox1 is nit selected verification failed");

        }
        if(!checkbox2.isSelected()){
            System.out.println("checkbox2 is not selected verification passed");
        }else{
            System.out.println("checkbox2 is nit selected verification failed");

        }
        Thread.sleep(2000);
        driver.close();

    }
}
