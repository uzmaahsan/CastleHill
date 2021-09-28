package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Task {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        String browser = ConfigurationReader.getProperty("browser");
        String url = ConfigurationReader.getProperty("dataTablesurl");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
    }
        @Test
        public void task3_return_time_due_amount () {
            //    •    Locate first table and verify Tim has due amount of “$50”
            //
            //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
            //[6:20 PM]
            //
            //TC#3: WebTable order verification
            //    •    Open browser and go to: http://practice.cybertekschool.com/tables#edit
            //    •    Locate first table and verify Tim has due amount of “$50”
            //
            //Note: Create locator for Tim that will be dynamic and doesn’t care in which row Tim is.
            //
            //Message @Meleha yousaf
        }
    }
