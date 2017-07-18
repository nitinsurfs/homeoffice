package com.homeoffice.framework.action;

import com.homeoffice.framework.core.Browser;
import com.homeoffice.framework.core.ScreenElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

/**
 * Created by nitinm on 18/07/2017.
 */
public class VerifyTextAction {
    private ScreenElement screenElement;
    private String textToVerify;


    public VerifyTextAction(Builder builder){
        this.screenElement = builder.screenElement;
        this.textToVerify = builder.textToVerify;
    }
    public ExpectedCondition<WebElement> visibilityOfElementLocated(final By by) {
        return new ExpectedCondition<WebElement>() {
            public WebElement apply(WebDriver driver) {
                WebElement element = Browser.getBrowser().findElement(by);
                return element.isDisplayed() ? element : null;
            }
        };
    }
    public void perform() throws InterruptedException {
//        Browser.getBrowser().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Wait<WebDriver> wait = new WebDriverWait(Browser.getBrowser(), 90);
        wait.until(visibilityOfElementLocated(screenElement.getElement()));
        String actualText = Browser.getBrowser().findElement(screenElement.getElement()).getText();
        //remove below comment once data creation is done
        Assert.assertTrue("The expected result was - "+textToVerify+" - But the actual result was - "+actualText, actualText.equals(textToVerify));
//        Browser.getBrowser().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    public static class Builder{
        private ScreenElement screenElement;
        private String textToVerify;

        public Builder screenElement(ScreenElement screenElement){
            this.screenElement = screenElement;
            return this;
        }

        public Builder textToVerify(String textToVerify){
            this.textToVerify = textToVerify;
            return this;
        }
        public VerifyTextAction build(){
            return new VerifyTextAction(this);
        }
    }
}
