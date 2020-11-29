package com.sedc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework1 {
    WebDriver driver;

    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\FirstSeleniumProject\\src\\test\\recources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void homework() throws InterruptedException {
        driver.findElement(By.id("firstName")).sendKeys("Mario");
        driver.findElement(By.name("lastName")).sendKeys("Mustrakinski");
        driver.findElement(By.className("whsOnd")).sendKeys("MM");
        TimeUnit.SECONDS.sleep(15);

    }

}

