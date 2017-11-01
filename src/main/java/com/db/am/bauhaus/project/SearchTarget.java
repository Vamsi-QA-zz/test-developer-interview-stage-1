package com.db.am.bauhaus.project;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

/**
 * Created by ongshir on 06/04/2017.
 */
public class SearchTarget {
    public final static Target INPUT_BOX = Target.the("the search input box").located(By.id("search-query"));
    public final static Target INPUT_BOX_BUTTON = Target.the("the search input button").located(By.cssSelector("button.btn.btn-primary"));
    public final static Target ALL_CATEGORIES_HEADER = Target.the("the all categories header").located(By.cssSelector("h1.display-inline.text-smaller"));
}
