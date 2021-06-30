package com.cybertek.Pages;

import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {
        @Test
        public void negative_login_to_library_test() {

            // Go to library
            Driver.getDriver().get("https://library2.cybertekschool.com/login.html");

            //Create object of the class
            //When we create the object of "LibraryLoginPage", constructor will automatically
            //initialize driver and object of LibraryLoginPage
            //Meaning we will able to use the selenium method through the object of the class
            LibraryLoginPage loginPage = new LibraryLoginPage();

            //Enter incorrect email
            loginPage.inputEmail.sendKeys("wrong@gmail.com");

            //Enter incorrect password
            loginPage.inputPassword.sendKeys("wrong password");

            //click to sign in button
            loginPage.signInButton.click();

            //Verify error message is displayed
            Assert.assertTrue(loginPage.incorrectEmailOrPasswordError.isDisplayed());
        }

    }
