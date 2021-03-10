package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
private WebDriver driver;
private By JSAlertsButton = By.xpath("//button[text() ='Click for JS Alert']");
private By JSConfirmButton = By.xpath("//button[text() ='Click for JS Confirm']");
private By JSPromptButton = By.xpath("//button[text() = 'Click for JS Prompt']");
private By AlertResults = By.id("result");

public AlertsPage (WebDriver driver){
    this.driver = driver;
}

public void clickJSAllert (){
    driver.findElement(JSAlertsButton).click();


}
public void clickJSConfirm (){
    driver.findElement(JSConfirmButton).click();


}
public void clickJSPrompt(){
    driver.findElement(JSPromptButton).click();

}
public void acceptAlert(){
    driver.switchTo().alert().accept();



}

public String getJSConfirmAlertText (){
   return driver.switchTo().alert().getText();

}
public String getJSPrompAlertText (){
    return driver.switchTo().alert().getText();


}
public void clickCancelOnJSConfirm(){
    driver.switchTo().alert().dismiss();


}
public String getAlertResult(){
    return driver.findElement(AlertResults).getText();

}
public void insertTextOnJSPrompt(String jsPromptText){
    driver.switchTo().alert().sendKeys(jsPromptText);


}

}
