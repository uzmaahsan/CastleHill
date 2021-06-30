package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
// //1. Go to http://practice.cybertekschool.com/upload
//        //2. Find some small file from your computer, and get the path of it. 3. Upload the file.
//        //4. Assert:
//        //-File uploaded text is displayed on the page
//    }
//
//}

public class UploadPractice {
    private Thread BrowserUtils;

    @Test
    public void Upload_test() throws InterruptedException {
        Driver.getDriver().get(" http://practice.cybertekschool.com/upload");
        String path = "/Users/cybertekchicago-1/Downloads/lol.jpg";

        //3. Upload the file.
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));

        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));


        BrowserUtils.sleep(3);

        //Sending the file path to the chooseFile WebElement
        chooseFile.sendKeys(path);

        //click to upload button
        uploadButton.click();

        //4. Assert:
        //-File uploaded text is displayed on the page
        //4. Assert:
        //-File uploaded text is displayed on the page
        WebElement fileUploadedMessage = Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedMessage.isDisplayed());
        Driver.closeDriver();

    }

}


