package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class Utils extends BasePage {

    public static void myClick(By by){
        driver.findElement(by).click();
    }

    public static void waitForElementDisplay(By by, int time) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, time);
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Locator OR Element is not present within the given wait time: " + by);
            throw (e);
        }
    }

    public static void assertTextOfElement(String expected, By by) {
        try {
            String actual = driver.findElement(by).getText();
            Assert.assertEquals(expected, actual);
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Locator OR Element or Text in element is not present: " + by);
            throw (e);
        }
    }
}
