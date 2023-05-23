package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
    Properties prop;
    public ConfigDataProvider() {
        File src = new File("src/test/java/Config/Config.properties");

        try {
            FileInputStream fis = new FileInputStream(src);
            prop=new Properties();
            prop.load(fis);
        }
        catch (Exception e) {
            System.out.println("Not able to load config file"+e.getMessage());
        }

    }

    public String getBrowser(){
        return prop.getProperty("Browser");
    }
    public String getUrl(){
        return prop.getProperty("url");
    }
    public String getProductName(){
        return prop.getProperty("ProductName");
    }
}
