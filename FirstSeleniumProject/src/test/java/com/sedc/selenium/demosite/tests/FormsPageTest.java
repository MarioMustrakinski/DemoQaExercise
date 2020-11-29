package com.sedc.selenium.demosite.tests;

import com.sedc.selenium.demosite.util.Global;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class FormsPageTest extends Global {
    String url = "https://demoqa.com/forms";
    String firstName = "Mario";
    String lastName = "Mustrakinski";
    String email = "alo@gmail.com";
    String mobileNumber = "38978388802";
    String dateOfBirth = "26 MAY 1991";
    String subject = "Kikiriki";
    String address = "Partizanska";

    @Test
    public void practiceForm() throws InterruptedException {
        formsPage.navigateTo(url);
        formsPage.practiceForm();
        formsPage.enterFirstName(firstName);
        formsPage.enterLastName(lastName);
        formsPage.enterEmail(email);
        formsPage.gender();
        formsPage.enterMobileNumber(mobileNumber);
        formsPage.dateOfBirth();
        formsPage.hobbies();
        formsPage.upload();
        formsPage.currentAddress(address);
        formsPage.selectState();
        formsPage.selectCity();
        formsPage.submit();


        Thread.sleep(15000);

    }
}
