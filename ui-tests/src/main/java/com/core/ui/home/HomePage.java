package com.core.ui.home;

import com.codeborne.selenide.Selenide;
import com.core.ui.modules.HeaderTopModule;
import io.qameta.allure.Step;

@SuppressWarnings("JavadocType")
public class HomePage extends HeaderTopModule {

    @Step
    public static HomePage open() {
        return Selenide.open("/", HomePage.class);
    }
}
