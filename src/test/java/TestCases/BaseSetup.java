package TestCases;

import Utilities.BrowserFactory;
import Utilities.ConfigDataProvider;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseSetup {

    public WebDriver driver;
    public ConfigDataProvider config;
    @BeforeSuite
    public void setSuite(){
        config=new ConfigDataProvider();

    }
    @BeforeClass
    public void init() {
        driver= BrowserFactory.startApplication(driver, config.getBrowser(), config.getUrl());
   }
//    @AfterClass
//    public void teardown() {
//        BrowserFactory.quitBrowser(driver);
//    }
}
