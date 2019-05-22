Feature: Book purchase journey for a user

  @test
  Scenario: User should be able to purchase a book
    Given User is on home page
    When User searches for a book
    And User clicks add to basket
    Then User should see the same book is in the basket