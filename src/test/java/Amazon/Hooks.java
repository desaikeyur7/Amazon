package Amazon;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils{

    BrowserSelector browserSelector = new BrowserSelector();

    @Before

    public void openBrowser(){
        browserSelector.setUpBrowser("chrome");
        driver.get("https://www.amazon.com/");
    }

    @After

    public void teatDownBrowser(){
        driver.quit();
    }
}
