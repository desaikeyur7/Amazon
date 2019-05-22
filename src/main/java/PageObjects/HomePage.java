package PageObjects;

import Amazon.Utils;
import org.openqa.selenium.By;

import javax.rmi.CORBA.Util;

public class HomePage extends Utils {

    private By _searchField = By.id("twotabsearchtextbox");
    private By _searchButton = By.cssSelector("[value='Go']");
    private By _furiouslyHappyBook = By.cssSelector("[data-component-id='8']");
    private By _addToCartButton = By.id("add-to-cart-button");
    private By _cartButton = By.id("hlb-view-cart-announce");
    private By _bookInCart = By.cssSelector("[class='a-size-medium sc-product-title a-text-bold']");


    public void userShouldBeAbleToBuyABook(){

        // type book name in search field and click on search
        driver.findElement(_searchField).sendKeys("comedy books best sellers");
        Utils.waitForElementDisplay(_searchButton, 10);
        Utils.myClick(_searchButton);

        // select book to buy
        Utils.waitForElementDisplay(_furiouslyHappyBook,5);
        Utils.myClick(_furiouslyHappyBook);
        Utils.myClick(_addToCartButton);
        Utils.myClick(_cartButton);
        Utils.waitForElementDisplay(_bookInCart,5);
    }

    public void verifyBookIsInCart(){
        Utils.assertTextOfElement("Furiously Happy: A Funny Book About Horrible Things", _bookInCart);
    }
}


