package com.homeoffice.stepdefinitions;

import cucumber.api.java.en.Given;
import com.homeoffice.framework.action.CloseAction;
import com.homeoffice.framework.action.NavigateAction;

public class navigationSteps {
    @Given("^I navigate to dvla page$")
    public void i_navigate_to_vehicle_and_driver_info_page() throws Throwable {
        new NavigateAction.Builder().url("https://www.gov.uk/get-vehicle-information-from-dvla").build().perform();
    }


//    @After
    public static void closeBrowser() throws InterruptedException {
        CloseAction.perform();
    }
}
