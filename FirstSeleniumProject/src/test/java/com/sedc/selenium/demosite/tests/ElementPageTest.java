package com.sedc.selenium.demosite.tests;

import com.sedc.selenium.demosite.util.Global;
import org.testng.annotations.Test;

import java.io.File;

public class ElementPageTest extends Global {
    String url = "https://demoqa.com/elements";
    String name = "Mario";
    String email = "dvestatrista@gmail.com";
    String currentAddress = "Kaj Branana 2";
    String permanentAddress = "Kaj Branana 2";
    String firstName = "Acko";
    String lastName = "Od Gradsko";
    String age = "30";
    String salary = "1000";
    String department = "Rosoman";
    String email1 = "dvestatrista@gmail.com";
    String downloadPath = "D:\\Users\\User\\Desktop\\SEAVUS";
    String fileName = "sampleFile.jpeg";

    @Test
    public void textBox() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickOnTextBox();
        elementsPage.enterFullName(name);
        elementsPage.enterEmail(email);
        elementsPage.enterCurrentAddress(currentAddress);
        elementsPage.enterPermanentAddress(permanentAddress);
        elementsPage.clickSubmit();
        elementsPage.checkName(name);
        Thread.sleep(4000);
    }

    @Test
    public void checkBox() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickCheckBox();
        elementsPage.clickExpand();
        elementsPage.ClickDesktopExpand();
        elementsPage.clickCheckBoxNotes();
        Thread.sleep(4000);
    }

    @Test
    public void radioButton() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickRadioButton();
        elementsPage.clickImpressiveRadioButton();
        Thread.sleep(5000);
    }

    @Test
    public void webTables() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickWebTables();
        elementsPage.clickAdd();
        elementsPage.enterFirstName(firstName);
        elementsPage.enterLastName(lastName);
        elementsPage.enterEmail(email);
        elementsPage.enterAge(age);
        elementsPage.enterSalary(salary);
        elementsPage.enterDepartment(department);
        elementsPage.submit2();
        Thread.sleep(5000);
        elementsPage.delete();
        Thread.sleep(5000);
    }

    @Test
    public void uploadDownload() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickUploadDownload();
        elementsPage.uploadFile();

        Thread.sleep(5000);
    }

    @Test
    public void uploadDownload1() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickUploadDownload();
        elementsPage.downloadFile();
        Thread.sleep(5000);
        elementsPage.isFileDownloaded(downloadPath, fileName);
        elementsPage.isFileDownloaded(downloadPath);


    }

    @Test
    public void buttons() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickOnButtons();
        elementsPage.doubleClick();
        elementsPage.rightClick();
        elementsPage.clickMe();
        Thread.sleep(5000);

    }

    @Test
    public void dynamicProperties() throws InterruptedException {
        elementsPage.navigateTo(url);
        elementsPage.clickDynamicProperties();
        elementsPage.clickVisibleAfter();
        Thread.sleep(5000);

    }




}
