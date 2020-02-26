package com.ss.ra.pageobjects;

import com.ss.ra.utilities.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public WebDriver ldriver;
    WaitUtils waitUtils;
    @FindBy(id = "Email")
    private WebElement email;
    @FindBy(id = "Password")
    private WebElement password;
    @FindBy(xpath = "//*[@value='Log in']")
    private WebElement login;

    public LoginPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
        waitUtils = new WaitUtils(ldriver);
    }

    public void setUsername(String uname) {
        waitUtils.waitForElement(email, 20);
        email.clear();
        email.sendKeys(uname);
    }

    public void setPassword(String pass) {
        waitUtils.waitForElement(password, 20);
        password.clear();
        password.sendKeys(pass);
    }

    public void clickLogin() {
        waitUtils.waitForElement(login, 20);
        login.click();
    }
}
