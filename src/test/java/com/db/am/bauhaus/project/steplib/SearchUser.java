package com.db.am.bauhaus.project.steplib;

import com.db.am.bauhaus.project.pages.MainSearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

/**
 * Created by ongshir on 05/10/2016.
 */
public class SearchUser {

    MainSearchPage mainSearchPage;

    String searchText = "craft";
    String productCategoryName = "Rugs";
    String pageTitle = "Home & Living | Etsy UK";

    @Step
    public void search_from_input_box() {
        mainSearchPage.searchFromInputBox(searchText);
    }

    @Step
    public void verify_result_for_all_categories() {
        assertThat(mainSearchPage.getAllCategoriesHeader(), containsString(searchText));
    }

    @Step
    public void click_on_a_menu_bar() {
        mainSearchPage.searchFromCategoryMenu();
    }

    @Step
    public void clink_on_category_icon_for_home_living() {
        mainSearchPage.searchFromIconMenu();
    }

    @Step
    public void verify_result_for_selected_category() {
        assertThat(mainSearchPage.getSelectedProductCategoryHeader(), containsString(productCategoryName));
    }

    @Step
    public void navigates_to_product_page() {
        assertThat(mainSearchPage.getTitle(), containsString(pageTitle));

    }
}
