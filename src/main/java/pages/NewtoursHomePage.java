package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewtoursHomePage extends BasePage {
    public NewtoursHomePage(WebDriver driver) {
        super(driver);
    }

    ///Locators
    @FindBy(linkText = "SIGN-ON")
    private WebElement signOnLinkLocator;
    @FindBy(linkText = "REGISTER")
    private WebElement registerLinkLocator;
    @FindBy(linkText = "SUPPORT")
    private WebElement supportLinkLocator;
    @FindBy(linkText = "CONTACT")
    private WebElement contactLinkLocator;
    @FindBy(linkText = "Flights")
    private WebElement flightsLinkLocator;
    @FindBy(linkText = "Hotels")
    private WebElement hotelsLinkLocator;

    /////////////////////////////******************************/////////////////////////////
    //Methods to perform actions on the locators
    public void ClickOnFlightsLink() {
        flightsLinkLocator.click();
    }

    public void ClickOnSignOnLink() {
        signOnLinkLocator.click();
    }

    public void ClickOnRegisterLink() {
        registerLinkLocator.click();
    }

    public void ClickOnContactLink() {
        contactLinkLocator.click();
    }

    public void ClickOnHotelLink() {
        hotelsLinkLocator.click();
    }
}
