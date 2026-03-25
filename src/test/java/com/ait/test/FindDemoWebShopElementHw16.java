package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindDemoWebShopElementHw16 {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void findElementByCssSelector(){
        driver.findElement(By.cssSelector("[href='/cart']"));
        driver.findElement(By.cssSelector("#small-searchterms"));
        driver.findElement(By.cssSelector("[href='/gift-cards']"));
        WebElement menu = driver.findElement(By.cssSelector(".top-menu"));
        System.out.println(menu.getText());
        WebElement bar = driver.findElement(By.cssSelector("#bar-notification"));
        System.out.println(bar.getText());
        driver.findElement(By.cssSelector("#newsletter-email"));
        WebElement comp = driver.findElement(By.cssSelector("[href='/computers']"));
        System.out.println(comp.getText());
        driver.findElement(By.cssSelector(".header"));
        driver.findElement(By.cssSelector(".item-box:nth-child(2)"));
        //driver.findElement(By.cssSelector(".item-box:nth-child(1)"));


    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
}