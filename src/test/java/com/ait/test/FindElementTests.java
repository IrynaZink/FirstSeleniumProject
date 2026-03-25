package com.ait.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FindElementTests {
    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://icarro-v1.netlify.app/search?page=0&size=10");
        driver.manage().window().maximize();
        //driver.manage().window().setSize(new Dimension(900, 900));//специфический размер экрана
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); для тяжелых сайтов
    }
    @Test
    public void findElementByTagNameTest(){

        //поиск элемента по тексту
        WebElement element = driver.findElement(By.tagName("h1"));
        System.out.println(element.getText());

        //поиск элемента по By.tagName h2
        WebElement element1 = driver.findElement(By.tagName("h2"));
        System.out.println(element1.getText());

        WebElement link = driver.findElement(By.tagName("a"));
        System.out.println(link.getText());

        //поиск WEB ELEMENTS
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //поиск WEB elements by label
        WebElement label = driver.findElement(By.tagName("label"));
        System.out.println(label.getText());

    }
    @Test
    public void findElementById(){
        WebElement city = driver.findElement(By.id("city"));
        System.out.println(city.getDomAttribute("id"));

        WebElement dates = driver.findElement(By.id("dates"));
        System.out.println(dates.getDomAttribute("id"));


    }
    @Test
    public void findElementByClassName(){
        WebElement telephone = driver.findElement(By.className("telephone"));
        System.out.println(telephone.getText());

        WebElement search = driver.findElement(By.className("navigation-link"));
        System.out.println(search.getText());
        System.out.println(search.getAttribute("class"));

    }
    @Test
    public void findElementByLinkText(){
        //WebElement linkText = driver.findElement(By.linkText("Let car work"));
        //System.out.println(linkText.getText());

        //WebElement linkText2 = driver.findElement(By.linkText("Los Angeles"));
        //System.out.println(linkText2.getText());

        WebElement angeles = driver.findElement(By.linkText("Rome"));
        System.out.println(angeles.getText());


    }

    @Test
    public void findElementByPartialLinkText(){
        WebElement partialLinkText = driver.findElement(By.partialLinkText("work"));
        System.out.println(partialLinkText.getText());

    }
    @Test
    public void findElementByLinkText2(){
        WebElement linkText1 = driver.findElement(By.linkText("Terms of use"));
        System.out.println(linkText1.getText());
    }
    @Test
    public void findElementByPartialText2(){
        WebElement linkText2 = driver.findElement(By.partialLinkText("up"));
        System.out.println(linkText2.getText());
    }

    @Test
    public void findElementByCssSelector(){
        //driver.findElement(By.tagName("h1"));
       //tagName h1-> css "h1"
        driver.findElement(By.cssSelector("h1"));
        //driver.findElement(By.id("city"));
        //id = -> css "city"
        driver.findElement(By.cssSelector("#city"));

        //driver.findElement(By.className("telephone"));
        //className = "telephone" -> css .telephone
        driver.findElement(By.cssSelector(".telephone"));

        //contains ->
        driver.findElement(By.cssSelector("[class*='container']"));


        //start- > ^
        driver.findElement(By.cssSelector("[class^='input']"));
        //end to -> $
        driver.findElement(By.cssSelector("[class$='icon']"));
        //[key='value']
        driver.findElement(By.cssSelector("[placeholder='City']"));
        //composite tag + class + class составной css селектор
        driver.findElement(By.cssSelector("a.navigation-link.active"));
        //one step above(один шаг вниз)
        driver.findElement(By.cssSelector(".logo>img"));
        //<tag> or <class> or <id>:nth-child(n)
        WebElement feedback = driver.findElement(By.cssSelector(".feedback-card:nth-child(1)"));
        System.out.println(feedback.getText());
        WebElement search = driver.findElement(By.cssSelector(".navigation-link:nth-child(2)"));
        System.out.println(search.getText());

    }

    @AfterMethod(enabled = false)
    public void tearDown(){
        driver.quit();
    }
}
