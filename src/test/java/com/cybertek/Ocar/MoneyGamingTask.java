package com.cybertek.Ocar;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class MoneyGamingTask {
    @Test
    public void Task1(){
        ///*
        //        1. Navigate to: https://moneygaming.qa.gameaccount.com/
        //        2. Click the JOIN NOW button to open the registration page
        //        3. Select a title value from the dropdown
        //        4. Enter your first name and surname in the form
        //        5. Check the tickbox with text 'I accept the Terms and Conditions and certify that I am over the age of 18.'
        //        6. Submit the form by clicking the JOIN NOW button
        //        7. Validate that a validation message with text ‘ This field is required’ appears under the date of
        //        birth box
        //         */
        //        // Open Chrome Browser

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.get(" https://moneygaming.qa.gameaccount.com/");

    }

}
