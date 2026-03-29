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
        driver.findElement(By.cssSelector("[class*='wrapper'"));
        driver.findElement(By.cssSelector("[class^='ajax']"));
        driver.findElement(By.cssSelector("[style='display: none']"));


    }

    @Test
    public void findElementByXPath(){
        driver.findElement(By.xpath("//*[@href='/register']"));
        driver.findElement(By.xpath("//*[@id='small-searchterms']"));
        driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']"));//по точному совпадению текста
        driver.findElement(By.xpath("//*[@class='flyout-cart']"));
        WebElement store = driver.findElement(By.xpath("//*[contains(text(),'our store')]"));
        System.out.println(store.getText());
        driver.findElement(By.xpath("//*[.='Welcome to the new Tricentis store!']"));
        driver.findElement(By.xpath("//*[@class='header-logo']/a"));
        WebElement element = driver.findElement(By.xpath("//*[@class='title']/following-sibling::div[5]"));
        System.out.println(element.getText());
        driver.findElement(By.xpath("//p/parent::*"));//one step up
        driver.findElement(By.xpath("//p/parent::div"));
        driver.findElement(By.xpath("//p/.."));
        driver.findElement(By.xpath("//p/ancestor::div[2]"));



    }

    @AfterMethod

    public void tearDown() {
        driver.quit();
    }
}