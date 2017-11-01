package com.db.am.bauhaus.project.steps;

import org.junit.runners.Suite;
import io.restassured.response.Response;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.junit.runners.SerenityRunner;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Step;

public class RestSteps {

    private static String API = "https://www.etsy.com";
    private static Response response;

    @When("^the current locale is up$")
    public void the_current_locale_is_up() {
        response = SerenityRest.when().get(API);
        response.then().statusCode(200);
    }

    @Then("^the \"([^\"]*)\" service must be available$")
    public void the_must_be_available(String endpoint){
        response = SerenityRest.when().get(API+endpoint );
        response.then().statusCode(200);
    }


}