package com.ss.ra.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMSteps {

    WebDriver driver;


    @When("I open Orange HRM homepage")
    public void i_open_Orange_HRM_homepage() {
        driver.get("https://www.orangehrm.com/");
    }

    @Then("I verify that the logo is present on page")
    public void i_verify_that_the_logo_is_present_on_page() {
        boolean flag = driver.findElement(By.xpath("//img[@alt='OrangeHRM Inc Logo']")).isDisplayed();
        Assert.assertTrue("Logo not present", flag);
    }

}