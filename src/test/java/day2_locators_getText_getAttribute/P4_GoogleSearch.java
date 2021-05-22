package day2_locators_getText_getAttribute;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4_GoogleSearch {
    public static void main(String[] args) {
        // 1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        // 2- Go to Google browser
        driver.get("https://google.com");

        //3- find search box in google and type apple then enter
        driver.findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);

        // 4- Verify the current title if it is "apple"
        // Expected title should start with: apple
        String expectedWord = "apple";
        String currentTitle = driver.getTitle();

        if (currentTitle.startsWith(expectedWord)) {
            System.out.println("Verification title passed!!!");
        }else {
            System.out.println("Verification title failed!!!");
        }

        driver.close();

    }
    }
