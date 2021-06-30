package com.cybertek.tests.Project5;

import com.cybertek.Pages.VyTrackPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RefreshAndResetButton {

    @Test
    public void p5_refresh_button_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("VyTrackUrl"));

        VyTrackPage vyTrack = new VyTrackPage();

        vyTrack.inputUserName.sendKeys(ConfigurationReader.getProperty("VyTrackUserName"));
        vyTrack.inputPassword.sendKeys(ConfigurationReader.getProperty("VyTrackPassword"));

        vyTrack.loginButton.click();
        vyTrack.fleetDropDown.click();
        vyTrack.vehiclesButton.click();
        BrowserUtils.sleep(2);
        vyTrack.refreshButton.click();

        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Car - Entities - System - Car - Entities - System";

        Assert.assertTrue(actualTitle.equals(expectedTitle));
    }


    @Test
    public void p5_reset_button_test(){
        BrowserUtils.sleep(2);
        VyTrackPage vyTrack = new VyTrackPage();

        vyTrack.fleetDropDown.click();
        vyTrack.vehiclesButton.click();
        vyTrack.headerButton.click();
        BrowserUtils.sleep(2);
        vyTrack.resetButton.click();

    }
}





