package com.cybertek.tests.day8_windows_javafaker;

import com.cybertek.utilities.WebDriverFactory;
import com.cybertek.utilities.aSmartBearUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class smartBearSoftWareOrder {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("Chrome");
        aSmartBearUtils.loginToSmartBear(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Open browser2.Go to website:
        // 2.Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
    }
       @Test
       public void smartBear_Task2(){
        //3.Enter username: “Tester”
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("Tester");
        // 4.Enter password: “test”
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("test");
        // 5.Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
        loginButton.click();
        // 6.Click on Order
           WebElement Order = driver.findElement(By.xpath("//a[.='Order']"));
           Order.click();
        // 7.Select familyAlbum from product, set quantity to 2
        Select productDropdown = new Select(driver.findElement(By.xpath("//select[@name='ctl00$MainContent$fmwOrder$ddlProduct']")));
        productDropdown.selectByValue("FamilyAlbum");

           WebElement Quantity = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$txtQuantity']"));
           Quantity.clear();
           Quantity.sendKeys("2");
        //8 .Click to “Calculate” button
           WebElement Calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
           Calculate.click();
        // 9.Fill address Info with JavaFaker
        // •Generate: name, street, city, state, zip code10.
           WebElement fullName = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
           WebElement streetInput = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2"));
           WebElement cityAddress = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3"));
           WebElement zipCode = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5"));
           Faker faker = new Faker();
           fullName.sendKeys(faker.address().streetAddress());
           streetInput.sendKeys(faker.address().streetAddress());
           cityAddress.sendKeys(faker.address().cityName());
           zipCode.sendKeys(faker.address().zipCode().replaceAll("-",""));
        // Click on “visa” radio button
          WebElement Visa = driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0"));
           Visa.click();
        // 11.Generate card number using JavaFaker
           WebElement cardNumber = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
           cardNumber.sendKeys(faker.finance().creditCard());
           WebElement expireDate = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$fmwOrder$TextBox1']"));
           expireDate.sendKeys("05/24");
        // 12.Click on “Process”
           WebElement processButton = driver.findElement(By.linkText("Process"));
           processButton.click();
//13.Verify success message “New order has been successfully added." displayed
           WebElement successMessage = driver.findElement(By.xpath("//div[@class='buttons_process']/strong"));
           Assert.assertTrue(successMessage.isDisplayed(), "Success message is NOT displayed");
       }
    }
