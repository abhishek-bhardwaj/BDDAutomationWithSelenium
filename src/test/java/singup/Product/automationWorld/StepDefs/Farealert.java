package singup.Product.automationWorld.StepDefs;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import singup.Product.automationWorld.*;

import java.util.Properties;

public class Farealert {
    Browser browser;
    WebDriver driver;
    Properties prop;
    //String salstr;

    Hooks hooks;
    Repo repo;

    public Farealert(Browser browser)
    {
        this.browser = browser;
        driver = browser.getDriver();
        repo = new Repo(driver);
        hooks = new Hooks(repo);
    }

    @Given("^When User is on listing page$")

    public void whenUserIsOnlistingPage()
    {
        driver = browser.getDriver();
        prop = browser.getProp();
       // hooks.Zscalarlogin(driver, prop);
        driver.get(prop.getProperty("Homepage"));
        repo.ClickmodelClose().click();
        hooks.flightSearch(driver, prop);

    }

    @When("^Valid email id is entered and  SignUp button Clicked$")

    public void ValidEmailIdIsEnteredAndSignUpButtonClicked()
    {
        System.out.println("hello");
    }

    @Then("^Successful messages should appear and user should get Email$")

    public void SuccessfulMessagesShouldAppearAndUserShouldGetEmail()
    {
        System.out.println("hi");
    }

}
