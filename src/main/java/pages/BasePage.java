package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage(WebDriver driver) {
        //Factory class to make using Page Objects simpler and easier.
        //Initializing the elements using initElements()- This is a static method used to initialize the web elements
// that we locate using the @FindBy or other annotation(s), thereby instantiating the page class.
        PageFactory.initElements(driver, this);

    }

    public boolean IsAttributePresent(String attributeName, WebElement ele) {
        boolean result = false;
        try {
            String value = ele.getAttribute(attributeName);
            if (value != null) {
                result = true;
            }
        } catch (Exception e) {
        }
        return result;
    }









}
