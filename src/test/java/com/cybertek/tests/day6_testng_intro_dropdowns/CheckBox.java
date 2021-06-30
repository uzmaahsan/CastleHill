package com.cybertek.tests.day6_testng_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        // practice: CyberTek Checkboxes
        // open chrome
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        // Go to http://practice.cybertekschool.com/checkboxes
        driver.get(" http://practice.cybertekschool.com/checkboxes");
        driver.manage().window().maximize();
        // confirm Checkbox #1 is Not selected by default.
        WebElement chrckBox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        if(!chrckBox1.isSelected()){
            System.out.println("Check Box1 is not selected by default: Verification PASSES");
        }else{
            System.out.println("CheckBox 1 is selected which by default verification Failed!! Try again");
        }
        // confirm checkbox #2 is Selected by default.
        WebElement checkBox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));
        if(checkBox2.isSelected()){
            System.out.println("Check Box2 is selected by default: Verification PASSES");
        }else{
            System.out.println("CheckBox 2 is not selected which by default verification Failed!! Try again");
        }

        // click checkbox#1 to select it.
        chrckBox1.click();
        // click checkbox#2 to deselect it
        checkBox2.click();
        // confirm checkBox #1 is selected.
        if(chrckBox1.isSelected()){
            System.out.println("Check Box1 is selected by default: Verification PASSES");
        }else{
            System.out.println("CheckBox 1 is not selected which by default verification Failed!! Try again");
        }
        // confirm checkbox #2 is not selected
        if(!checkBox2.isSelected()){
            System.out.println("Check Box2 is selected by default: Verification PASSES");
        }else{
            System.out.println("CheckBox 2 is not selected which by default verification Failed!! Try again");
        }
        Thread.sleep(3000);
        driver.close();
    }
}
