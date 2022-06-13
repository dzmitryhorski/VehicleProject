package org.example.configuration;

import com.google.inject.AbstractModule;
import org.example.services.VehiclePageService;
import org.example.verifications.VehiclePageVerification;


public class ConfigurationModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(VehiclePageService.class).asEagerSingleton();
        bind(VehiclePageVerification.class).asEagerSingleton();
    }

}
