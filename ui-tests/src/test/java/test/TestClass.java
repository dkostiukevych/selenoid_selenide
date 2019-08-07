package test;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import test.utils.provider.BaseProvider;

@ExtendWith(BaseProvider.class)
@SuppressWarnings("JavadocType")
public class TestClass {
    
    private static final String BASE_URI = "/";

    @Test
    public void testName() {
        Selenide.open(BASE_URI);
    }

    @Test
    public void test2() {
        Selenide.open(BASE_URI);
    }

    @Test
    public void test3() {
        Selenide.open(BASE_URI);
    }
}
