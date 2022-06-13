package org.example;

import com.google.inject.Inject;
import org.example.models.Vehicle;
import org.example.services.VehiclePageService;
import org.example.utils.WebDriverProvider;
import org.example.verifications.VehiclePageVerification;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @Inject
    protected VehiclePageService vehiclePageService;

    @Inject
    protected VehiclePageVerification vehiclePageVerification;

    private static final String baseUrl = "some string";

    @BeforeClass(alwaysRun = true)
    public void init() {
        WebDriverProvider.getDriver().get(baseUrl);
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        WebDriverProvider.killDriver();
    }

    protected void enterVehicleParameters(Vehicle vehicle) {
        vehiclePageService.enterVehicleName(vehicle.getName());
        vehiclePageService.selectVehicleModel(vehicle.getModel());
        vehiclePageService.enterVehicleYear(vehicle.getYear());
    }

}
