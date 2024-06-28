package library.cv.pages;

import library.cv.browserfactory.ManageBrowser;
import library.cv.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {
    private static final Logger log = Logger.getLogger(HomePage.class.getName());
    /*
    Locators - resultText
  Method - verifyTheResults(String expected)

     */
    @CacheLookup
    @FindBy(css = ".search-header__title")
    WebElement resultText;

    public String verifyResult() {
        return getTextFromElement(resultText);
    }

    //cookies
    @CacheLookup
    @FindBy(xpath = "//button[@id='save']/span/div/span[text()='Accept All']")
    WebElement acceptCookies;

    public void accpetCookies() {
        ManageBrowser.driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptCookies);
        ManageBrowser.driver.switchTo().defaultContent();
    }
}