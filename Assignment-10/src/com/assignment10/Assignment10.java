package com.assignment10;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment10 {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.easemytrip.com/");
    }

    @Test
    public void validateAssertions() {

        String String1 = "MyAccount";
        String String2 = "My Booking";

        // assertEquals
        Assert.assertEquals(String1, "MyAccount");
        System.out.println("assertEquals Passed");

        // assertNotEquals
        Assert.assertNotEquals(String1, String2);
        System.out.println("assertNotEquals Passed");

        // assertTrue
        Assert.assertTrue(String1.equals("MyAccount"));
        System.out.println("assertTrue Passed");

        // assertFalse
        Assert.assertFalse(String1.equals(String2));
        System.out.println("assertFalse Passed");

        // assertNull
        String value1 = null;
        Assert.assertNull(value1);
        System.out.println("assertNull Passed");

        // assertNotNull
        Assert.assertNotNull(String1);
        System.out.println("assertNotNull Passed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}