package org.example.pages;

import org.example.utils.WebDriverProvider;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    BasePage() {
        PageFactory.initElements(WebDriverProvider.getDriver(), this);
    }

}
