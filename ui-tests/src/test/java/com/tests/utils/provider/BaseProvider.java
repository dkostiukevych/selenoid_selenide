package com.tests.utils.provider;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.logging.Logger;

import static com.core.utils.Color.ANSI_RESET;
import static com.core.utils.Color.ANSI_YELLOW;
import static java.lang.System.identityHashCode;
import static java.lang.Thread.currentThread;

@SuppressWarnings("JavadocType")
public class BaseProvider implements BeforeEachCallback, BeforeAllCallback {
    
    private static final String BASE_URL = "http://automationpractice.com/";
    
    private final Logger log = Logger.getLogger(BaseProvider.class.getName());

    @Override
    public void beforeAll(ExtensionContext context) throws Exception {
        
        Configuration.baseUrl = BASE_URL;
        Configuration.startMaximized = true;
       
    }
    
    @Override
    public void beforeEach(final ExtensionContext context) throws Exception {
        log.info("### @BeforeEach" + ANSI_YELLOW
                + " THREAD ID: " + currentThread().getId() + ANSI_RESET
                + " for test instance ID: " + identityHashCode(this));
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide()
                .screenshots(true));
    }
}
