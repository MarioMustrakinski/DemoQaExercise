package com.sedc.selenium.demosite.util;

import com.sedc.selenium.demosite.pages.ElementsPage;
import com.sedc.selenium.demosite.pages.FormsPage;
import com.sedc.selenium.demosite.pages.InteractionsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Global {
    public static final int TIMEOUT = 20;
    public WebDriver driver;
    public WebDriverWait wait;
    public ElementsPage elementsPage;
    public FormsPage formsPage;
    public InteractionsPage interactionsPage;

    public void navigateTo(String url){
        driver.get(url);
    }
    @BeforeMethod
    public void setup(){
        String downloadFilePath = "D:\\Users\\User\\Desktop\\SEAVUS";
        System.setProperty("webdriver.chrome.driver","src/test/recources/chromedriver.exe");
        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", downloadFilePath);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        DesiredCapabilities cap = DesiredCapabilities.chrome();
        cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        cap.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(cap);
        wait = new WebDriverWait(driver,TIMEOUT);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        elementsPage = new ElementsPage(driver,wait);
        formsPage = new FormsPage(driver,wait);
        interactionsPage = new InteractionsPage(driver,wait);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
