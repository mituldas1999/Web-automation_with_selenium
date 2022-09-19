package sqa.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class driverSetup {
    public static WebDriver driver;

    @BeforeSuite
    public static void setDriver(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }
    @AfterSuite
    public static void killDriver(){
        driver.close();
    }
}
