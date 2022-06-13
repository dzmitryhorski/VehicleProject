package org.example.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.example.enums.TimeOut.ONE_SEC;
import static org.example.enums.TimeOut.THIRTY_SEC;

public class WebDriverProvider {

    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            driver.set(new ChromeDriver());
            driver.get().manage().window().maximize();
            driver.get().manage().timeouts().implicitlyWait(ONE_SEC.getDuration());
            driver.get().manage().timeouts().pageLoadTimeout(THIRTY_SEC.getDuration());
        }
        return driver.get();
    }

    public static void killDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.set(null);
        }
    }

}
