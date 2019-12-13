package com.core.ui.modules;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@SuppressWarnings("JavadocType")
public class HeaderTopModule {

    public SelenideElement siteLogo = $("[alt='My Store']");
    public SelenideElement searchInput = $("[placeholder=\"Search\"]");
    
    @Step
    public void performSearch(String searchQuery) {
        searchInput.setValue(searchQuery);
        searchInput.pressEnter();
    }
}
