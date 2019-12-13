package com.core.ui.categories;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

@SuppressWarnings("JavadocType")
public class TShirtCategory {

    public SelenideElement dressesTopBlockMenuItem = $("div#block_top_menu > ul > li:nth-child(3)");
    public SelenideElement contentSceneTitle = $("div.cat_desc > span");

    @Step
    public static TShirtCategory open() {
        return Selenide.open("index.php?id_category=5&controller=category", TShirtCategory.class);
    }
    
}
