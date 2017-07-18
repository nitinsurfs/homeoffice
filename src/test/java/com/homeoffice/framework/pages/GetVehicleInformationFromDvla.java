package com.homeoffice.framework.pages;

import com.homeoffice.framework.core.ScreenElement;
import org.openqa.selenium.By;

public class GetVehicleInformationFromDvla {
    public static ScreenElement startNowButton = new ScreenElement() {
        public By getElement() {
            return By.cssSelector("a.button");
        }
    };


}
