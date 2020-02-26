package com.ss.ra.stepdefinitions;

import com.ss.ra.pageobjects.LoginPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class CoreStepDefinitions extends BaseClass {

    @Before
    public void setup() throws IOException {

        logger = Logger.getLogger(CoreStepDefinitions.class);
        PropertyConfigurator.configure("log4j.properties");

        configProp = new Properties();
        configProp.load(new FileInputStream("config.properties"));

        String brow = configProp.getProperty("browser");

        if (brow.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//main//resources//Drivers//chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("**********Chrome driver initiated**************");
        } else if (brow.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//main//resources//Drivers//geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("**********Firefox driver initiated**************");
        }
    }


    @Given("User launch chrome browser")
    public void i_launch_chrome_browser() {
        loginPage = new LoginPage(driver);

    }

    @When("User opens url (.*)")
    public void user_opens_url(String string) {

        String str = string.replaceAll("\"", "");
        driver.get(configProp.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        logger.info("**********URL launched***********");
    }

    @When("User enters email as (.*) and password as (.*)")
    public void user_enters_email_as_and_password_as(String name, String password) {
        name = name.replaceAll("\"", "");
        password = password.replaceAll("\"", "");
        loginPage.setUsername(name);
        loginPage.setPassword(password);
    }

    @When("User clicks on (.*)")
    public void user_clicks_on(String string) {
        loginPage.clickLogin();
        logger.info("********User logged in************");
    }

    @Then("Page title should be (.*)")
    public void page_title_should_be(String title) {
        Assert.assertEquals(driver.getTitle(), "Dashboard / nopCommerce administration");
    }


    @And("User close browser")
    public void i_close_browser() {
        driver.quit();
    }

    @When("User opens url")
    public void user_opens_url() {
        driver.get(configProp.getProperty("url"));
        logger.info("Fetched from Property file");
    }

    @When("User enters email and password")
    public void user_enters_email_and_password() {
        loginPage.setUsername(configProp.getProperty("username"));
        loginPage.setPassword(configProp.getProperty("password"));
    }


}
