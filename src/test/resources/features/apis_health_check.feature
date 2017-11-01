Feature: APIs health check

Scenario Outline: A sanity test to esure all the APIs are up and running
   Given the current locale is up
   Then the "<Service>" service must be available

   Examples:
     |Service|
     |/listing|
     |/signin|
     |/sell|
     |/shop_name_search_service|
     |/search|
     |/cart|


