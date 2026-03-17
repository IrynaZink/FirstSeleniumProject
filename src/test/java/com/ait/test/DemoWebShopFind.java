package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoWebShopFind {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void findElementById(){
        WebElement bar = driver.findElement(By.id("bar-notification"));
        System.out.println(bar.getDomAttribute("id"));
    }
    @Test
    public void findElementByClassName(){
        WebElement header = driver.findElement(By.className("header"));
        System.out.println(header.getText());
        System.out.println(header.getAttribute("class"));
    }

    @Test
    public void findElementByTagName(){
        WebElement element = driver.findElement(By.tagName("h3"));
        System.out.println(element.getText());

    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
