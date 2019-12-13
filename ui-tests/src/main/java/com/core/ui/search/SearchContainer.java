package com.core.ui.search;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@SuppressWarnings("JavadocType")
public class SearchContainer {
    
    public SelenideElement productNotFoundMsg 
            = $x("//p[contains(.,'No results were found for your search')]");
    public ElementsCollection searchResultsEl = $$x("//ul[@class=\"product_list grid row\"]/li");
}
