package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.time.Duration;

public class BrowserFactory {

    public static WebDriver startApplication(WebDriver ldriver, String browserName, String appURL){
        if(browserName.equals("CHROME")){
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriverManager.chromedriver().setup();
           ldriver=new ChromeDriver();
        }
        else if (browserName.equals("FIREFOX")){
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriverManager.firefoxdriver().setup();
            ldriver=new FirefoxDriver();
                    }
        else if (browserName.equals("IE")){
            System.setProperty("webdriver.http.factory", "jdk-http-client");
            WebDriverManager.iedriver().setup();
            ldriver=new InternetExplorerDriver();
        }
        else{
            System.out.println("we do not support this browser");
        }
        ldriver.manage().window().maximize();
        ldriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        ldriver.manage().deleteAllCookies();
        ldriver.get(appURL);
        return ldriver;

    }

    public static void quitBrowser(WebDriver driver){
        driver.quit();

    }

}
