package com.homeoffice.framework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nitinm on 26/05/2017.
 */
public class Browser {
    private static WebDriver browser;
    private Browser() {}
    public static WebDriver getBrowser(){
        if(browser==null){
            System.setProperty("webdriver.gecko.driver", "/Users/nitinm/Downloads/geckodriver");
            browser=new FirefoxDriver();

        }
        return browser;
    }
}
