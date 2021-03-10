package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By fileUploadButton = By.id("file-submit");
    private By chooseFileButton = By.id("file-upload");
    private By uploadedElement = By.id("uploaded-files");


    public FileUploadPage (WebDriver driver){
        this.driver = driver;
    }


    public void clickUploadButton(){
        driver.findElement(fileUploadButton).click();


    }

    public void uploadFile (String pathElement){
        driver.findElement(chooseFileButton).sendKeys(pathElement);
        clickUploadButton();


    }


    public String getUploadedElement(){
      return   driver.findElement(uploadedElement).getText();


    }
}
