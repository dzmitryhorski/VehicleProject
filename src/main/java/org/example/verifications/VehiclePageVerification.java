package org.example.verifications;

import org.example.models.Vehicle;
import org.example.pages.VehiclePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehiclePageVerification extends BaseVerification {

    public void checkClonedVehicleSection(Vehicle vehicle) {
        checkClonedVehicleTitle();
        checkClonedVehicleNameLabel();
        checkClonedVehicleName(vehicle.getName());
        checkClonedVehicleModelLabel();
        checkClonedVehicleModel(vehicle.getModel());
        checkClonedVehicleColorLabel();
        checkClonedVehicleColor(vehicle.getColor());
        checkClonedVehicleYearLabel();
        checkClonedVehicleYear(vehicle.getYear());
    }

    private void checkClonedVehicleTitle() {
        String expectedClonedVehicleTitle = "Cloned Vehicle";
        WebElement clonedVehicleTitle = new VehiclePage().getClonedVehicleTitleLabel();
        checkElementIsDisplayedWithText(clonedVehicleTitle, expectedClonedVehicleTitle);
    }

    private void checkClonedVehicleNameLabel() {
        WebElement clonedVehicleNameLabel = new VehiclePage().getClonedVehicleNameLabel();
        String actualNameLabel = "Name";
        checkElementIsDisplayedWithText(clonedVehicleNameLabel, actualNameLabel);
    }

    private void checkClonedVehicleName(String expectedName) {
        WebElement clonedVehicleNameInputField = new VehiclePage().getClonedVehicleNameInputField();
        checkInputFieldIsDisplayedWithText(clonedVehicleNameInputField, expectedName);
    }

    private void checkClonedVehicleModelLabel() {
        WebElement clonedVehicleModelLabel = new VehiclePage().getClonedVehicleModelLabel();
        String actualModelLabel = "Model";
        checkElementIsDisplayedWithText(clonedVehicleModelLabel, actualModelLabel);
    }

    private void checkClonedVehicleModel(String expectedModel) {
        Select clonedVehicleModelDropdown = new VehiclePage().getClonedVehicleModelDropdown();
        checkDropdownIsEnabledWithOption(clonedVehicleModelDropdown, false, expectedModel);
    }

    private void checkClonedVehicleColorLabel() {
        WebElement clonedVehicleColorLabel = new VehiclePage().getClonedVehicleColorLabel();
        String actualColorLabel = "Color";
        checkElementIsDisplayedWithText(clonedVehicleColorLabel, actualColorLabel);
    }

    private void checkClonedVehicleColor(String expectedColor) {
        WebElement clonedVehicleColorInputField = new VehiclePage().getClonedVehicleColorInputField();
        checkInputFieldIsDisplayedWithText(clonedVehicleColorInputField, expectedColor);
    }

    private void checkClonedVehicleYearLabel() {
        WebElement clonedVehicleYearLabelLabel = new VehiclePage().getClonedVehicleYearLabel();
        String actualYearLabel = "Year";
        checkElementIsDisplayedWithText(clonedVehicleYearLabelLabel, actualYearLabel);
    }

    private void checkClonedVehicleYear(String expectedYear) {
        WebElement clonedVehicleYearInputField = new VehiclePage().getClonedVehicleYearInputField();
        checkInputFieldIsDisplayedWithText(clonedVehicleYearInputField, expectedYear);
    }

}
