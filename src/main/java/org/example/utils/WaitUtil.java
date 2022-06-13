package org.example.utils;

import org.example.enums.TimeOut;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {

    public static void waitForElementToBeVisible(WebElement element, TimeOut timeout) {
        WebDriverWait wait = new WebDriverWait(WebDriverProvider.getDriver(), timeout.getDuration());
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
