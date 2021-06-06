package com.selfPractice;

import com.cybertek.tests.UtilsClass.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MethodPractice {
    WebDriver driver;
   @BeforeMethod

   public void setUpMethod(){
       driver = WebDriverFactory.getDriver("Chrome");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);
       driver.get("https://www.amazon.com/");
    }
    @Test
     public void multipleWindows(){
        //((JavascriptExecutor)driver.get();)
    }

}
