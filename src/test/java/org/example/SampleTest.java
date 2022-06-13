package org.example;

import org.example.configuration.ConfigurationModule;
import org.example.models.Vehicle;
import org.example.utils.VehicleUtil;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice(modules = ConfigurationModule.class)
public class SampleTest extends BaseTest {

    @Test
    public void cloneVehicleTest() {
        Vehicle vehicle = VehicleUtil.getVehicles().get(0);
        enterVehicleParameters(vehicle);
        vehiclePageService.selectVehicleColor(vehicle.getColor());
        vehiclePageService.cloneVehicleWithColor();
        vehiclePageVerification.checkClonedVehicleSection(vehicle);
    }

    @Test
    public void cloneVehicleAndChangeModelTest() {
        Vehicle vehicle = VehicleUtil.getVehicles().get(0);
        enterVehicleParameters(vehicle);
        String mazdaModel = "Mazda";
        vehiclePageService.selectVehicleModel(mazdaModel);
        vehicle.setModel(mazdaModel);
        vehiclePageService.selectVehicleColor(vehicle.getColor());
        vehiclePageService.cloneVehicleWithColor();
        vehiclePageVerification.checkClonedVehicleSection(vehicle);
    }
}
