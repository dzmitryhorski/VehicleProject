package org.example.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class VehiclePage extends BasePage {

    @FindBy(id = "vehicle-data-title")
    private WebElement vehicleDataTitle;

    @FindBy(id = "vehicle-name-input")
    private WebElement vehicleNameInputField;

    @FindBy(id = "vehicle-model-dropdown")
    private WebElement vehicleModelDropdown;

    @FindBy(id = "vehicle-year-input")
    private WebElement vehicleYearInputField;

    @FindBy(id = "vehicle-color-dropdown")
    private WebElement vehicleColorDropdown;

    @FindBy(id = "clone-btn")
    private WebElement cloneVehicleWithColorButton;

    @FindBy(id = "cloned-vehicle")
    private WebElement clonedVehicleSection;

    @FindBy(id = "cloned-vehicle-title")
    private WebElement clonedVehicleTitleLabel;

    @FindBy(id = "cloned-vehicle-name-label")
    private WebElement clonedVehicleNameLabel;

    @FindBy(id = "cloned-vehicle-name-input")
    private WebElement clonedVehicleNameInputField;

    @FindBy(id = "cloned-vehicle-model-label")
    private WebElement clonedVehicleModelLabel;

    @FindBy(id = "cloned-vehicle-model-dropdown")
    private WebElement clonedVehicleModelDropdown;

    @FindBy(id = "cloned-vehicle-color-label")
    private WebElement clonedVehicleColorLabel;

    @FindBy(id = "cloned-vehicle-color-input")
    private WebElement clonedVehicleColorInputField;

    @FindBy(id = "cloned-vehicle-year-label")
    private WebElement clonedVehicleYearLabel;

    @FindBy(id = "cloned-vehicle-year-input")
    private WebElement clonedVehicleYearInputField;

    public WebElement getVehicleDataTitle() {
        return vehicleDataTitle;
    }

    public WebElement getVehicleNameInputField() {
        return vehicleNameInputField;
    }

    public Select getVehicleModelDropdown() {
        return new Select(vehicleModelDropdown);
    }

    public WebElement getVehicleYearInputField() {
        return vehicleYearInputField;
    }

    public Select getVehicleColorDropdown() {
        return new Select(vehicleColorDropdown);
    }

    public WebElement getCloneVehicleWithColorButton() {
        return cloneVehicleWithColorButton;
    }

    public WebElement getClonedVehicleSection() {
        return clonedVehicleSection;
    }

    public WebElement getClonedVehicleTitleLabel() {
        return clonedVehicleTitleLabel;
    }

    public WebElement getClonedVehicleNameLabel() {
        return clonedVehicleNameLabel;
    }

    public WebElement getClonedVehicleNameInputField() {
        return clonedVehicleNameInputField;
    }

    public WebElement getClonedVehicleModelLabel() {
        return clonedVehicleModelLabel;
    }

    public Select getClonedVehicleModelDropdown() {
        return new Select(clonedVehicleModelDropdown);
    }

    public WebElement getClonedVehicleColorLabel() {
        return clonedVehicleColorLabel;
    }

    public WebElement getClonedVehicleColorInputField() {
        return clonedVehicleColorInputField;
    }

    public WebElement getClonedVehicleYearLabel() {
        return clonedVehicleYearLabel;
    }

    public WebElement getClonedVehicleYearInputField() {
        return clonedVehicleYearInputField;
    }
}
