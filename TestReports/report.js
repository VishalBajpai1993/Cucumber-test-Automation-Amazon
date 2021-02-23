$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "End to End Functional Test",
  "description": "Product search and purchase from amazon.in\nUser wants to search for Product and purchase from amazon.in\nValidation criteria : User should be logged in to check out the product",
  "id": "end-to-end-functional-test",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he search for \"\u003cproduct\u003e\" under category \"\u003ccategory\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Apply multiple filters",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Get total number of search results as output",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Get the discount offered by seller for first two page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should be asked to login before checkout",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;",
  "rows": [
    {
      "cells": [
        "product",
        "category"
      ],
      "line": 18,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;1"
    },
    {
      "cells": [
        "Dell Laptop",
        "Electronics"
      ],
      "line": 19,
      "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 19,
  "name": "Product Search and add to shopping cart",
  "description": "",
  "id": "end-to-end-functional-test;product-search-and-add-to-shopping-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "user is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "he search for \"Dell Laptop\" under category \"Electronics\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Apply multiple filters",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Get total number of search results as output",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Get the discount offered by seller for first two page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "choose to buy the first item",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Add product to shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User clicks on shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Cliks on proceed to check out",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User should be asked to login before checkout",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.userIsOnHomePage()"
});
formatter.result({
  "duration": 9214734400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dell Laptop",
      "offset": 15
    },
    {
      "val": "Electronics",
      "offset": 44
    }
  ],
  "location": "Steps.heSearchForUnderCategory(String,String)"
});
formatter.result({
  "duration": 3254437500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.apply_multiple_filters()"
});
formatter.result({
  "duration": 3570712300,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "Steps.chooseToBuyTheFirstItem()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.addsProductToShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.userClicksOnShoppingCart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.userClicksOnProceedCheckOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Steps.enterPersonalDetailsOnLoginPage()"
});
formatter.result({
  "status": "skipped"
});
});