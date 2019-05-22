package Amazon;

import PageObjects.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDefs {

    HomePage homePage= new HomePage();

    @Given("^User is on home page$")
    public void user_is_on_home_page() throws Throwable {
    }

    @When("^User searches for a book$")
    public void user_searches_for_a_book() throws Throwable {

    }

    @When("^User clicks add to basket$")
    public void user_clicks_add_to_basket() throws Throwable {
        homePage.userShouldBeAbleToBuyABook();

    }

    @Then("^User should see the same book is in the basket$")
    public void user_should_see_the_same_book_is_in_the_basket() {
        homePage.verifyBookIsInCart();
    }

}
