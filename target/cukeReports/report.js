$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Amazon/PurchaseBook.feature");
formatter.feature({
  "line": 1,
  "name": "Book purchase journey for a user",
  "description": "",
  "id": "book-purchase-journey-for-a-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7829517000,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able to purchase a book",
  "description": "",
  "id": "book-purchase-journey-for-a-user;user-should-be-able-to-purchase-a-book",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User searches for a book",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks add to basket",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should see the same book is in the basket",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_home_page()"
});
formatter.result({
  "duration": 257163000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_searches_for_a_book()"
});
formatter.result({
  "duration": 39100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_add_to_basket()"
});
formatter.result({
  "duration": 12131052500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_see_the_same_book_is_in_the_basket()"
});
formatter.result({
  "duration": 97862500,
  "status": "passed"
});
formatter.after({
  "duration": 744275600,
  "status": "passed"
});
});