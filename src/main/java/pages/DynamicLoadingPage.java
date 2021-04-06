package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By example1Link = By.xpath("//a[contains(text(), 'Example 1')]");
    private By startButton = By.cssSelector("#start button");
    private By loadingBar = By.id("loading");
    private By loadedText = By.id("finish");


    public DynamicLoadingPage (WebDriver driver){ this.driver = driver; }

    public DynamicLoadingPage clickExample1(){
        driver.findElement(example1Link).click();
        return new DynamicLoadingPage(driver);


    }
    public void clickStartButton(){
        driver.findElement(startButton).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingBar)));


    }
    public String getLoadingText (){

       return    driver.findElement(loadedText).getText();

    }

}