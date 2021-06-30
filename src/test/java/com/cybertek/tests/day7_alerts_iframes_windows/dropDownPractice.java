package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropDownPractice {
    WebDriver driver;
    //TC#1: Verifying “Simple dropdown” and “State selection” dropdown default values
    // 1.Open Chrome browser
    // 2.Go to http://practice.cybertekschool.com/dropdown
    // 3.Verify “Simple dropdown” default selected value is correct
    // Expected: “Please select an option”
    // 4.Verify“State selection” default selected value is correct
    // Expected: “Select a State”

    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }

    @Test
    public void tc1_simple_dropdown_test() {
        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id = 'dropdown']")));
        //simpleDropdown.getFirstSelectedOption();
        WebElement currentSelection = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentOption = currentSelection.getText();
        String expectedText = "Please select an option";
        Assert.assertTrue(actualTextOfCurrentOption.equals(expectedText));
        // if (actualTextOfCurrentOption.equalsIgnoreCase(expectedText)) {
        // System.out.println("Verify Simple dropdown default selected value is correct as expected verification passed!!");
        // } else {
        //System.out.println("Verify Simple dropdown default selected value is not as expected verification FAILED!!");
    }

    @Test
    public void tc2_State_Secltion() {
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id = 'state']")));
        WebElement currentSelection = stateSelection.getFirstSelectedOption();
        String actualTextCurrentSelection = currentSelection.getText();
        String expectedText = "Select a State";

//        if(actualTextCurrentSelection.equalsIgnoreCase(expectedText)){
//            System.out.println("Verify State dropdown default selected value is correct as expected verification passed!!");
//        }else {
//            System.out.println("Verify State dropdown default selected value is not as expected verification passed!!");
//        }
        Assert.assertTrue(actualTextCurrentSelection.equals(expectedText));
    }

    @Test
    public void tc2_SelectStateDropDown() throws InterruptedException {
        //TC #2: Selecting state from State dropdown and verifying result
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select Illinois
        // 4.Select Virginia
        // 5.Select California
        // 6.Verify final selected option is California.Use all Select options.(visible text, value, index)
        Select stateSelection = new Select(driver.findElement(By.xpath("//select[@id = 'state']")));
        Thread.sleep(1000);
        stateSelection.selectByVisibleText("Illinois");
        Thread.sleep(1000);
        stateSelection.selectByValue("VA");
        Thread.sleep(1000);
        stateSelection.selectByIndex(5);
        String expectedOptionText = "California";
        String actualOptionText = stateSelection.getFirstSelectedOption().getText();
        Assert.assertTrue(actualOptionText.equals(expectedOptionText));
    }

    @AfterMethod
    public void tearDownClass() throws InterruptedException {
        Thread.sleep(1000);
        driver.close();


    }

    @Test
    public void tc3_SelectingDateDropdown() {
        // TC #3: Selecting date on dropdown and verifying
        // 1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select “December 1st, 1922” and verify it is selected.
        Select yearSelect = new Select(driver.findElement(By.xpath("//select [@id= 'year']")));
        Select monthSelect = new Select(driver.findElement(By.xpath("//select [@id= 'month']")));
        Select daySelect = new Select(driver.findElement(By.xpath("//select [@id= 'day']")));

        // Select year using:  visible text
        yearSelect.selectByVisibleText("1922");
        String actualOptionYear = yearSelect.getFirstSelectedOption().getText();
        String expectedOptionYear = "1922";
        Assert.assertTrue(actualOptionYear.equals(expectedOptionYear));

        // Select month using : value attribute
        monthSelect.selectByValue("11");
        String actualOptionMonth = monthSelect.getFirstSelectedOption().getText();
        String expectedMoth = "December";
        Assert.assertTrue(actualOptionMonth.equalsIgnoreCase(expectedMoth));

        // Select day using:  index number
        daySelect.selectByIndex(0);
        String actualDay = daySelect.getFirstSelectedOption().getText();
        String expectedDay = "1";
        Assert.assertTrue(actualDay.equals(expectedDay));
    }

    @Test
    public void tc4_SelectMultipleDropDowns() {
        //1.Open Chrome browser
        // 2.Go to http://practice.cybertekschool.com/dropdown
        // 3.Select all the options from multiple select dropdown.
        // 4.Print out all selected values.
        // 5.Deselect all values.
        Select MultipleOption = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        List<WebElement> allOptions = MultipleOption.getOptions();
        for (WebElement each : allOptions) {
            each.click();
            System.out.println("all selected values." + each.getText());
            Assert.assertTrue(each.isSelected(), "This " + each.getText() + "Is not Selected");
        }
        MultipleOption.deselectAll();
        for (WebElement each : allOptions) {
            Assert.assertFalse(each.isSelected());
        }
    }

    @Test
    public void SelectNonSelectDropDown() throws InterruptedException {
        //  TC #5: Selecting value
        //  from non-select dropdown
        //  1.Open Chrome browser
        //  2.Go to http://practice.cybertekschool.com/dropdown
        //  3.Click to non-select dropdown
        //  4.Select Facebook from dropdown
        //  5.Verify title is
        //  “Facebook -Log In or Sign Up”
        WebElement websiteDropdown = driver.findElement(By.xpath("//a[@id='dropdownMenuLink']"));
        Thread.sleep(1000);
        websiteDropdown.click();
        Thread.sleep(1000);
        WebElement faceBookLink = driver.findElement(By.xpath("//a[.='Facebook']"));
        faceBookLink.click();
        Thread.sleep(1000);
        String expectedTitle = "Facebook -Log In or Sign Up";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not as expected!!!");
    }

    @AfterMethod
    public void teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        driver.close();
    }
}