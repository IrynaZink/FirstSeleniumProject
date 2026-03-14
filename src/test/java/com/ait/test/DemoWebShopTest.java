package com.ait.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoWebShopTest {
    WebDriver driver;
    //before test
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
    @Test
    public void openBrowser(){
        System.out.println("site opened");
    }
    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
