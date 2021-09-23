package singup.Product.automationWorld;

import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.UrlChecker;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import singup.Product.automationWorld.*;
import singup.Product.automationWorld.Hooks;
import singup.Product.automationWorld.Repo;
import org.apache.poi.hssf.usermodel.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


public class Hooks {

    WebDriver driver;
    Properties prop;
    Repo repo;
    Browser browser;

    public Hooks(Repo repo) {
        this.repo = repo;

    }

   public void logIn(WebDriver driver, Properties prop) 
   {
       driver.get(prop.getProperty("logIn"));
   driver.manage().window().maximize();
       WebElement username = repo.getSignInUsername();
        username.sendKeys(prop.getProperty("username"));
       WebElement password = repo.getSignInPassword();
        password.sendKeys(prop.getProperty("password"));
        WebElement logIn= repo.ClicklogIn();
        logIn.click();
      WebElement lo = repo.ClicklogIn();
      logIn.click();
   }
//     try 
//     {
//            Thread.sleep(5000);
//        } 
//     catch (Exception e)
//     {}
//
//        }
//        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//    }

//    public static void ExplicitWaitForElement(WebDriver driver, int time, By element) {
//        (new WebDriverWait(driver, time)).until(ExpectedConditions.visibilityOfElementLocated('element'));
//
  // 
        	


    public String GenerateEmail() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6)
        { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        String salstr = saltStr.toLowerCase();
        StringSelection selec = new StringSelection(salstr);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selec, selec);
        return salstr;
    }


    public void ValidateYopmail() {
        String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, "t");
        driver.get(prop.getProperty("Yopmail"));
        try {
            Thread.sleep(10000);
        } catch (Exception e) {

        }
        WebElement idYopMail = repo.getemailYopmail();
        idYopMail.sendKeys(Keys.chord(Keys.CONTROL, "v"));
        repo.clickcheckInbox().click();

    }

//    public void createExcelReport(WebDriver driver, Properties prop)
//    {
//
//
//
//    }
//
//    public void searchAirlines (WebDriver driver, Properties prop)
//    {
//
//    }

    public void flightSearch(WebDriver driver, Properties prop)
    {
        WebElement OnewayBtn=repo.Btnoneway();
        OnewayBtn.click();
        WebElement ToLocation=repo.getToLocation();
        ToLocation.sendKeys("Las");
        WebElement FromLocation=repo.getFromLoaction();
        FromLocation.sendKeys("Lax");

//        now = Calendar.getInstance();
//        now.add(Calendar.DATE, +50);
//        String FromDate =(now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DATE) + "/" + now.get(Calendar.YEAR);


    }


}

