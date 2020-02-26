package com.ss.ra.stepdefinitions;

import com.ss.ra.pageobjects.LoginPage;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass {

    public static Logger logger;
    public WebDriver driver;
    public LoginPage loginPage;
    public Properties configProp;

}
