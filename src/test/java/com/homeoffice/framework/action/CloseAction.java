package com.homeoffice.framework.action;


import com.homeoffice.framework.core.Browser;

public class CloseAction {

    public static void perform(){
        Browser.getBrowser().close();
    }


}
