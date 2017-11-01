package com.db.am.bauhaus.project.pages;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebDriver;

/**
 * Created by ongshir on 05/10/2016.
 */
@DefaultUrl("/")
public class MainSearchPage extends PageObject {

    @FindBy(id = "search-query")
    WebElementFacade inputBox;

    @FindBy(css = "button.btn.btn-primary")
    WebElementFacade searchButton;

    @FindBy(id = "catnav-primary-link-891")
    WebElementFacade menuBar;

    @FindBy(id = "catnav-l3-10969")
    WebElementFacade submenuBar;

    @FindBy(xpath = "//*[@id=\"content\"]/div[4]/div/span/div/div/div/div[1]/a")
    WebElementFacade iconMenu;

    public MainSearchPage(WebDriver driver) {
        super(driver);
    }

    public void searchFromInputBox(String searchText) {
        inputBox.waitUntilPresent().sendKeys(searchText);
        searchButton.click();
    }

    public String getAllCategoriesHeader() {
        return find(By.cssSelector("h1.display-inline.text-smaller")).getText();
    }

    public String getSelectedProductCategoryHeader() {
        return find(By.tagName("h1")).getText();
    }

    public void searchFromCategoryMenu() {
        menuBar.click();
        submenuBar.waitUntilPresent().click();
    }

    public void searchFromIconMenu() { iconMenu.waitUntilPresent().click();
    }

}
