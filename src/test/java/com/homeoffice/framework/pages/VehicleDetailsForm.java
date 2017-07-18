package com.homeoffice.framework.pages;

import com.homeoffice.framework.core.ScreenElement;
import org.openqa.selenium.By;

/**
 * Created by nitinm on 18/07/2017.
 */
public class VehicleDetailsForm {
public static ScreenElement registrationNumInput = new ScreenElement() {
    @Override
    public By getElement() {
        return By.id("Vrm");
    }
};

public static ScreenElement continueButton = new ScreenElement() {
    @Override
    public By getElement() {
        return By.name("Continue");
    }
};
}
