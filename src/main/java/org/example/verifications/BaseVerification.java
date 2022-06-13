package org.example.verifications;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BaseVerification {

    protected void checkElementIsDisplayed(WebElement element) {
        Assert.assertTrue(isDisplayed(element));
    }

    protected void checkElementIsDisplayedWithText(WebElement element, String expectedText) {
        Assert.assertTrue(isDisplayed(element));
        String actualText = element.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    protected void checkInputFieldIsDisplayedWithText(WebElement inputField, String expectedText) {
        Assert.assertTrue(isDisplayed(inputField));
        String actualText = inputField.getAttribute("value");
        Assert.assertEquals(actualText, expectedText);
    }

    protected void checkDropdownIsEnabledWithOption(Select dropdown, boolean isEnabled, String expectedOption) {
        boolean actualEnabledState = dropdown.getWrappedElement().isEnabled();
        Assert.assertEquals(actualEnabledState, isEnabled);
        WebElement actualOption = (isEnabled) ? dropdown.getFirstSelectedOption() : dropdown.getOptions().get(0);
        Assert.assertEquals(actualOption.getText(), expectedOption);
    }

    private boolean isDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException nsee) {
            return false;
        }
    }

}
