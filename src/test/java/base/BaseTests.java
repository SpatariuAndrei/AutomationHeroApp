package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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
    private String headless = System.getenv("HEADLESS");



    @BeforeClass
    public void setUp() {



        ChromeOptions options = new ChromeOptions();
        if (null != headless ){
            if (headless.equals(true)){
                options.addArguments("--headless");
                options.addArguments("--disable-gpu");
                options.addArguments("start-maximized"); // open Browser in maximized mode
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                options.addArguments("--disable-gpu"); // applicable to windows os only
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("--no-sandbox"); // Bypass OS security model
                options.addArguments("window-size=1920,1080");
            }
        }
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver(options);
        //   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        homePage = new HomePage(driver);
        driver.manage().window().maximize();


    }

    @BeforeMethod
    public void goHome() {
        driver.get("http://the-internet.herokuapp.com/");

    }


   /*@AfterClass
    public void driverQuit() {
        if (driver != null) {
            driver.quit();

        }*/


    //}
}
