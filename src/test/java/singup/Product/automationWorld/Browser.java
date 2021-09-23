package singup.Product.automationWorld;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Browser {
    WebDriver driver;
    Properties prop = new Properties();
    InputStream input;

    @Before
    public void setUp() {
    	
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhishek.bhardwaj1\\Downloads\\SignUps\\SignUps\\chromedriver.exe");
        driver = new ChromeDriver();

        try {
            input = new FileInputStream("C:\\Users\\abhishek.bhardwaj1\\Downloads\\SignUps\\SignUps\\src\\test\\Resources\\singup\\prod\\automationWorld\\Config.properties");
            prop.load(input);
        } catch(IOException e)
        {
            System.out.println("Invalid Path");
        }

        new Repo(driver);



}

    public WebDriver getDriver() {
        return driver;
    }

    public Properties getProp() {
        return prop;
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}


