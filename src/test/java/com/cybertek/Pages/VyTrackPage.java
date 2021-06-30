package com.cybertek.Pages;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackPage {
        public VyTrackPage(){
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy(xpath = "//input[@id='prependedInput']")
        public WebElement inputUserName;

        @FindBy(xpath = "//input[@id='prependedInput2']")
        public WebElement inputPassword;

        @FindBy(xpath = "//button[@type='submit']")
        public WebElement loginButton;

        @FindBy(xpath = "//span[@class='title title-level-1']")
        public WebElement fleetDropDown;

        @FindBy(xpath = "//span[@class='title title-level-2']")
        public WebElement vehiclesButton;

        @FindBy(xpath = "//a[@class='grid-header-cell__link']")
        public WebElement headerButton;

        @FindBy(xpath = "//a[@title='Reset']")
        public WebElement resetButton;

        @FindBy(xpath = "//a[@title='Refresh']")
        public WebElement refreshButton;

    }

