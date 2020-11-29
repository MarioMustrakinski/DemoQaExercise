package com.sedc.selenium.demosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.DoubleClickAction;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;

public class ElementsPage {
    By clickTextBox = By.id("item-0");
    By fullName = By.id("userName");
    By email = By.id("userEmail");
    By currentAddress = By.id("currentAddress");
    By permanentAddress = By.id("permanentAddress");
    By submit = By.id("submit");
    By resultName = By.id("name");

    By clickCheckBox = By.id("item-1");
    By clickExpand = By.className("rct-collapse-btn");
    By clickDesktopExpand = By.className("rct-icon-expand-close");
    By clickCheckBoxNotes = By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/ol/li[1]/span/label/span[1]");

    By clickRadioButton = By.id("item-2");
    By clickImpressiveRadioButton = By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[1]/div[3]/label");

    By clickWebTables = By.id("item-3");
    By clickWebTables1 = By.cssSelector("ul.menu-list>li:nth-of-type(4)");
    By clickAdd = By.id("addNewRecordButton");
    By enterFirstName = By.id("firstName");
    By enterLastName = By.id("lastName");
    //By enterEmail = By.id("userEmail");
    By enterAge = By.id("age");
    By enterSalary = By.id("salary");
    By enterDepartment = By.id("department");
    By submit2 = By.xpath("//*[@id=\"submit\"]");

    By uploadDownload = By.id("item-7");
    By upload = By.id("uploadFile");
    By download = By.id("downloadButton");

    By clickOnButtons = By.id("item-4");
    By doubleClick = By.id("doubleClickBtn");
    By rightClick = By.id("rightClickBtn");
    By clickMe = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/div[3]/button");

    By clickDynamicProperties = By.id("item-8");
    By clickVisibleAfter = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/button[3]");


    private WebDriver driver;
    private WebDriverWait wait;
    Actions action;

    public ElementsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public ElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clickOnTextBox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickTextBox)).click();
    }

    public void enterFullName(String fullName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.fullName)).sendKeys(fullName);

    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.email)).sendKeys(email);
    }

    public void enterCurrentAddress(String address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.currentAddress)).sendKeys(address);

    }

    public void enterPermanentAddress(String permanentAddress) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.permanentAddress)).sendKeys(permanentAddress);

    }

    public void clickSubmit() {
        wait.until(ExpectedConditions.elementToBeClickable(this.submit)).sendKeys("");
        wait.until(ExpectedConditions.elementToBeClickable(this.submit)).click();
    }

    public void checkName(String name) {
        Assert.assertEquals(driver.findElement(resultName).getText(), "Name:" + name);
    }

    public void clickCheckBox() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickCheckBox)).click();
    }

    public void clickExpand() {
        //driver.findElement(clickExpand).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.clickExpand)).click();
    }

    public void ClickDesktopExpand() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickDesktopExpand)).click();
    }

    public void clickCheckBoxNotes() {
        wait.until(ExpectedConditions.elementToBeClickable(clickCheckBoxNotes)).click();
    }

    public void clickRadioButton() {
        wait.until(ExpectedConditions.elementToBeClickable(clickRadioButton)).click();

    }

    public void clickImpressiveRadioButton() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickImpressiveRadioButton)).click();
    }

    public void clickWebTables() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(clickWebTables)).sendKeys("");
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickWebTables1)).click();
        //driver.get("https://demoqa.com/webtables");
    }

    public void clickAdd() {

        wait.until(ExpectedConditions.elementToBeClickable(clickAdd)).click();
    }

    public void enterFirstName(String firstName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterFirstName)).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterLastName)).sendKeys(lastName);
    }

    public void email(String enterEmail) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(email)).sendKeys(enterEmail);
    }

    public void enterAge(String age) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterAge)).sendKeys(age);
    }

    public void enterSalary(String salary) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterSalary)).sendKeys(salary);
    }

    public void enterDepartment(String department) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(enterDepartment)).sendKeys(department);
    }

    public void submit2() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit2)).click();
    }

    public void delete() {
        driver.findElement(By.id("delete-record-4")).click();
    }


    public void clickUploadDownload() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(uploadDownload)).click();
    }

    public void uploadFile() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(upload)).sendKeys("D:\\SEAVUS\\Pairwise (1).xlsx");
    }

    public void downloadFile() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(download)).click();
    }

    public boolean isFileDownloaded(String downloadPath, String fileName) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                System.out.println("It exists");
                dirContents[i].delete();
                return true;
            }

        }
        return false;
    }

    public boolean isFileDownloaded(String downloadPath) {
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();
        String fileName = driver.findElement(download).getAttribute("download");
        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().equals(fileName)) {
                System.out.println("It exists");
                dirContents[i].delete();
                return true;
            }

        }
        return false;
    }

    public void clickOnButtons() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickOnButtons)).click();
    }

    public void doubleClick() {
        action = new Actions(driver);
        action.moveToElement(driver.findElement(doubleClick)).doubleClick().build().perform();
    }
    public void rightClick(){
        action = new Actions(driver);
        action.moveToElement(driver.findElement(rightClick)).contextClick().build().perform();
    }
    public void clickMe(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickMe)).click();
    }

    public void clickDynamicProperties() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        driver.findElement(clickDynamicProperties).click();

    }
    public void clickVisibleAfter(){
        wait.until(ExpectedConditions.elementToBeClickable(clickVisibleAfter)).click();
    }



}
