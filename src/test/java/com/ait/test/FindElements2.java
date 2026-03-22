package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FindElements2 {
    WebDriver driver;

    @BeforeMethod
    public  void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }

    @Test
    public void findElementByLinkText(){
        WebElement linkText1 = driver.findElement(By.linkText("Terms of use"));
        System.out.println(linkText1.getText());
    }
    @Test
    public void findElementByPartialText(){
        WebElement linkText2 = driver.findElement(By.partialLinkText("up"));
        System.out.println(linkText2.getText());
    }

    @AfterMethod(enabled = false)
    public void tearDown(){driver.quit();}

}
