package org.example.utils;

import com.google.gson.Gson;
import org.example.models.Vehicle;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class VehicleUtil {

    public static List<Vehicle> getVehicles() {
        Gson gson = new Gson();
        ClassLoader classLoader = gson.getClass().getClassLoader();
        InputStreamReader reader = new InputStreamReader(
                Objects.requireNonNull(classLoader.getResourceAsStream("vehicles.json")));
        return Arrays.asList(gson.fromJson(reader, Vehicle[].class));
    }

}
