package com.foreks_mobile.pages;

import com.foreks_mobile.utulities.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
