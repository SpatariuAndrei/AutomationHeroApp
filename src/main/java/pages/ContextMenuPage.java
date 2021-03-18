package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {

    private WebDriver driver;
    private By contextBox = By.id("hot-spot");


    public ContextMenuPage (WebDriver driver){
        this.driver = driver; }


    public void clickContextBox(){
       WebElement elem =  driver.findElement(contextBox);

       int width = elem.getSize().getWidth();

        Actions act = new Actions(driver);
        act.moveToElement(elem).moveByOffset((width/2), 0).contextClick().perform();
    }

    public String getPopUpText(){
        return driver.switchTo().alert().getText();

    }
    public void acceptPopUp(){
        driver.switchTo().alert().accept();

    }

}
