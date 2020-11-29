package com.sedc.selenium.demosite.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormsPage {
    By practiceForm = By.xpath("/html/body/div/div/div/div[2]/div[1]/div/div/div[2]/div");
    By firstName = By.id("firstName");
    By lastName = By.id("lastName");
    By email = By.id("userEmail");
    By gender = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[3]/div[2]/div[1]/label");
    By mobileNumber = By.id("userNumber");
    By dateOfBirth = By.id("dateOfBirthInput");
    By hobbies = By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[7]/div[2]/div[3]/label");
    By upload = By.id("uploadPicture");
    By currentAddress = By.id("currentAddress");
    By selectState = By.xpath("//*[@id=\"state\"]/div/div[1]/div[1]");
    By selectCity = By.xpath("//*[@id=\"stateCity-wrapper\"]/div[3]");
    By submit = By.xpath("//*[@id=\"submit\"]");



    private WebDriver driver;
    private WebDriverWait wait;
    Actions action;

    public FormsPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void navigateTo(String url) {
        driver.get(url);
    }
    public void practiceForm(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(practiceForm)).click();
    }
    public void enterFirstName(String firstName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.firstName)).sendKeys(firstName);
    }
    public void enterLastName(String lastName){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.lastName)).sendKeys(lastName);
    }
    public void enterEmail(String email){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.email)).sendKeys(email);
    }
    public void gender(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(gender)).click();
    }
    public void enterMobileNumber(String mobileNumber){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.mobileNumber)).sendKeys(mobileNumber);
    }
    public void dateOfBirth(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.dateOfBirth)).sendKeys(Keys.ENTER);

    }
    public void hobbies() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(hobbies)).click();
    }
    public void upload(){
        action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(upload)).sendKeys("D:\\SEAVUS\\Pairwise (1).xlsx");

    }
    public void currentAddress(String address){
        driver.findElement(currentAddress).sendKeys(address);
    }
    //public void stateAndCity() throws InterruptedException {
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div"))).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[2]/div/div[2]/div/div[2]"))).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div"))).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/div/div[2]/div[2]/div[1]/form/div[10]/div[3]/div/div[2]/div/div[2]"))).click();
   // }
    public void selectState() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(selectState)).click();
        action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(500);

    }
    public void selectCity() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(selectCity)).click();
        action = new Actions(driver);
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(500);

    }

    public void submit() throws InterruptedException {
        action = new Actions(driver);
        action.sendKeys(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
    }


}
