package com.sedc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework2 {
    public static final int TIMEOUT = 20;
    WebDriver driver;
    Actions action;
    public WebDriverWait wait;

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\FirstSeleniumProject\\src\\test\\recources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        wait = new WebDriverWait(driver, TIMEOUT);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void runnersHomework() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("runners mk");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.yuRUbf > a > h3 > span")).click();
        driver.findElement(By.className("search_query")).sendKeys("patiki");
        driver.findElement(By.cssSelector("#search0 > button > i")).click();
        driver.navigate().back();
        //Thread.sleep(3000);
        driver.navigate().forward();
        //Thread.sleep(3000);
        driver.navigate().refresh();
        driver.findElement(By.id("list-view")).click();
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        action = new Actions(driver);
        driver.findElement(By.xpath("//*[@id=\"products\"]/div/div[1]/div[1]/div/div[2]/div[3]/div[1]/a/span")).click();
        //Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(5000);
    }
}
