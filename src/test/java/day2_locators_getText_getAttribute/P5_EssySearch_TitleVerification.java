package day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_EssySearch_TitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*TC #3: Back and forth navigation
        1- Open a chrome browser

        2- Go to: https://google.com
        3- Click to Gmail from top right.
        4- Verify title contains*/
        driver.get("https://www.etsy.com");
        driver.findElement(By.id("global-enhancements-search-query"))
                .sendKeys("wooden spoon" + Keys.ENTER);
        String expectedTitle = "Wooden spoon | Etsy";
        String actualTittle = driver.getTitle();
        if (actualTittle.equals(expectedTitle)) {
            System.out.println("Etsy title verification PASSES");
        } else {
            System.out.println("Etsy title verification Failed");
        }
    }
}