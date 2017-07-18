package com.homeoffice.framework.action;


import com.homeoffice.framework.core.Browser;
import com.homeoffice.framework.core.ScreenElement;

public class FillAction {

    private String text;
    private ScreenElement screenElement;

    public FillAction(Builder builder){
        this.text = builder.text;
        this.screenElement = builder.screenElement;
    }

    public void perform(){
        Browser.getBrowser().findElement(screenElement.getElement()).sendKeys(text);
    }

    public static class Builder{
        private String text;
        private ScreenElement screenElement;

        public Builder EnterText(String text){
            this.text = text;
            return this;
        }

        public Builder screenElement(ScreenElement screenElement){
            this.screenElement = screenElement;
            return this;
        }

        public FillAction build(){
            return new FillAction(this);
        }

    }
}
