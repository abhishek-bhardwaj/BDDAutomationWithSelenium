package singup.Product.automationWorld.StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import singup.Product.automationWorld.*;

import java.util.Properties;


public class Newsletter {
    Browser browser;
    WebDriver driver;
    Properties prop;
    String salstr;

    Hooks hooks;
    Repo repo;
    public Newsletter(Browser browser)
    {
        this.browser = browser;
        driver = browser.getDriver();
        repo = new Repo(driver);
        hooks = new Hooks(repo);
    }

    @Given("^When User is on home page$")
    public  void whenUserIsOnHomePage ()
    {
        driver = browser.getDriver();
        prop = browser.getProp();
        driver.get(prop.getProperty("Homepage"));
        repo.ClickmodelClose().click();
        salstr=hooks.GenerateEmail();

    }

    @When("^Valid email id is entered and signUp button clicked$")
    public void validEmailIdIsEnteredAndSignUpButtonClicked()
    {
        try{
            Thread.sleep(10000);
        }catch (Exception e){

        }
        WebElement newsletterTexbox=repo.getNewsletterTextBox();
        newsletterTexbox.sendKeys(salstr+"@yopmail.com");
        try{
            Thread.sleep(5000);
        }catch (Exception e){

        }
        repo.ClicksignupNL().click();

    }

    @Then("^Successful message should appear and user should get Email$")
    public void successfulMessageShouldAppearAndUserShouldGetEmail()
    {


        String nlSuccessMessage=repo.getSuccessAlert().getText();
        System.out.println(nlSuccessMessage+"Hi");
//        Assert.assertEquals(prop.getProperty("HPNLSuccessMessage",nlSuccessMessage));
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL,"t");
        driver.get(prop.getProperty("Yopmail"));
        WebElement idYopMail=repo.getemailYopmail();
        idYopMail.sendKeys(salstr);
        repo.clickcheckInbox().click();

    }

}
