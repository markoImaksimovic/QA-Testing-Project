package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;
import utilities.PropertyManager;

public class BaseTest {

    protected WebDriver driver;

    protected void fireFox(){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver(new FirefoxOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));
    }
    protected void chrome(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(new ChromeOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));
    }

    protected void edge(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver(new EdgeOptions().addArguments("--disable-notifications").addArguments("--start-maximized"));
    }

    @BeforeMethod

    public void setup(){

        chrome();
        driver.get(PropertyManager.getInstance().getUrl());}

        @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
