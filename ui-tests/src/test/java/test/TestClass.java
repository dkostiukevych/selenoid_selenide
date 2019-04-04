package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.core.provider.model.User;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.YamlReader;
import lombok.extern.slf4j.Slf4j;
import one.util.streamex.StreamEx;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

import static io.github.sskorol.data.TestDataReader.use;

@Slf4j
public class TestClass {

    @Test(dataProvider = "getUsersData")
    public void testName(final User user) {

        Selenide.open("/");
        log.info(user.getEmail());
        log.info(user.getPassword());
    }

    @DataSupplier
    public StreamEx<User> getUsersData() {
        Method method = null;
        return use(YamlReader.class)
                .withTarget(User.class)
                .read()
                .filter(u ->
                        u.getRole().equals("ADMIN"));
    }

    @BeforeMethod
    public void setUp() {
        Configuration.timeout = 6000;
        Configuration.browser = "chrome";
    }
}
