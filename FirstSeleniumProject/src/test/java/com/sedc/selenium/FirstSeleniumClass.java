package com.sedc.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstSeleniumClass {
    WebDriver driver;
    By logInButton = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    By searchField = By.className("search_query");
    By searchButton = By.className("button-search");
    By productList = By.cssSelector("ul.product_list>li");
    WebDriverWait wait;


    @BeforeMethod
    public void start() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\FirstSeleniumProject\\src\\test\\recources\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 20);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void test1() throws InterruptedException {
        System.out.println("Test1");

        /*WebDriver driver;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\IdeaProjects\\FirstSeleniumProject\\src\\test\\recources\\chromedriver.exe");

         */
        //driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        TimeUnit.SECONDS.sleep(5);
        // driver.quit();


    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        if (driver.findElements(By.id("contact-link")).size() > 0) {
            System.out.println("elementot e najden");
            driver.findElement(By.id("contact-link")).click();
        } else {
            System.out.println("elementot ne e najden");
        }
        TimeUnit.SECONDS.sleep(2);
        driver.findElement(By.name("search_query")).sendKeys("shirt");
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.className("button-search")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElements(By.tagName("div"));
        TimeUnit.SECONDS.sleep(5);
        /*List<WebElement> list= driver.findElements(By.tagName("a"));
        for (WebElement i: list) {
            System.out.println(i.getAttribute("href"));
        }

         */


    }

    @Test
    public void test3() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.name("email_create")).sendKeys("stodvesta@gmail.com");
        TimeUnit.SECONDS.sleep(10);
        driver.findElement(By.name("SubmitCreate")).click();
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("id_gender1")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Acko");
        driver.findElement(By.id("customer_lastname")).sendKeys("Od Gradsko");
        driver.findElement(By.id("passwd")).sendKeys("123456789");
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("days")).sendKeys("26");
        driver.findElement(By.id("months")).sendKeys("may");
        driver.findElement(By.id("years")).sendKeys("1991");
        TimeUnit.SECONDS.sleep(10);


    }

    @Test
    public void test4() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.linkText("Contact us")).getAttribute("href"));
        System.out.println(driver.findElement(By.linkText("Contact us")).getAttribute("Title"));
        //driver.findElement(By.linkText("Contact us")).click();
        //driver.findElement(By.partialLinkText("us")).click();

        // driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("dress");

        //driver.findElement(By.cssSelector("input.search_query")).sendKeys("es");

        //driver.findElement(By.cssSelector("input[name=search_query]")).sendKeys("muahahah");
        // driver.findElement(By.cssSelector("input[placeholder=Search][name=search_query")).sendKeys(" AND");
        // driver.findElement(By.cssSelector("input[placeholder=Search],[name=search_query")).sendKeys(" OR");

        // driver.findElement(By.cssSelector("input.search_query[name=search_query]")).sendKeys(" Class&Atribute");
        // driver.findElement(By.cssSelector("input#search_query_top[name=search_query]")).sendKeys(" ID&Atribute");

        driver.findElement(By.cssSelector("input[id^=search]")).sendKeys(" ^^^");
        driver.findElement(By.cssSelector("input[id$=top")).sendKeys(" $$$");
        driver.findElement(By.cssSelector("input[id*=query")).sendKeys(" ***");
        driver.findElement(By.cssSelector("ul.sf-menu>li:nth-of-type(1)")).click();
        TimeUnit.SECONDS.sleep(5);
        //driver.findElement(By.cssSelector("ul.sf-menu>li:nth-of-type(2)")).click();
        //TimeUnit.SECONDS.sleep(5);
        //driver.findElement(By.cssSelector("ul.sf-menu>li:nth-of-type(3)")).click();
        driver.findElement(By.cssSelector("ul.sf-menu>li:last-child")).click();
        TimeUnit.SECONDS.sleep(5);


    }

    @Test
    public void test5() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php?id_product=1&controller=product");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("select.attribute_select option:last-child")).click();
        TimeUnit.SECONDS.sleep(5);
    }

    @Test
    public void test6() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.className("search_query")).sendKeys("dress");
        driver.findElement(By.className("button-search")).click();
        List<WebElement> lista = driver.findElements(By.cssSelector("ul.product_list>li"));
        System.out.println(lista.size());
        driver.findElement(By.cssSelector("ul.product_list>li:nth-of-type(3)")).click();
        TimeUnit.SECONDS.sleep(4);
    }

    @Test
    public void test7() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();
        driver.findElement(By.xpath("//input[contains(@class,'form-control ac_input')]")).sendKeys("dress");
        driver.findElement(By.xpath("//input[@name='search_query' or @id= 'search_query_top']")).sendKeys(" or shirt");
        driver.findElement(By.xpath("//input[@name='search_query' and @id= 'search_query_top']")).sendKeys(" and pants");
        driver.findElement(By.xpath("//input[starts-with(@id, 'search')]")).sendKeys(" starts with");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[text()='Contact us']")).click();

        TimeUnit.SECONDS.sleep(5);


    }

    @Test
    public void test8() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys("dress");
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchButton)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
        Thread.sleep(3000);


    }

}
