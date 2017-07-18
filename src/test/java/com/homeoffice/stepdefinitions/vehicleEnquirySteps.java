package com.homeoffice.stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.homeoffice.framework.action.ClickAction;
import com.homeoffice.framework.action.FillAction;
import com.homeoffice.framework.action.VerifyTextAction;
import com.homeoffice.framework.pages.ConfirmVehicleDetails;
import com.homeoffice.framework.pages.GetVehicleInformationFromDvla;
import com.homeoffice.framework.pages.VehicleDetailsForm;

import static com.homeoffice.stepdefinitions.commonSteps.v;


public class vehicleEnquirySteps {

    @When("^I start the process to get the vehicle info from DVLA$")
    public void i_start_the_process_to_get_the_vehicle_info_from_DVLA() throws Throwable {
        new ClickAction.Builder().screeenElement(GetVehicleInformationFromDvla.startNowButton).build().perform();

    }


    @When("^find the registration number of the vehicle$")
    public void find_the_registration_number_of_the_vehicle() throws Throwable {
        new FillAction.Builder().screenElement(VehicleDetailsForm.registrationNumInput).EnterText(v.vehicleNumber).build().perform();
        new ClickAction.Builder().screeenElement(VehicleDetailsForm.continueButton).build().perform();
    }

    @Then("^DVLA should return the correct vehicle details$")
    public void dvla_should_return_the_correct_vehicle_details() throws Throwable {
        new VerifyTextAction.Builder().screenElement(ConfirmVehicleDetails.vehicleRegNum).textToVerify(v.vehicleNumber).build().perform();
        new VerifyTextAction.Builder().screenElement(ConfirmVehicleDetails.vehicleMake).textToVerify(v.make).build().perform();
        new VerifyTextAction.Builder().screenElement(ConfirmVehicleDetails.vehicleColour).textToVerify(v.colour).build().perform();
    }


}
