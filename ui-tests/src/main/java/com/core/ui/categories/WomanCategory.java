package com.core.ui.categories;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@SuppressWarnings("JavadocType")
public class WomanCategory {
    
    public SelenideElement womanTopBlockMenuItem = $("div#block_top_menu > ul > li:nth-child(1)");
    public SelenideElement contentSceneTitle = $("div.cat_desc > span");

    @Step
    public static WomanCategory open() {
        return Selenide.open("index.php?id_category=3&controller=category", WomanCategory.class);
    }
}
