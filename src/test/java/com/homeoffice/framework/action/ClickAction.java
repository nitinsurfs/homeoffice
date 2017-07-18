package com.homeoffice.framework.action;

import com.homeoffice.framework.core.Browser;
import com.homeoffice.framework.core.ScreenElement;

public class ClickAction {

    private ScreenElement screenElement;

    public ClickAction(Builder builder){
        this.screenElement = builder.screenElement;
    }

    public void perform(){

        Browser.getBrowser().findElement(screenElement.getElement()).click();
    }

    public static class Builder{
        private ScreenElement screenElement;

        public Builder screeenElement(ScreenElement screenElement){
            this.screenElement = screenElement;
            return this;
        }


        public ClickAction build(){
            return new ClickAction(this);
        }

    }
}
