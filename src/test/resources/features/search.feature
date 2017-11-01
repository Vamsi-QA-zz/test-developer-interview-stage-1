Feature: Sample

  Background:
   Given John is viewing the Etsy landing page

  @ui @pageobject
  Scenario: Should be able to search for a product from the input box
    When he searches for a product from the input box
    Then the result should be displayed

  @ui @pageobject
  Scenario: Should be able to search for a product from the drop-down menu
    When he searches for a particular product from the drop-down menu
    Then matching products must be displayed

  @ui @pageobject
  Scenario: Should be able to search for a product from the icons
     When he searches for a particular product from the icons menu
     Then current page must be the landing page for the product selected

