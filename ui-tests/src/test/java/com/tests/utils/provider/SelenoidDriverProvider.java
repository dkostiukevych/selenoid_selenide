package com.tests.utils.provider;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

@SuppressWarnings("JavadocType")
public class SelenoidDriverProvider implements WebDriverProvider {
    
    @Override
    public WebDriver createDriver(final DesiredCapabilities desiredCapabilities) {

        final String wdHubUri = "http://localhost:4444/wd/hub";
        
        final DesiredCapabilities browserCapabilities = new DesiredCapabilities();
        browserCapabilities.setBrowserName("chrome");
        browserCapabilities.setVersion("77");
        browserCapabilities.setCapability("enableVNC", true);
        
        try {
            final RemoteWebDriver driver = new RemoteWebDriver(
                    URI.create(wdHubUri)
                            .toURL(), browserCapabilities
            );
            driver.manage().window().setSize(new Dimension(1920, 1080));
            return driver;
        } catch (MalformedURLException e) {
            throw new Error(e);
        }
    }
}
