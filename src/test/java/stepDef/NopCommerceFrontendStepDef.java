package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class NopCommerceFrontendStepDef extends BaseUtil {
    private BaseUtil base;
    public NopCommerceFrontendStepDef(BaseUtil base){this.base = base;}

    @Given("I am on the {string} website")
    public void i_am_on_the_website(String url) {
     base.driver.manage().window().maximize();
     base.driver.get(url);
    }
    @When("I navigate to Desktops screen")
    public void i_navigate_to_desktops_screen() throws InterruptedException {
       List<WebElement> ComputerMenu = base.driver.findElements(By.xpath("//a[contains(text(),'Computers')]"));

        Actions actionProvider = new Actions(base.driver);
        actionProvider.moveToElement(ComputerMenu.get(0)).build().perform();
        Thread.sleep(5000);
        List<WebElement> DesktopMenu = base.driver.findElements(By.partialLinkText("Desktops"));
        DesktopMenu.get(0).click();


    }
    @When("I choose {string}")
    public void i_choose(String string) {
    base.driver.findElement(By.linkText("Build your own computer")).click();
    }
    @When("I click Add to cart button without choosing RAM size and HDD capacity")
    public void i_click_add_to_cart_button_without_choosing_ram_size_and_hdd_capacity() {
    base.driver.findElement(By.id("add-to-cart-button-1")).click();
    }
    @Then("error messages {string} and {string} are displayed")
    public void error_messages_and_are_displayed(String error1, String error2) throws InterruptedException {
        Thread.sleep(4000);
   assertThat(base.driver.findElement(By.xpath("//p[contains(text(),'"+error1+"')]")).isDisplayed(), equalTo(true));
        assertThat(base.driver.findElement(By.xpath("//p[contains(text(),'Please select HDD')]")).isDisplayed(), equalTo(true));
    }
    @When("I choose {int} GB Ram and {int} GB HDD")
    public void i_choose_gb_ram_and_gb_hdd(Integer int1, Integer int2) {
   Select select = new Select(base.driver.findElement(By.cssSelector("select#product_attribute_2")));
   select.selectByVisibleText("2 GB");
   base.driver.findElement(By.cssSelector("input#product_attribute_3_6")).click();

    }
    @When("I click Add to cart button")
    public void i_click_add_to_cart_button() {
//        base.driver.findElement(By.id("add-to-cart-button-1")).click();
        i_click_add_to_cart_button_without_choosing_ram_size_and_hdd_capacity();
    }
    @Then("{string} message is displayed")
    public void message_is_displayed(String msg) {
        System.out.println(base.driver.findElement(By.cssSelector("p.content")));
    }
}
