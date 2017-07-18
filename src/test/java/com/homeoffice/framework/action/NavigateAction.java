package com.homeoffice.framework.action;


import com.homeoffice.framework.core.Browser;

public class NavigateAction {

    private String url;
    private boolean ignoreCase;

    public NavigateAction(Builder builder){
        this.url = builder.url;
        this.ignoreCase = builder.ignoreCase;
    }

    public void perform(){
        Browser.getBrowser().navigate().to(url);
    }

    public static class Builder{
        private String url;
        private boolean ignoreCase;

        public Builder url(String url){
            this.url = url;
            return this;
        }

        public Builder ignoreCase(Boolean ignoreCase){
            this.ignoreCase = ignoreCase;
            return this;

        }

        public NavigateAction build(){
            return new NavigateAction(this);
        }

    }
}
