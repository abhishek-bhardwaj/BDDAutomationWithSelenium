package singup.Product.automationWorld;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Repo {
     WebDriver driver;
    public Repo(WebDriver driver)
    {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "sign_in_username")
    private WebElement signInUsername;

    public WebElement getSignInUsername()
    {
        return signInUsername;
    }

    @FindBy(id = "sign_in_password")
    private WebElement signInPassword;

    public WebElement getSignInPassword()
    {
        return signInPassword;
    }

    @FindBy(name = "commit")
    private WebElement commit;

    public WebElement getogIn()
    {
        return commit;
    }

    @FindBy (xpath="//*[@id=\"apps\"]/li[16]/a")
   private WebElement logIn;

    public WebElement ClicklogIn()
    {
        return logIn;
    }

   @FindBy (xpath = "//*[@id=\"ember1050\"]/div[2]/div/section/header/div/a")
   private WebElement modelClose;

    public WebElement ClickmodelClose()
    {
        return modelClose;
    }
    @FindBy (id = "ember1005")
    private WebElement newsletterTextBox;

    public WebElement getNewsletterTextBox()
    {
        return newsletterTextBox;
    }

    @FindBy (xpath = "//*[@id=\"ember1008\"]/button")
    private WebElement signupNL;

    public WebElement ClicksignupNL()
    {
        return signupNL;
    }

    @FindBy(css = "div[id='ember1003']>div>div>span")
    private WebElement successAlert;

    public WebElement getSuccessAlert()
    {
        return successAlert;
    }

    @FindBy (id = "login")
    private WebElement emailYopmail;

    public WebElement getemailYopmail()
    {
        return emailYopmail;
    }

    @FindBy (className = "sbut")
    private WebElement checkInbox;

    public WebElement clickcheckInbox()
    {
        return checkInbox;
    }

//    @FindBy (id = "ember748")
//    private WebElement airFrom;
//
//    public WebElement getAirFrom()
//    {
//        return airFrom;
//    }
//
//    @FindBy (id = "ember753")
//    private WebElement airTo;
//
//    public WebElement getAirTo()
//    {
//        return airTo;
//    }

    @FindBy (css = "div[class='col-xs-12']>input[placeholder='From']")
    private WebElement fromLoaction;
    public WebElement getFromLoaction()
    {
        return fromLoaction;
    }
    @FindBy (css = "div[class='col-xs-12']>input[placeholder='To']")
    private WebElement toLocation;
    public WebElement getToLocation()
    {
        return toLocation;
    }

    @FindBy (css = "div[class='col-xs-12']>section>div>ul>li:nth-child(3)")
    private WebElement selectLocation;
    public WebElement getSelectLocation()
    {
        return selectLocation;
    }

    @FindBy(id="departCalendar_0")
    private WebElement DepartDate;
    public WebElement DepartDate()
    {
        return DepartDate;
    }

    //arrivalCalendar_0

    @FindBy(id="arrivalCalendar_0")
    private WebElement ArrivaltDate;
    public WebElement ArrivaltDate()
    {
        return ArrivaltDate;
    }

    @FindBy(id="owFlight")
    private WebElement Btnoneway;
    public WebElement Btnoneway()
    {
        return Btnoneway;
    }
}
