package test.driver.provider;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class SelenoidDriverProvider implements WebDriverProvider {
    
    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {
        
        DesiredCapabilities browserCapabilities = new DesiredCapabilities();
        browserCapabilities.setBrowserName("chrome");
        browserCapabilities.setVersion("72");
        browserCapabilities.setCapability("enableVNC", true);
        
        try {
            RemoteWebDriver driver = new RemoteWebDriver(
                    URI.create("").toURL(), browserCapabilities
            );
            driver.manage().window().setSize(new Dimension(1920, 1080));
            return driver;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}
