package com.sedc.selenium.demosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class InteractionsPage {
    By clickSortable = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[1]/span");
    By moveOneList = By.cssSelector("#demo-tabpane-list > div > div");
    By clickGrid = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[2]");
    By moveOneGrid = By.cssSelector("#demo-tabpane-grid > div > div > div");
    By clickResizable = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[3]/span");
    By resize = By.cssSelector("#resizableBoxWithRestriction > span");
    By clickDropable = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[4]/span");
    By willRevert = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div[1]/div[1]");
    By notRevert = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div[1]/div[2]");
    By dropHere = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[4]/div/div[2]");
    By revertDragable = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[4]");
    By dragMe = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[1]");
    By dropHereSimple = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[1]/div/div[2]");
    By clickAccept = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[2]");
    By acceptable = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[1]");
    By notAcceptable = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[1]/div[2]");
    By dropHereAccept = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[2]/div/div[2]");
    By clickPreventPropogation = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[3]");
    By dragMePrevent = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[1]");
    By outerDropable = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div[1]");
    By innerDropable = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div/div[3]/div/div[2]/div[2]/div");
    By clickSelectable = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[5]/div/ul/li[2]");
    By listSelectable = By.cssSelector("#verticalListContainer > li");
    By gridSelectable = By.cssSelector("#demo-tabpane-grid li");
    By clickGridSelectable = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/nav/a[2]");


    private WebDriver driver;
    private WebDriverWait wait;
    Actions action;

    public InteractionsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clickSortable() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        driver.findElement(clickSortable).click();
       // wait.until(ExpectedConditions.elementToBeClickable(clickSortable)).click();
    }

    public void moveOneList() {
        List<WebElement> list = driver.findElements(moveOneList);
        WebElement target = list.get(0);
        WebElement destination = list.get(4);
        action.click(target).clickAndHold().moveToElement(destination).moveByOffset(0, 10).release().build().perform();
    }

    public void clickGrid() {
        driver.findElement(clickGrid).click();
    }

    public void moveOneGrid() {
        List<WebElement> list = driver.findElements(moveOneGrid);
        WebElement target = list.get(0);
        WebElement destination = list.get(6);
        action.click(target).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();

    }

    public void clickResizable() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        driver.findElement(clickResizable).click();
    }

    public void resizeMin() {
        WebElement resizeElement = driver.findElement(resize);
        action.dragAndDropBy(resizeElement, -50, -50).perform();
    }

    public void resizeMax() {
        WebElement resizeElement = driver.findElement(resize);
        action.dragAndDropBy(resizeElement, 350, 150).perform();
    }

    public void clickDropable() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        driver.findElement(clickDropable).click();
    }

    public void revertDragable() throws InterruptedException {
        driver.findElement(revertDragable).click();
        WebElement target = driver.findElement(willRevert);
        WebElement target2 = driver.findElement(notRevert);
        WebElement destination = driver.findElement(dropHere);
        action.click(target).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();
        Thread.sleep(3000);
        action.click(target2).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();

    }

    public void simpleDrag() throws InterruptedException {
        WebElement target = driver.findElement(dragMe);
        WebElement destination = driver.findElement(dropHereSimple);
        action.click(target).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();
        Thread.sleep(2000);

    }
    public void acceptDrag() throws InterruptedException {
        driver.findElement(clickAccept).click();
        WebElement target = driver.findElement(acceptable);
        WebElement target2 = driver.findElement(notAcceptable);
        WebElement destination = driver.findElement(dropHereAccept);
        action.click(target).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();
        Thread.sleep(3000);
        action.click(target2).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();
        Thread.sleep(2000);

    }
    public void preventPropagation() throws InterruptedException {
        driver.findElement(clickPreventPropogation).click();
        WebElement target = driver.findElement(dragMePrevent);
        WebElement destination = driver.findElement(outerDropable);
        WebElement destination2 = driver.findElement(innerDropable);
        action.click(target).clickAndHold().moveToElement(destination).moveByOffset(10, 0).release().build().perform();
        Thread.sleep(3000);
        action.click(target).clickAndHold().moveToElement(destination2).moveByOffset(10, 0).release().build().perform();
        Thread.sleep(2000);

    }
    public void selectableList() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        driver.findElement(clickSelectable).click();
        List<WebElement> list = driver.findElements(listSelectable);
        list.forEach(WebElement::click);
        Thread.sleep(3000);
        driver.findElement(clickGridSelectable).click();
        List<WebElement> grid = driver.findElements(gridSelectable);
        grid.forEach(WebElement::click);
    }
}
