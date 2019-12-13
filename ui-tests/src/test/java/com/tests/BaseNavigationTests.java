package com.tests;

import com.core.ui.categories.DressesCategory;
import com.core.ui.categories.TShirtCategory;
import com.core.ui.categories.WomanCategory;
import com.core.ui.home.HomePage;
import com.tests.utils.provider.BaseProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.core.ui.PageFactory.at;

@ExtendWith(BaseProvider.class)
@SuppressWarnings("JavadocType")
public class BaseNavigationTests {
    
    private final String classAttribute = "class";
    private final String selectedCssValue = "sfHoverForce";
    
    @Test
    @DisplayName("The user is able to open \"HOME\" main page.")
    public void canOpenHomePage() {

        HomePage.open();
        
        at(HomePage.class).siteLogo
                .shouldBe(visible);
        
    }

    @Test
    @DisplayName("The user is able to open \"WOMAN\" category")
    public void canOpenWomanCategory() {

        WomanCategory.open();
        
        at(WomanCategory.class)
                .womanTopBlockMenuItem.shouldHave(attribute(classAttribute, selectedCssValue));
        at(WomanCategory.class)
                .contentSceneTitle.shouldBe(visible);
        
    }

    @Test
    @DisplayName("The user is able to open \"DRESSES\" category.")
    public void canOpenDressCategory() {

        DressesCategory.open();

        at(DressesCategory.class)
                .dressesTopBlockMenuItem.shouldHave(attribute(classAttribute, selectedCssValue));
        at(DressesCategory.class)
                .contentSceneTitle.shouldBe(visible);
    }

    @Test
    @DisplayName("The user is able to open \"T-SHIRT\" category.")
    public void canOpenTShirtCategory() {

        TShirtCategory.open();

        at(TShirtCategory.class)
                .dressesTopBlockMenuItem.shouldHave(attribute(classAttribute, selectedCssValue));
        at(TShirtCategory.class)
                .contentSceneTitle.shouldBe(visible);
        
    }
}
