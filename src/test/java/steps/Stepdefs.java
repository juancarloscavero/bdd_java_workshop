package steps;

import io.appium.java_client.AppiumSetting;
import page_objects.*;

import java.io.File;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.*;
import cucumber.api.java.en.*;

public  class Stepdefs {
    private AppiumDriver driver;

   @Before
    public void setUp() throws Exception {
        // set up appium

        File classpathRoot = new File(System.getProperty("user.dir"));
        File appDir = new File(classpathRoot, "apps");
        File app = new File(appDir, "Workshop.apk");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion", "5.0");
        capabilities.setCapability("app", app.getAbsolutePath());
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Given("^I am about to login$")
    public void I_am_about_to_login(){

        LoginPage page = new LoginPage(driver);
        page.enterCredentials();
    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }





    // workshop.LoginPage page (driver);
        // belly.eat(cukes);

}
