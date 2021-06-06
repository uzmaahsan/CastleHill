package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationProject {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //Scenario: Verify when user clicks on any car on the grid, system should display general information about the car
        //https://qa3.vytrack.com/user/login
        driver.get("https://qa3.vytrack.com/user/login");
        driver.findElement(By.xpath("//*[@id='prependedInput']")).sendKeys("user171");
        driver.findElement(By.xpath("//*[@id='prependedInput2']")).sendKeys("UserUser123");
        //Given truck driver is on the Vehicles page
        driver.findElement(By.xpath("//*[@id='_submit']")).click();
        //When truck driver clicks on any Vehicle
        //WebElement fleetIcon =
                driver.findElement(By.xpath("//span[@class='title title-level-1']")).click();
        //fleetIcon.click();
        WebElement vehiclesButton = driver.findElement(By.xpath("//span[@class='title title-level-2']"));
        vehiclesButton.click();
       // Select option = new Select(driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-1596150344\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[1]")));
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"grid-custom-entity-grid-1023826199\"]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]")).click();
        //driver.findElement(By.xpath())


    }
}