package test.utils.provider;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import java.util.logging.Logger;

import static com.core.utils.Color.ANSI_RESET;
import static com.core.utils.Color.ANSI_YELLOW;
import static java.lang.System.identityHashCode;
import static java.lang.System.setProperty;
import static java.lang.Thread.currentThread;

@SuppressWarnings("JavadocType")
public class BaseProvider implements BeforeEachCallback {
    
    private static final String TRUE = "true";
    private final Logger log = Logger.getLogger(BaseProvider.class.getName());
    
    static {
        Configuration.timeout = 6000;
        Configuration.browser = "chrome";
        Configuration.headless = true;

        setProperty("webdriver.chrome.silentLogging", TRUE);
        setProperty("webdriver.chrome.silentOutput", TRUE);
    }

    @Override
    public void beforeEach(final ExtensionContext context) throws Exception {
        log.info("### @BeforeEach" + ANSI_YELLOW
                + " THREAD ID: " + currentThread().getId() + ANSI_RESET
                + " for test instance ID: " + identityHashCode(this)); 
    }
}
