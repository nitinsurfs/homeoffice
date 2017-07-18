package com.homeoffice.framework.pages;

import com.homeoffice.framework.core.ScreenElement;
import org.openqa.selenium.By;

/**
 * Created by nitinm on 18/07/2017.
 */
public class ConfirmVehicleDetails {
    public static ScreenElement vehicleRegNum = new ScreenElement() {
        @Override
        public By getElement() {
            return By.className("reg-mark");
        }
    };

    public static ScreenElement vehicleMake = new ScreenElement() {
        @Override
        public By getElement() {
            return By.xpath("//ul/li[2]/span[2]/strong");
        }
    };

    public static ScreenElement vehicleColour = new ScreenElement() {
        @Override
        public By getElement() {
            return By.xpath("//ul/li[3]/span[2]/strong");
        }
    };
}
