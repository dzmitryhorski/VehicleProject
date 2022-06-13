package org.example.services;

import org.example.pages.VehiclePage;
import org.example.utils.WaitUtil;
import org.openqa.selenium.WebElement;

import static org.example.enums.TimeOut.FIVE_SEC;

public class VehiclePageService {

    public void enterVehicleName(String vehicleName) {
        new VehiclePage().getVehicleNameInputField().sendKeys(vehicleName);
    }

    public void selectVehicleModel(String vehicleModel) {
        new VehiclePage().getVehicleModelDropdown().selectByValue(vehicleModel);
    }

    public void enterVehicleYear(String vehicleYear) {
        new VehiclePage().getVehicleYearInputField().sendKeys(vehicleYear);
    }

    public void selectVehicleColor(String vehicleColor) {
        new VehiclePage().getVehicleColorDropdown().selectByValue(vehicleColor);
    }

    public void cloneVehicleWithColor() {
        new VehiclePage().getCloneVehicleWithColorButton().click();
        WebElement clonedVehicleSection = new VehiclePage().getClonedVehicleSection();
        WaitUtil.waitForElementToBeVisible(clonedVehicleSection, FIVE_SEC);
    }

}
