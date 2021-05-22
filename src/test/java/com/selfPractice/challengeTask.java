package com.selfPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class challengeTask {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("\"https://www.amazon.com");
        WebElement inboxSearch = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        String searchItime = "Wooden spoon";
        inboxSearch.sendKeys(searchItime + Keys.ENTER);

        String expectedTitle = "Amazon.com : wooden spoon", actualTitle = driver.getTitle();
        if (actualTitle.equalsIgnoreCase(expectedTitle)) {
            System.out.println("Title verification test passed!");
        } else {
            System.out.println("Title verification test failed");
        }

        Thread.sleep(3000);
        driver.close();

    }
}
