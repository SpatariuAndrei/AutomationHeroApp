package base;

import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver();
     //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();





    }
    @BeforeMethod
    public void goHome(){
        driver.get("http://the-internet.herokuapp.com/");

    }


    @AfterClass
    public void driverQuit(){

        driver.quit();
    }


}
