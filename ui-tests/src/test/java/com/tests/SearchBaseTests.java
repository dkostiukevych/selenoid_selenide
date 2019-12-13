package com.tests;

import com.codeborne.selenide.Condition;
import com.core.ui.home.HomePage;
import com.core.ui.search.SearchContainer;
import com.tests.utils.provider.BaseProvider;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.core.ui.PageFactory.at;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;

@ExtendWith(BaseProvider.class)
@SuppressWarnings("JavadocType")
public class SearchBaseTests {
    
    @Test
    @DisplayName("The user is able to perform search but isn't able to find any products.")
    public void canNotFindProductInCatalogue() {
        
        HomePage.open();
        
        at(HomePage.class)
                .performSearch("test");
        
        at(SearchContainer.class)
                .productNotFoundMsg.shouldBe(Condition.visible);
                

    }

    @Test
    @DisplayName("The user is able to perform search and get some search results.")
    public void canFindProductInCatalogue() {
        
        HomePage.open();

        at(HomePage.class)
                .performSearch("PRINTED");

        final int productsAmount = at(SearchContainer.class)
                .searchResultsEl.size();
        
        assertThat(productsAmount, is(greaterThan(1)));
    }
    
}
