package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class EntryAdPage {

    private WebDriver driver;
    private By modalWindowHeader = By.xpath("//*[@class='modal-title']/h3");
    private By modalWindowFooterButton = By.cssSelector(".modal-footer > p");
    private By entryAdText = By.cssSelector(".example h3");


    public EntryAdPage (WebDriver driver){
        this.driver = driver;
    }

    public String getModalWindowText(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindowHeader)));
         return driver.findElement(modalWindowHeader).getText();


    }
    public void clickModalWindow(){
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalWindowFooterButton)));
        driver.findElement(modalWindowFooterButton).click();

    }
    public String getEntryAdText(){
        return driver.findElement(entryAdText).getText();

    }

}
