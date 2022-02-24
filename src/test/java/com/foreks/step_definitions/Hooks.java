package com.foreks.step_definitions;

import com.foreks.pages.ForeksPages;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Hooks {

    ForeksPages foreksPages = new ForeksPages();

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.VERSION, "8.0");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"\\foreks.android_158_apps.evozi.com.apk");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 20000);
        foreksPages.driver = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);

    }
    @After
    public void tearDown(){
        foreksPages.closeApp();
    }
}
